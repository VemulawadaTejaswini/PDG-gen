import java.io.*;
import java.util.*;

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

public class Main {
  private static int countAB(String s) {
    int originalLength = s.length();
    s = s.replaceAll("AB", "");
    int replacedLength = s.length();
    return (originalLength - replacedLength) / 2;
  }
  
  private static int solve(String[] s) {
    int countInternalAB = 0;
    int countTailAHeadB = 0;
    int countTailA = 0;
    int countHeadB = 0;
    
    for (String a : s) {
      countInternalAB += countAB(a);
      boolean startsWithB = a.startsWith("B");
      boolean endsWithA = a.endsWith("A");
      
      if (startsWithB && endsWithA) {
        countTailAHeadB++;
      } else if (startsWithB) {
        countHeadB++;
      } else if (endsWithA) {
        countTailA++;
      }
    }
    
//    System.err.printf("%d %d %d %d\n", countInternalAB, countTailAHeadB, countTailA, countHeadB);
    
    int answer = countInternalAB;
    answer += Math.max(0, countTailAHeadB - 1);
    if (countTailAHeadB > 0 && countHeadB > 0 && countTailA > 0) {
      countHeadB--;
      countTailA--;
      answer += 2;
    } else if (countTailAHeadB > 0 && (countHeadB > 0 || countTailA > 0)) {
      answer++;
    }
    
    answer += Math.min(countHeadB, countTailA);
    return answer;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = reader.next();
    }
    
    out.println(solve(s));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

