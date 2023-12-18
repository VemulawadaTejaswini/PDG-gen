import java.io.*;
import java.util.*;

class Solver {
  final int n, q;
  final long[] as, xs;
  
  long[] aSumFromLarge, aSumFromSmall;
  
  Solver(int n, int q, long[] as, long[] xs) {
    this.n = n;
    this.q = q;
    this.as = as;
    this.xs = xs;
  }
  
  // n-1, n-2, n-3, n-4
  // n-4, n-5, n-6
  
  // n-1, n-2, n-3
  // n-3, n-4
  private boolean conflict(long x, int takahashiDrawCount) {
    if (n - 2 * takahashiDrawCount + 1 < 0) {
      return true;
    }
    long aokiDrawConflictMax = as[n - takahashiDrawCount];
    long aokiDrawConflictMin = as[n - 2 * takahashiDrawCount + 2];
    long aokiDrawNonConflictMax = as[n - takahashiDrawCount - 1];
    long aokiDrawNonConflictMin = as[n - 2 * takahashiDrawCount + 1];
    
    long conflictMaxDistance = Math.abs(aokiDrawConflictMax - x);
    long conflictMinDistance = Math.abs(aokiDrawConflictMin - x);
    long nonConflictMaxDistance = Math.abs(aokiDrawNonConflictMax - x);
    long nonConflictMinDistance = Math.abs(aokiDrawNonConflictMin - x);
    long conflictDistance = Math.max(conflictMaxDistance, conflictMinDistance);
    long nonConflictDistance = Math.max(nonConflictMaxDistance, nonConflictMinDistance);
    /*
    if (conflictDistance > nonConflictDistance) {
      return false;
    } else if (conflictDistance < nonConflictDistance) {
      return true;
    } 
    */
    return conflictDistance < nonConflictDistance;
  }
  
  private long solve(long x) {
    int min = 1;
    int max = n;
    while (max - min > 1) {
      int mid = (max + min) / 2;
      if (conflict(x, mid)) {
        max = mid;
      } else {
        min = mid;
      }
    }
//    System.err.printf("%d %d\n", x, min);
    return aSumFromLarge[n - min] + aSumFromSmall[(n + 1) / 2 - min];
  }
  
  public long[] solve() {
    aSumFromLarge = new long[n];
    aSumFromLarge[n - 1] = as[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      aSumFromLarge[i] = aSumFromLarge[i+1] + as[i];
    }
    
    aSumFromSmall = new long[(n + 1) / 2 + 1];
    if (n % 2 == 0) {
      aSumFromSmall[0] = 0;
      for (int i = 1; i < n; i += 2) {
        aSumFromSmall[i / 2 + 1] = aSumFromSmall[i / 2] + as[i];
      }
    } else {
      aSumFromSmall[0] = 0;
      for (int i = 0; i < n; i += 2) {
        aSumFromSmall[i / 2 + 1] = aSumFromSmall[i / 2] + as[i];
      }
    }
    
    long[] answers = new long[q];
    for (int i = 0; i < q; i++) {
      answers[i] = solve(xs[i]);
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int q = reader.nextInt();
    long[] as = reader.nextLong(n);
    long[] xs = reader.nextLong(q);
    for (long answer : new Solver(n, q, as, xs).solve()) {
      out.println(answer);
    }
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
