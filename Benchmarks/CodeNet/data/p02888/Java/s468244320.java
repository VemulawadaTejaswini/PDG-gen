import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

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
    DTriangles solver = new DTriangles();
    solver.solve(1, in, out);
    out.close();
  }

  static class DTriangles {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int[] arr = in.nextIntArray(n);
      ArrayUtils.sort(arr);
      long ans = 0;
      for (int i = n - 1; i >= 0; --i) {
        int l = 0, r = i - 1;
        while (l < r) {
          if (arr[l] + arr[r] > arr[i]) {
            ans += (r - l);
            --r;
          } else {
            ++l;
          }
        }
      }
      out.println(ans);
    }

  }

  static class ArrayUtils {

    public static void sort(int[] arr) {
      int n = arr.length;
      Random r = new Random();
      for (int i = 0; i < n; i++) {
        int p = r.nextInt(n + 1);
        if (p < n) {
          int temp = arr[i];
          arr[i] = arr[p];
          arr[p] = temp;
        }
      }
      Arrays.sort(arr);
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

    public int[] nextIntArray(int size) {
      int[] arr = new int[size];
      for (int i = 0; i < size; ++i) {
        arr[i] = nextInt();
      }
      return arr;
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

