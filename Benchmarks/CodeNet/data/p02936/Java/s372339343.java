import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.util.List;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    DKi solver = new DKi();
    solver.solve(1, in, out);
    out.close();
  }

  static class DKi {

    List<Integer>[] g;
    int[] value;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int q = in.nextInt();
      g = Graphs.createGraph(n + 1);
      value = new int[n + 1];

      for (int i = 0; i < n - 1; ++i) {
        int u = in.nextInt();
        int v = in.nextInt();
        g[u].add(v);
        g[v].add(u);
      }
      for (int i = 0; i < q; ++i) {
        int p = in.nextInt(), x = in.nextInt();
        value[p] += x;
      }

      dfs(1, 0);
      for (int i = 1; i <= n; ++i) {
        if (i > 1) {
          out.print(" ");
        }
        out.print(value[i]);
      }
    }

    private void dfs(int u, int p) {
      value[u] += value[p];
      for (int v : g[u]) {
        if (v == p) {
          continue;
        }
        dfs(v, u);
      }
    }

  }

  static class Graphs {

    private Graphs() {
    }

    public static List<Integer>[] createGraph(int n) {
      List<Integer>[] graph = new ArrayList[n];
      for (int i = 0; i < n; i++) {
        graph[i] = new ArrayList<>();
      }
      return graph;
    }

  }

  static interface FastInput {

  }

  static class InputReader implements FastInput {

    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer;
    private int bytesRead;

    public InputReader(InputStream is) {
      din = new DataInputStream(is);
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public InputReader(String file_name) throws IOException {
      din = new DataInputStream(new FileInputStream(file_name));
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public int nextInt() {
      int ret = 0;
      byte c = read();
      while (c <= ' ') {
        c = read();
      }
      boolean neg = (c == '-');
      if (neg) {
        c = read();
      }
      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');

      if (neg) {
        return -ret;
      }
      return ret;
    }

    private void fillBuffer() {
      try {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
      } catch (IOException e) {
        throw new RuntimeException("trying to read from null input, verify constraints ");
      }
      if (bytesRead == -1) {
        buffer[0] = -1;
      }
    }

    private byte read() {
      if (bufferPointer == bytesRead) {
        fillBuffer();
      }
      return buffer[bufferPointer++];
    }

  }
}

