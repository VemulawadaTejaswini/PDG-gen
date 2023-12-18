import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {
    Code code = new A();
    code.execute();
  }

  public static interface Code {
    void execute() throws IOException;
  }

  static class A implements Code {
    @Override
    public void execute() throws IOException {
      try (IO io = new IO(System.in)) {
        long[] ll = io.nextLong();
        long N = ll[0];
        long i = ll[1];
        System.out.println(solve(N, i));
      }
    }

    public long solve(long N, long i) {
      return N - i + 1;
    }
  }

  public static class IO implements Closeable {
    private BufferedReader buf;

    public IO(InputStream in) {
      buf = new BufferedReader(new InputStreamReader(in));
    }

    public String nextLine() throws IOException {
      return buf.readLine();
    }

    public String[] nextString() throws IOException {
      return nextLine().split(" ");
    }

    public int[] nextInt() throws IOException {
      return Arrays.stream(nextString()).mapToInt(Integer::parseInt).toArray();
    }

    public long[] nextLong() throws IOException {
      return Arrays.stream(nextString()).mapToLong(Long::parseLong).toArray();
    }

    @Override
    public void close() throws IOException {
      buf.close();
    }
  }
}
