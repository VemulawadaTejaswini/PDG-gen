import java.io.*;
import java.util.*;

class Solver {
  int n;
  int k;
  int[] vs;
  
  private int calculate(int left, int right) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < left; i++) {
      list.add(vs[i]);
    }
    for (int i = 0; i < right; i++) {
      list.add(vs[vs.length - 1 - i]);
    }
    Collections.sort(list);
    int tempK = k - left - right;
    int index = 0;
    while (tempK > 0 && index < list.size() && list.get(index) < 0) {
      list.set(index, 0);
      index++;
      tempK--;
    }
    
    int sum = 0;
    for (int v : list) {
      sum += v;
    }
    return sum;
  }
  
  public int solve(int n, int k, int[] vs) {
    this.n = n;
    this.k = k;
    this.vs = vs;
    
    int maxScore = 0;
    for (int left = 0; left < k; left++) {
      for (int right = 0; left + right < Math.min(n, k); right++) {
        if (left == 0 && right == 0) {
          continue;
        }
        maxScore = Math.max(maxScore, calculate(left, right));
      }
    }
    return maxScore;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    int[] vs = reader.nextIntArray(n);
    out.println(new Solver().solve(n, k, vs));
    
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

