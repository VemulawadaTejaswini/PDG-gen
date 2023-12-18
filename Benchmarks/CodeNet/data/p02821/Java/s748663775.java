import java.io.*;
import java.util.*;

// Source: https://www.creativ.xyz/fast-fourier-transform/
class CooleyTukeyFftConvolutionCalculator {
  private static class ComplexDouble {
    final double real, imag;
    
    ComplexDouble(double real, double imag) {
      this.real = real;
      this.imag = imag;
    }
    
    static ComplexDouble add(ComplexDouble a, ComplexDouble b) {
      return new ComplexDouble(a.real + b.real, a.imag + b.imag);
    }
    
    static ComplexDouble sub(ComplexDouble a, ComplexDouble b) {
      return new ComplexDouble(a.real - b.real, a.imag - b.imag);
    }
    
    static ComplexDouble mul(ComplexDouble a, double b) {
      return new ComplexDouble(a.real * b, a.imag * b);
    }
    
    static ComplexDouble mul(ComplexDouble a, ComplexDouble b) {
      double mulReal = a.real * b.real - a.imag * b.imag;
      double mulImag = a.real * b.imag + a.imag * b.real;
      return new ComplexDouble(mulReal, mulImag);
    }
    
    static ComplexDouble polar(double abs, double theta) {
      return new ComplexDouble(abs * Math.cos(theta), abs * Math.sin(theta));
    }
    
    public String toString() {
      return String.format("(%.3f, %.3f)", real, imag);
    }
  }
  
  private static ComplexDouble[] fft(ComplexDouble[] vs, boolean inverse) {
    int n = vs.length;
    int log2N = 0;
    for (int i = 0; (1 << i) < n; i++) {
      log2N++;
    }
    for (int i = 0; i < n; i++) {
      int j = 0;
      for (int k = 0; k < log2N; k++) {
        j |= (i >> k & 1) << (log2N - 1 - k);
      }
      if (i < j) {
        ComplexDouble swap = vs[i];
        vs[i] = vs[j];
        vs[j] = swap;
      }
    }
    for (int b = 1; b < n; b *= 2) {
      for (int j = 0; j < b; j++) {
        ComplexDouble w = ComplexDouble.polar(1.0, (2.0 * Math.PI) / (2.0 * b) * j * (inverse ? 1.0 : -1.0));
        for (int k = 0; k < n; k += b * 2) {
          ComplexDouble s = vs[j + k];
          ComplexDouble t = ComplexDouble.mul(vs[j + k + b], w);
          vs[j + k] = ComplexDouble.add(s, t);
          vs[j + k + b] = ComplexDouble.sub(s, t);
        }
      }
    }
    if (inverse) {
      for (int i = 0; i < n; i++) {
        vs[i] = ComplexDouble.mul(vs[i], 1.0 / n);
      }
    }
    return vs;
  }
  
  private static ComplexDouble[] expand(double[] vs, int size) {
    ComplexDouble[] cvs = new ComplexDouble[size];
    for (int i = 0; i < vs.length; i++) {
      cvs[i] = new ComplexDouble(vs[i], 0);
    }
    for (int i = vs.length; i < size; i++) {
      cvs[i] = new ComplexDouble(0, 0);
    }
    return cvs;
  }
  
  public static double[] convolve(double[] as, double[] bs) {
    int s = as.length + bs.length - 1;
    int t = 1;
    while (t < s) {
      t *= 2;
    }
    ComplexDouble[] expandedAs = expand(as, t);
    ComplexDouble[] expandedBs = expand(bs, t);
    ComplexDouble[] fftAs = fft(expandedAs, false);
    ComplexDouble[] fftBs = fft(expandedBs, false);
    ComplexDouble[] fftCs = new ComplexDouble[t];
    for (int i = 0; i < t; i++) {
      fftCs[i] = ComplexDouble.mul(fftAs[i], fftBs[i]);
    }
    
    ComplexDouble[] expandedCs = fft(fftCs, true);
    
    double[] cs = new double[s];
    for (int i = 0; i < s; i++) {
      cs[i] = expandedCs[i].real;
    }
    return cs;
  }
}

class Solver {
  private static final int AMAX = 100_000;
  final int n;
  final long m;
  final int[] as;
  
  Solver(int n, long m, int[] as) {
    this.n = n;
    this.m = m;
    this.as = as;
  }
  
  public long solve() {
    int aMax = 0;
    for (int a : as) {
      aMax = Math.max(aMax, a);
    }
    double[] vs = new double[aMax + 1];
    for (int a : as) {
      vs[a] += 1.0;
    }
    
    double[] convolvedVs = CooleyTukeyFftConvolutionCalculator.convolve(vs, vs);
    long[] countPairValues = new long[convolvedVs.length];
    for (int i = 0; i < convolvedVs.length; i++) {
      countPairValues[i] = (long)(convolvedVs[i] + 0.5);
    }
    
    long answer = 0;
    long restM = m;
    for (int i = countPairValues.length - 1; i >= 0 && restM > 0; i--) {
      if (countPairValues[i] < restM) {
        answer += countPairValues[i] * (long) i;
        restM -= countPairValues[i];
      } else {
        answer += (long) restM * (long) i;
        restM = 0;
      }
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long m = reader.nextLong();
    int[] as = reader.nextInt(n);
    out.println(new Solver(n, m, as).solve());
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
