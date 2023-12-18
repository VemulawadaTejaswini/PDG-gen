import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public static final int MOD = 998244353;

  public void run() {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    List<Integer>[] edges = new List[n];
    for (int i = 0 ; i < n ; i ++) {
      edges[i] = new ArrayList();
    }
    for (int i = 0 ; i < m ; i ++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      edges[a].add(b);
      edges[b].add(a);
    }

    int min = Integer.MAX_VALUE;
    int first = 0;
    for (int i = 0 ; i < n ; i ++) {
      if (edges[i].size() < min) {
        min = edges[i].size();
        first = i;
      }
    }

    boolean[] used = new boolean[n];
    List<Integer> res = new ArrayList();
    used[first] = true;
    res.add(first);
    for (int i = 0 ; i < edges[first].size() ; i ++) {
      int f = (i == 0) ? first : edges[first].get(i - 1);
      int l = edges[first].get(i);
      res.addAll(findPath(edges, used, f, l));
    }

    System.out.println(res.size());
    for (int i = 0 ; i < res.size() ; i ++) {
      if (i != 0) {
        System.out.print(" ");
      }
      System.out.print(res.get(i) + 1);
    }
    System.out.println("");
  }

  public List<Integer> findPath(List<Integer>[] edges, boolean[] used, int first, int last) {
    Queue<Integer> queue = new ArrayDeque();
    boolean[] visited = new boolean[edges.length];
    int[] prevs = new int[edges.length];
    queue.offer(first);
    out: while (!queue.isEmpty()) {
      int i = queue.poll();
      for (int j : edges[i]) {
        if (!visited[j] && !used[j]) {
          queue.offer(j);
          visited[j] = true;
          prevs[j] = i;
        }
        if (j == last) {
          break out;
        }
      }
    }
    List<Integer> res = new ArrayList();
    int c = last;
    res.add(c);
    used[c] = true;
    while (c != first) {
      c = prevs[c];
      if (c != first) {
        res.add(0, c);
        used[c] = true;
      }
    }
    return res;
  }


  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }
 
  public static class BetterScanner {
 
    private InputStream stream;
    private byte[] buffer = new byte[1024];
    private int pointer = 0;
    private int bufferLength = 0;
 
    public BetterScanner(InputStream stream) {
      this.stream = stream;
    }
 
    private boolean updateBuffer() {
      if (pointer >= bufferLength) {
        pointer = 0;
        try {
          bufferLength = stream.read(buffer);
        } catch (IOException exception) {
          exception.printStackTrace();
        }
        return bufferLength > 0;
      } else {
        return true;
      }
    }
 
    private int read() {
      if (updateBuffer()) {
        return buffer[pointer ++];
      } else {
        return -1;
      }
    }
 
    public boolean hasNext() {
      skipUnprintable();
      return updateBuffer();
    }
 
    private void skipUnprintable() { 
      while (updateBuffer() && !isPrintableChar(buffer[pointer])) {
        pointer ++;
      }
    }
 
    public String next() {
      if (hasNext()) {
        StringBuilder builder = new StringBuilder();
        int codePoint = read();
        while (isPrintableChar(codePoint)) {
          builder.appendCodePoint(codePoint);
          codePoint = read();
        }
        return builder.toString();
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public long nextLong() {
      if (hasNext()) {
        long number = 0;
        boolean minus = false;
        int codePoint = read();
        if (codePoint == '-') {
          minus = true;
          codePoint = read();
        }
        if (codePoint >= '0' && codePoint <= '9') {
          while (true) {
            if (codePoint >= '0' && codePoint <= '9') {
              number *= 10;
              number += codePoint - '0';
            } else if (codePoint < 0 || !isPrintableChar(codePoint)) {
              return (minus) ? -number : number;
            } else {
              throw new NumberFormatException();
            }
            codePoint = read();
          }
        } else {
          throw new NumberFormatException();
        }
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public int nextInt() {
      long number = nextLong();
      if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
        return (int)number;
      } else {
        throw new NumberFormatException();
      }
    }
 
    private boolean isPrintableChar(int codePoint) {
      return codePoint >= 33 && codePoint <= 126;
    }
 
  }
 
}
