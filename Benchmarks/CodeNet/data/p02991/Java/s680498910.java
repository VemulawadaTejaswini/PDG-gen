import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
  int index;
  int cost;
  
  Node(int index, int cost) {
    this.index = index;
    this.cost = cost;
  }
  
  public int compareTo(Node node) {
    return this.cost - node.cost;
  }
}

class Solver {
  ArrayList<ArrayList<Integer>> edges;
  boolean[] visited;
  boolean[] enqueued;
  PriorityQueue<Node> queue;
  
  void fillNextIndex(int currentIndex, int step, int nextCost) {
    if (step == 0 && !visited[currentIndex] && !enqueued[currentIndex]) {
      enqueued[currentIndex] = true;
      queue.add(new Node(currentIndex, nextCost));
      return;
    }
    if (step == 0) {
      return;
    }
    
    for (int nextIndex : edges.get(currentIndex)) {
      fillNextIndex(nextIndex, step-1, nextCost);
    }
  }
  
  public int solve(int n, int m, int[] us, int[] vs, int s, int t) {
    edges = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      edges.add(new ArrayList<>());
    }
    
    for (int i = 0; i < m; i++) {
      edges.get(us[i]).add(vs[i]);
//      edges.get(vs[i]).add(us[i]);
    }
    
    visited = new boolean[n + 1];
    enqueued = new boolean[n + 1];
    queue = new PriorityQueue<>();
    queue.add(new Node(s, 0));
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      if (visited[node.index]) {
        continue;
      }
      visited[node.index] = true;
      if (node.index == t) {
        return node.cost;
      }
      HashSet<Integer> nexts = new HashSet<>();
      fillNextIndex(node.index, 3, node.cost + 1);
    }
    return -1;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[] us = new int[m];
    int[] vs = new int[m];
    for (int i = 0; i < m; i++) {
      us[i] = reader.nextInt();
      vs[i] = reader.nextInt();
    }
    int s = reader.nextInt();
    int t = reader.nextInt();
    out.println(new Solver().solve(n, m, us, vs, s, t));
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

