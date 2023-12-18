
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public final class Main {

  private Main() {}

  public static int readCount(Reader reader) throws Exception {
    char[] buffer = new char[3];
    int bIndex = 0;

    for (;;) {
      int read = reader.read();
      if (read == '\r' || read == ' ') continue;
      if (read == '\n') return Integer.parseInt(String.valueOf(buffer, 0, bIndex));
      buffer[bIndex++] = (char) read;
    }
  }

  private static int[] parse(int count, Reader reader) throws Exception {
    char[] buffer = new char[10];
    int bIndex = 0;

    int[] result = new int[count];
    int rIndex = 0;

    for (;;) {
      int read = reader.read();
      if (read == '\r') continue;
      if (read == -1)
        return Arrays.copyOf(result, rIndex);

      char c = (char) read;
      if (c == '\n' || c == ' ') {
        if (bIndex != 0) {
          result[rIndex++] = Integer.parseInt(String.valueOf(buffer, 0, bIndex));
          bIndex = 0;
        }
        if (c == '\n') { return Arrays.copyOf(result, rIndex); }
        continue;
      }
      buffer[bIndex++] = c;
    }
  }

  public static void main(String[] args) throws Exception {
    final Reader reader = new InputStreamReader(System.in);

    final int length = readCount(reader);
    final int[] inputs = parse(length, reader);

    int max = 0;
    for (int tail = 0; tail < length; ++tail) {
      for (int head = tail; head < length; ++head) {
        int r = inputs[tail] - inputs[head];
        r = ((r < 0) ? -r : r);
        if (r > max) max = r;
      }
    }

    System.out.println(max);
  }

}
