import java.io.*;
import java.util.*;

public class Main {
  private static boolean valid(int i) {
    return i % 2 == 0 || i % 3 == 0 || i % 5 == 0;
  }
  
  private static ArrayList<Integer> solve(int n) {
    ArrayList<Integer> list = new ArrayList<>();
    if (n == 3) {
      list.add(2);
      list.add(5);
      list.add(63);
      return list;
    }
    
    int sum = 0;
    int count = 0;
    int last = 0;
    
    for (int i = 2; count < n - 2; i++) {
      if (valid(i)) {
        list.add(i);
        count++;
        sum += i;
        last = i;
      }
    }
    
    int base = (last / 30 + 1) * 30;
    for (int i = 0; i <= 30; i++) {
      if (!valid(i)) {
        continue;
      }
      for (int j = 0; j <= 30; j++) {
        if (!valid(j)) {
          continue;
        }
        
        if ((sum + i + j) % 30 == 0) {
          list.add(base + i);
          list.add(base + j + 30);
          return list;
        }
      }
    }
    throw new RuntimeException();
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    ArrayList<Integer> answer = solve(n);
    for (int k : answer) {
      out.print(k);
      out.print(" ");
    }
    out.println();
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

