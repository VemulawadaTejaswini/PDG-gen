import java.io.*;
import java.util.*;

class NextNode {
  int nextIndex;
  long cost;
  
  NextNode(int nextIndex, long cost) {
    this.nextIndex = nextIndex;
    this.cost = cost;
  }
}

class Solver {
  int n;
  int m;
  long p;
  int[] as;
  int[] bs;
  long[] cs;
  
  List<List<NextNode>> edges;
  List<List<NextNode>> reverseEdges;
  boolean[] reachable1;
  boolean[] reachable2;
  
  private void reachableNodeInternal(int index) {
    if (reachable1[index]) {
      return;
    }
    reachable1[index] = true;
    
    for (NextNode nextNode : reverseEdges.get(index)) {
      reachableNodeInternal(nextNode.nextIndex);
    }
  }
  
  private void reachableNode() {
    reachable1 = new boolean[n];
    reachableNodeInternal(n - 1);
  }
  
  private void reachableNodeInternal2(int index) {
    if (reachable2[index]) {
      return;
    }
    reachable2[index] = true;
    
    for (NextNode nextNode : edges.get(index)) {
      reachableNodeInternal2(nextNode.nextIndex);
    }
  }
  
  private void reachableNode2() {
    reachable2 = new boolean[n];
    reachableNodeInternal2(0);
  }
  
  public long solve(int n, int m, long p, int[] as, int[] bs, long[] cs) {
    this.n = n;
    this.m = m;
    this.p = p;
    this.as = as;
    this.bs = bs;
    this.cs = cs;
    
    edges = new ArrayList<>();
     reverseEdges = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      edges.add(new ArrayList<>());
      reverseEdges.add(new ArrayList<>());
    }
    
    for (int i = 0; i < m; i++) {
      edges.get(as[i]).add(new NextNode(bs[i], p - cs[i]));
      reverseEdges.get(bs[i]).add(new NextNode(as[i], p - cs[i]));
    }
    
    reachableNode();
    reachableNode2();
    
    if (!reachable1[0]) {
      return -1;
    }
    
    List<Integer> as2 = new ArrayList<>();
    List<Integer> bs2 = new ArrayList<>();
    List<Long> cs2 = new ArrayList<>();
    
    for (int i = 0; i < m; i++) {
      if (reachable1[as[i]] && reachable1[bs[i]] && reachable2[as[i]] && reachable2[bs[i]]) {
        as2.add(as[i]);
        bs2.add(bs[i]);
        cs2.add(p - cs[i]);
      }
    }
    
    long[] distance = new long[n];
    int[] pref = new int[n];
    for (int i = 0; i < n; i++) {
      distance[i] = 1L << 50;
      pref[i] = -1;
    }
    distance[0] = 0;
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < as2.size(); j++) {
        int a = as2.get(j);
        int b = bs2.get(j);
        long c = cs2.get(j);
        
        if (distance[b] > distance[a] + c) {
          distance[b] = distance[a] + c;
          pref[b] = a;
        }
      }
    }
    
    for (int j = 0; j < as2.size(); j++) {
      int a = as2.get(j);
      int b = bs2.get(j);
      long c = cs2.get(j);
      
      if (distance[b] > distance[a] + c) {
        return -1;
      }
    }
    
    return Math.max(0, -1 * distance[n-1]);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    long p = reader.nextLong();
    int[] as = new int[m];
    int[] bs = new int[m];
    long[] cs = new long[m];
    for (int i = 0; i < m; i++) {
      as[i] = reader.nextInt() - 1;
      bs[i] = reader.nextInt() - 1;
      cs[i] = reader.nextLong();
    }
    out.println(new Solver().solve(n, m, p, as, bs, cs));
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

