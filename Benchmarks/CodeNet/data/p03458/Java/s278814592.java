import java.io.*;
import java.util.*;

class Solver {
  final int n, k;
  final int[] xs, ys;
  final char[] cs;
  
  Solver(int n, int k, int[] xs, int[] ys, char[] cs) {
    this.n = n;
    this.k = k;
    this.xs = xs;
    this.ys = ys;
    this.cs = cs;
  }
  
  public int solve() {
    int[][] whiteTopLeftIncrementalTable = new int[k][2 * k];
    for (int i = 0; i < n; i++) {
      // [0, 0] - [2k, 2k]
      int normX = xs[i] % (2 * k);
      int normY = ys[i] % (2 * k);
      // [0, 0] - [3k, 2k]
      int whiteNormX = normX + (cs[i] == 'B' ? k : 0);
      int whiteNormY = normY;
      // [-k, -k] - [2k, 1k]
      int topLeftWhiteNormX = whiteNormX - (k - 1);
      int topLeftWhiteNormY = whiteNormY - (k - 1);
      
      // [whiteNormX - (k - 1), whiteNormY - (k - 1)] - [whiteNormX, whiteNormY]
      for (int a = -4; a <= 4; a++) {
        for (int b = -4; b <= 4; b++) {
          if ((a + b) % 2 != 0) {
            continue;
          }
          int topLeftX = topLeftWhiteNormX + a * k;
          int topLeftY = topLeftWhiteNormY + b * k;
          int bottomRightX = topLeftX + k - 1;
          int bottomRightY = topLeftY + k - 1;
          // [(topLeftX, topLeftY) - (bottomRightX, bottomRightY)] - [(0, 0) - (2k-1, k-1)]
          if (bottomRightX < 0) continue;
          if (bottomRightY < 0) continue;
          if (2 * k - 1 < topLeftX) continue;
          if (k - 1 < topLeftY) continue;
          whiteTopLeftIncrementalTable[Math.max(topLeftY, 0)][Math.max(topLeftX, 0)] += 1;
          if (topLeftY + k < k) {
            whiteTopLeftIncrementalTable[topLeftY + k][Math.max(topLeftX, 0)] += -1;
          }
          if (topLeftX + k < 2 * k) {
            whiteTopLeftIncrementalTable[Math.max(topLeftY, 0)][topLeftX + k] += -1;
          }
        }
      }
      /*
        System.err.println("---");
      for (int y = 0; y < k; y++) {
        for (int x = 0; x < 2 * k; x++) {
          System.err.printf("%3d", whiteTopLeftIncrementalTable[y][x]);
        }
        System.err.println();
      }
      */
    }
    
    int[] line = new int[2 * k];
    int answer = 0;
    for (int i = 0; i < k; i++) {
      for (int j = 0; j < 2 * k; j++) {
        line[j] += whiteTopLeftIncrementalTable[i][j];
      }
      int count = 0;
      for (int j = 0; j < 2 * k; j++) {
        count += line[j];
        answer = Math.max(answer, count);
      }
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    int[] xs = new int[n];
    int[] ys = new int[n];
    char[] cs = new char[n];
    for (int i = 0; i < n; i ++) {
      xs[i] = reader.nextInt();
      ys[i] = reader.nextInt();
      cs[i] = reader.next().charAt(0);
    }
    out.println(new Solver(n, k, xs, ys, cs).solve());
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
  
  public String[] nextArray(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
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
  
  public double[] nextDoubleArray(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public int[][] nextIntMatrix(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLongMatrix(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDoubleMatrix(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
}

class ModCalculator {
  private final long mod;
  
  ModCalculator(long mod) {
    this.mod = mod;
  }
  
  public long add(long a, long b) {
    return (a + b) % mod;
  }
  
  public long mul(long a, long b) {
    return (a * b) % mod;
  }
  
  public long pow(long a, long b) {
    if (b == 0) {
      return 1;
    }
    long v = pow(mul(a, a), b / 2);
    if (b % 2 == 1) {
      return mul(v, a);
    } else {
      return v;
    }
  }
  
  public long inverse(long a) {
    return pow(a, mod - 2);
  }
  
  public long div(long a, long b) {
    return mul(a, inverse(b));
  }
}
 
class ModCombinationCache {
  private final ModCalculator modCalculator;
  private final List<Long> factorialCache;
  private final List<Long> factorialInverseCache;
  
  public ModCombinationCache(ModCalculator modCalculator) {
    this.modCalculator = modCalculator;
    factorialCache = new ArrayList<>();
    factorialCache.add(1L);
    factorialInverseCache = new ArrayList<>();
    factorialInverseCache.add(1L);
  }
  
  private void resize(int n) {
    for (int i = factorialCache.size() - 1; i < n; i++) {
      long v = modCalculator.mul(factorialCache.get(i), i + 1);
      factorialCache.add(v);
      factorialInverseCache.add(modCalculator.inverse(v));
    }
  }
  
  public long getP(int n) {
    resize(n);
    return factorialCache.get(n);
  }
  
  public long getC(int n, int k) {
    resize(n);
    return modCalculator.mul(factorialCache.get(n), modCalculator.mul(factorialInverseCache.get(k), factorialInverseCache.get(n-k)));
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
  
  public static void shuffle(int[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      int temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void shuffle(long[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      long temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void sort(int[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
  
  public static void sort(long[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
}

class UnionFind {
  int[] parents;
  int[] ranks;

  UnionFind(int n) {
    parents = new int[n];
    ranks = new int[n];

    for (int i = 0; i < n; i++) {
      parents[i] = i;
    }
  }

  public int getRoot(int index) {
    if (parents[index] == index) {
      return index;
    } else {
      parents[index] = getRoot(parents[index]);
      return parents[index];
    }
  }

  public boolean sameGroup(int a, int b) {
    return getRoot(a) == getRoot(b);
  }

  public void merge(int a, int b) {
    int rootA = getRoot(a);
    int rootB = getRoot(b);
    if (rootA == rootB) {
      return;
    }
    if (ranks[rootA] < ranks[rootB]) {
      parents[rootA] = rootB;
    } else if (ranks[rootB] < ranks[rootA]) {
      parents[rootB] = rootA;
    } else {
      parents[rootA] = rootB;
      ranks[rootB]++;
    }
  }
}
