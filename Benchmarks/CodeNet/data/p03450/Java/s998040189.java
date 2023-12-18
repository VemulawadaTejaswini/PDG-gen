import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
 
    List<Integer>[] conn = new ArrayList[n];
    List<Integer>[] diff = new ArrayList[n];
 
    for (int i = 0 ; i < m ; i ++) {
      int l = scanner.nextInt() - 1;
      int r = scanner.nextInt() - 1;
      int d = scanner.nextInt();
      if (conn[l] == null) {
        conn[l] = new ArrayList();
        diff[l] = new ArrayList();
      }
      conn[l].add(r);
      diff[l].add(d);
      if (conn[r] == null) {
        conn[r] = new ArrayList();
        diff[r] = new ArrayList();
      }
      conn[r].add(l);
      diff[r].add(-d);
    }
 
    boolean[] visited = new boolean[n];
    int[] x = new int[n];
 
    for (int first = 0 ; first < n ; first ++) {
      if (visited[first]) {
        continue;
      }
      IntQueue queue = new IntQueue(n);
      visited[first] = true;
      x[first] = 0;
      queue.offer(first);
      while (!queue.isEmpty()) {
        int u = queue.poll();
        for (int i = 0 ; conn[u] != null && i < conn[u].size() ; i ++) {
          int v = conn[u].get(i);
          int d = diff[u].get(i);
          if (!visited[v]) {
            visited[v] = true;
            x[v] = x[u] + d;
            queue.offer(v);
          } else if (x[v] != x[u] + d) {
            System.out.println("No");
            return;
          }
        }
      }
    }
    System.out.println("Yes");
    return;
  }
 
  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }
 
  // lightweight queue for int
  public static class IntQueue {
 
    private int[] array;
    private int head, tail;
 
    public IntQueue(int max) {
      array = new int[max];
    }
 
    public void offer(int x) {
      array[tail ++] = x;
    }
 
    public int poll() {
      return array[head ++];
    }
    
    public boolean isEmpty() {
      return head == tail;
    }
 
  }
 
  // scanner slightly faster than usual ones
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