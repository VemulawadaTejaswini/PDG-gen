import java.io.*;
import java.util.*;

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
  
  private long count(int aPair) {
    int i = n - 1;
    int j = n - 1;
    long count = 0;
    while (j - 1 >= 0 && as[i] + as[j - 1] >= aPair) {
      j--;
    }
    count += n - j;
//    System.err.printf("%d %d %d\n", i, j, as[i] + as[j]);
    while (i - 1 >= 0) {
      i--;
      while (j + 1 < n && as[i] + as[j] < aPair) {
        j++;
      }
      if (as[i] + as[j] < aPair) {
        return count;
      }
      count += n - j;
//      System.err.printf("%d %d %d\n", i, j, as[i] + as[j]);
    }
    return count;
  }
  
  private long sum(int aPair) {
    int i = n - 1;
    int j = n - 1;
    long[] aSum = new long[n];
    aSum[n - 1] = as[n - 1];
    for (int k = n - 2; k >= 0; k--) {
      aSum[k] = aSum[k + 1] + as[k];
    }
    
    long sum = 0;
    while (j - 1 >= 0 && as[i] + as[j - 1] >= aPair) {
      j--;
    }
    // count += n - j;
    sum += (long)(n - j) * as[i];
    sum += aSum[j];
//    System.err.printf("%d %d %d\n", i, j, as[i] + as[j]);
    while (i - 1 >= 0) {
      i--;
      while (j + 1 < n && as[i] + as[j] < aPair) {
        j++;
      }
      if (as[i] + as[j] < aPair) {
        return sum;
//        return count;
      }
      // count += n - j;
      sum += (long)(n - j) * as[i];
      sum += aSum[j];
//      System.err.printf("%d %d %d\n", i, j, as[i] + as[j]);
    }
    return sum;
  }
  
  public long solve() {
    Arrays.sort(as);
    int aPairMax = as[n - 1] * 2;
    int aPairMin = as[0] * 2 - 1;
    while (aPairMax - aPairMin >= 2) {
      int aPairMid = (aPairMax + aPairMin) / 2;
      long c = count(aPairMid);
//      System.err.printf("%d %d %d %d\n", aPairMin, aPairMax, aPairMid, c);
      if (c > m) {
        aPairMin = aPairMid;
      } else {
        aPairMax = aPairMid;
      }
    }
    /*
    if (count(aPairMax) == m) {
      return sum(aPairMax);
    }
    
    aPairMax = as[n - 1] * 2;
    aPairMin = as[0] * 2 - 1;
    while (aPairMax - aPairMin >= 2) {
      int aPairMid = (aPairMax + aPairMin) / 2;
      long c = count(aPairMid);
//      System.err.printf("%d %d %d %d\n", aPairMin, aPairMax, aPairMid, c);
      if (c >= m) {
        aPairMin = aPairMid;
      } else {
        aPairMax = aPairMid;
      }
    }
    */
    
    
    long answer = sum(aPairMax - 1);
    long c = count(aPairMax - 1);
    
    /*
    System.err.println(aPairMax - 1);
    System.err.println(answer - 1);
    System.err.println(c);
    */
    
    return answer - (long)(aPairMax - 1) * (c - m);
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
