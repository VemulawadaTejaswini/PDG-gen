import java.io.*;
import java.util.*;


class Node implements Comparable<Node> {
  int b;
  long c;
  
  Node(int b, long c) {
    this.b = b;
    this.c = c;
  }
  
  public int compareTo(Node node) {
    return Long.compare(this.c, node.c);
  }
}

public class Main {
  private static long solve(int n, int m, long[] as, int[] bs, long[] cs) {
    Arrays.sort(as);
    Node[] nodes = new Node[m];
    for (int i = 0; i < m; i++) {
      nodes[i] = new Node(bs[i], cs[i]);
    }
    Arrays.sort(nodes);
    
    int asIndex = 0;
    int nodesIndex = m - 1;
    
    while (asIndex < n && nodesIndex >= 0) {
      if (as[asIndex] < nodes[nodesIndex].c) {
        as[asIndex] = nodes[nodesIndex].c;
        asIndex++;
        nodes[nodesIndex].b--;
        if (nodes[nodesIndex].b <= 0) {
          nodesIndex--;
        }
      } else {
        break;
      }
    }
    
    long sum = 0;
    for (long a : as) {
      sum += a;
    }
    return sum;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    long[] as = reader.nextLongArray(n);
    int[] bs = new int[m];
    long[] cs = new long[m];
    for (int i = 0; i < m; i++) {
      bs[i] = reader.nextInt();
      cs[i] = reader.nextLong();
    }
    out.println(solve(n, m, as, bs, cs));
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

