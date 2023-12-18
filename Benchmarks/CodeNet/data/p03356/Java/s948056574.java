import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public static final int MOD = 1000000007;

  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] pp = new int[n];
    for (int i = 0 ; i < n ; i ++) {
      pp[i] = scanner.nextInt() - 1;
    }
    List<Integer>[] ee = new List[n];
    for (int i = 0 ; i < n ; i ++) {
      ee[i] = new ArrayList();
    }
    for (int i = 0 ; i < m ; i ++) {
      int x = scanner.nextInt() - 1;
      int y = scanner.nextInt() - 1;
      ee[x].add(y);
      ee[y].add(x);
    }

    boolean[] visited = new boolean[n];
    int res = 0;
    Deque<Integer> queue = new ArrayDeque();
    List<Integer> group = new ArrayList();

    for (int first = 0 ; first < n ; first ++) {
      if (visited[first]) {
        continue;
      }
      boolean[] found = new boolean[n];
      group.clear();
      queue.push(first); 
      group.add(first);
      found[pp[first]] = true;
      visited[first] = true;
      while (!queue.isEmpty()) {
        int i = queue.pop();
        for (int j : ee[i]) {
          if (!visited[j]) {
            queue.push(j);
            group.add(j);
            found[pp[j]] = true;
            visited[j] = true;
          }
        }
      }
      for (int i : group) {
        if (found[i]) {
          res ++;
        }
      }
    }

    System.out.println(res);
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.run();
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
