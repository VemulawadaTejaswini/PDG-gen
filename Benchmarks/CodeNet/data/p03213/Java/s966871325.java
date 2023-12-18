import java.io.*;
import java.util.*;

class Solver {
  final int n;
  
  Solver(int n) {
    this.n = n;
  }
  
  private boolean isPrime(int i, List<Integer> ps) {
    for (int p : ps) {
      if (i % p == 0) {
        return false;
      }
    }
    return true;
  }
  
  private int count1(int[] counts) {
    int v = 0;
    for (int c : counts) {
      if (c >= 74) {
        v ++ ;
      }
    }
    return v;
  }
  
  private int count2(int[] counts) {
    int v = 0;
    for (int i = 0; i < counts.length; i++) {
      for (int j = 0; j < counts.length; j++) {
        if (i == j) {
          continue;
        }
        if (counts[i] >= 24 && counts[j] >= 2) {
          v++;
        }
        if (counts[i] >= 14 && counts[j] >= 4) {
          v++;
        }
      }
    }
    return v;
  }
  
  private int count3(int[] counts) {
    int v = 0;
    for (int i = 0; i < counts.length; i++) {
      for (int j = i+1; j < counts.length; j++) {
        for (int k = 0; k < counts.length; k++) {
          if (i == k || j == k) {
            continue;
          }
          if (counts[i] >= 4 && counts[j] >= 4 && counts[k] >= 2) {
            v++;
          }
        }
      }
    }
    return v;
  }
  
  public int solve() {
    List<Integer> ps = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
      if (isPrime(i, ps)) {
        ps.add(i);
      }
    }
    
    int[] counts = new int[ps.size()];
    for (int i = 2; i <= n; i++) {
      int temp = i;
      for (int j = 0; j < ps.size(); j++) {
        int p = ps.get(j);
        while (temp % p == 0) {
          temp /= p;
          counts[j]++;
        }
      }
    }
    return count1(counts) + count2(counts) + count3(counts);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    out.println(new Solver(n).solve());
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
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
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

