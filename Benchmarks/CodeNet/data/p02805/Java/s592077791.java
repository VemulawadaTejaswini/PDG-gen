import java.io.*;
import java.util.*;

class ComplexDouble {
  final double real, imag;
  
  ComplexDouble(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }
  
  ComplexDouble conv() {
    return new ComplexDouble(this.real, -1 * this.imag);
  }
  
  ComplexDouble add(ComplexDouble cd) {
    return new ComplexDouble(this.real + cd.real, this.imag + cd.imag);
  }
  
  ComplexDouble sub(ComplexDouble cd) {
    return new ComplexDouble(this.real - cd.real, this.imag - cd.imag);
  }
  
  ComplexDouble mul(double d) {
    return new ComplexDouble(this.real * d, this.imag * d);
  }
  
  ComplexDouble mul(ComplexDouble cd) {
    double mulReal = this.real * cd.real - this.imag * cd.imag;
    double mulImag = this.real * cd.imag + this.imag * cd.real;
    return new ComplexDouble(mulReal, mulImag);
  }
  
  ComplexDouble div(ComplexDouble cd) {
    return this.mul(cd.conv()).mul(1.0 / cd.norm());
  }
  
  static ComplexDouble polar(double abs, double theta) {
    return new ComplexDouble(abs * Math.cos(theta), abs * Math.sin(theta));
  }
  
  double norm() {
    return this.real * this.real + this.imag * this.imag;
  }
  
  double abs() {
    return Math.hypot(this.real, this.imag);
  }
  
  public String toString() {
    return String.format("(%.3f, %.3f)", real, imag);
  }
}

class Solver {
  final int n;
  final int[][] xys;
  ComplexDouble[] cds;
  
  Solver(int n, int[][] xys) {
    this.n = n;
    this.xys = xys;
  }
  
  private ComplexDouble calculateCenter(int i, int j, int k) {
    ComplexDouble c1 = cds[i];
    ComplexDouble c2 = cds[j];
    ComplexDouble c3 = cds[k];
    ComplexDouble v1 = c1.sub(c3);
    ComplexDouble v2 = c2.sub(c3);
    if (Math.abs(v1.div(v2).imag) < 1e-6) {
      int[] xs = new int[]{xys[i][0], xys[j][0], xys[k][0]};
      int[] ys = new int[]{xys[i][1], xys[j][1], xys[k][1]};
      int xMax = 0;
      int xMin = 10000;
      int yMax = 0;
      int yMin = 10000;
      for (int a = 0; a < 3; a++) {
        xMax = Math.max(xMax, xs[a]);
        xMin = Math.min(xMin, xs[a]);
        yMax = Math.max(yMax, ys[a]);
        yMin = Math.min(yMin, ys[a]);
      }
      double cx = (double)(xMax + xMin) * 0.5;
      double cy = (double)(yMax + yMin) * 0.5;
      return new ComplexDouble(cx, cy);
    }
    
    ComplexDouble t1 = c1.add(c3).mul(0.5);
    ComplexDouble s1 = v1.mul(new ComplexDouble(0, 1));
    ComplexDouble t2 = c2.add(c3).mul(0.5);
    ComplexDouble s2 = v2.mul(new ComplexDouble(0, 1));
    // t1 + x s1 = t2 + y s2
    // x s1 = (t2 - t1) + y s2
    // x s1 / s2 = (t2 - t1) / s2 + y
    // x imag(s1 / s2) = imag((t2 - t1) / s2)
    double x = t2.sub(t1).div(s2).imag / s1.div(s2).imag;
    return s1.mul(x).add(t1);
  }
  
  public double solve() {
    cds = new ComplexDouble[n];
    for (int i = 0; i < n; i++) {
      cds[i] = new ComplexDouble(xys[i][0], xys[i][1]);
    }
    
    if (n == 2) {
      return cds[1].sub(cds[0]).abs() * 0.5;
    }
    
    double answer = Double.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        for (int k = j+1; k < n; k++) {
          ComplexDouble center = calculateCenter(i, j, k);
          double distance = cds[i].sub(center).abs();
          distance = Math.max(distance, cds[j].sub(center).abs());
          distance = Math.max(distance, cds[k].sub(center).abs());
          
          boolean all = true;
          for (int a = 0; a < n; a++) {
            double d = cds[a].sub(center).abs();
            if (d > distance + 1e-6) {
              all = false;
              break;
            }
          }
          if (all) {
            answer = Math.min(answer, distance);
          }
        }
      }
    }
    return answer;
  }
}


public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] xys = reader.nextInt(n, 2);
    out.printf("%.20f\n", new Solver(n, xys).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }
  
  public int nextInt() {
    return Integer.parseInt(next());
  }
  
  public long nextLong() {
    return Long.parseLong(next());
  }
  
  public double nextDouble() {
    return Double.parseDouble(next());
  }
  
  public String[] next(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextInt(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLong(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDouble(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public char[] nextCharArray() {
    return next().toCharArray();
  }
  
  public int[][] nextInt(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLong(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDouble(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
  
  public char[][] nextCharArray(int n) {
    char[][] matrix = new char[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = next().toCharArray();
    }
    return matrix;
  }
}
