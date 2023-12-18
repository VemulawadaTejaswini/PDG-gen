import java.io.*;
import java.util.*;

class Solver {
  long[][] mul(long[][] a, long[][] b) {
    long[][] output = new long[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          output[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    return output;
  }
  
  long[] mul(long[][] a, long[] b) {
    long[] output = new long[3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        output[i] += a[i][j] * b[j];
      }
    }
    return output;
  }
  
  double[][] mul(double[][] a, double[][] b) {
    double[][] output = new double[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          output[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    return output;
  }
  
  double[] mul(double[][] a, double[] b) {
    double[] output = new double[3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        output[i] += a[i][j] * b[j];
      }
    }
    return output;
  }
  
  public String solve(long a, long b, long c, long k) {
    if (a == b) {
      return "0";
    }
    if (k > 100) {
      return "Unfair";
    }
    double[][] baseMatrixDouble = new double[][]{
      new double[]{0, 1, 1},
      new double[]{1, 0, 1},
      new double[]{1, 1, 0},
    };
    double[][] matrixDouble = new double[][]{
      new double[]{1, 0, 0},
      new double[]{0, 1, 0},
      new double[]{0, 0, 1},
    };
    for (int i = 0; i < k; i++) {
      matrixDouble = mul(matrixDouble, baseMatrixDouble);
    }
    double[] outputDouble = mul(matrixDouble, new double[]{a, b, c});
    if (Math.abs(outputDouble[0] - outputDouble[1]) > 2e18) {
      return "Unfair";
    }
    
    long[][] baseMatrixLong = new long[][]{
      new long[]{0, 1, 1},
      new long[]{1, 0, 1},
      new long[]{1, 1, 0},
    };
    long[][] matrixLong = new long[][]{
      new long[]{1, 0, 0},
      new long[]{0, 1, 0},
      new long[]{0, 0, 1},
    };
    for (int i = 0; i < k; i++) {
      matrixLong = mul(matrixLong, baseMatrixLong);
    }
    long[] outputLong = mul(matrixLong, new long[]{a, b, c});
    if (Math.abs(outputLong[0] - outputLong[1]) > 1e18) {
      return "Unfair";
    }
    return String.format("%d", outputLong[0] - outputLong[1]);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    long a = reader.nextLong();
    long b = reader.nextLong();
    long c = reader.nextLong();
    long n = reader.nextLong();
    out.println(new Solver().solve(a, b, c, n));
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
  
  public int[] nextIntArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLongArray(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
}

class Algorithm {
  private static void swap(Object[] list, int a, int b) {
    Object tmp = list[a];
    list[a] = list[b];
    list[b] = tmp;
  }
  
  public static <T extends Comparable<? super T>> boolean nextPermutation(T[] ts) {
    int rightMostAscendingOrderIndex = ts.length - 2;
    while (rightMostAscendingOrderIndex >= 0 &&
        ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]) >= 0) {
      rightMostAscendingOrderIndex--;
    }
    if (rightMostAscendingOrderIndex < 0) {
      return false;
    }
    
    int rightMostGreatorIndex = ts.length - 1;
    while (ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]) >= 0) {
      rightMostGreatorIndex--;
    }
    
    swap(ts, rightMostAscendingOrderIndex, rightMostGreatorIndex);
    for (int i = 0; i < (ts.length - rightMostAscendingOrderIndex - 1) / 2; i++) {
      swap(ts, rightMostAscendingOrderIndex + 1 + i, ts.length - 1 - i);
    }
    return true;
  }
}

