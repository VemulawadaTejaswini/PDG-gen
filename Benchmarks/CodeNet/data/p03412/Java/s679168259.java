import java.io.*;
import java.util.Arrays;

public class Main {
  static FastScanner sc = new FastScanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < 29; i++) {
      int countZ = 0;
      for (int j = 0; j < N; j++) {
        if ((B[j] & (1 << i)) == 0) {
          ++countZ;
        }
      }
      int[] z = new int[countZ];
      int[] o = new int[N - countZ];
      int pz = 0;
      int mask = (1 << i) - 1;
      for (int j = 0; j < N; j++) {
        if ((B[j] & (1 << i)) == 0) {
          z[pz++] = B[j] & mask;
        } else {
          o[j - pz] = B[j] & mask;
        }
      }
      Arrays.sort(z);
      Arrays.sort(o);
      long count = 0;
      for (int j = 0; j < N; j++) {
        int lower = A[j] & mask;
        if ((A[j] & (1 << i)) == 0) {
          // zero & carry or one & no carry
          count += z.length - countNoCarry(z, mask - lower);
          count += countNoCarry(o, mask - lower);
        } else {
          // zero & no carry or one & carry
          count += countNoCarry(z, mask - lower);
          count += o.length - countNoCarry(o, mask - lower);
        }
      }
      if (count % 2 == 1) ans |= 1 << i;
    }
    System.out.println(ans);
  }

  static int countNoCarry(int[] list, int v) {
    int pos = Arrays.binarySearch(list, v);
    if (pos >= 0) {
      while (pos < list.length) {
        if (list[pos] != v) break;
        pos++;
      }
    } else {
      pos = -pos - 1;
    }
    return pos;
  }

  static class FastScanner {
    Reader input;

    FastScanner() {
      this(System.in);
    }

    FastScanner(InputStream stream) {
      this.input = new BufferedReader(new InputStreamReader(stream));
    }

    int nextInt() {
      return (int) nextLong();
    }

    long nextLong() {
      try {
        int sign = 1;
        int b = input.read();
        while ((b < '0' || '9' < b) && b != '-' && b != '+') {
          b = input.read();
        }
        if (b == '-') {
          sign = -1;
          b = input.read();
        } else if (b == '+') {
          b = input.read();
        }
        long ret = b - '0';
        while (true) {
          b = input.read();
          if (b < '0' || '9' < b) return ret * sign;
          ret *= 10;
          ret += b - '0';
        }
      } catch (IOException e) {
        e.printStackTrace();
        return -1;
      }
    }

    double nextDouble() {
      try {
        double sign = 1;
        int b = input.read();
        while ((b < '0' || '9' < b) && b != '-' && b != '+') {
          b = input.read();
        }
        if (b == '-') {
          sign = -1;
          b = input.read();
        } else if (b == '+') {
          b = input.read();
        }
        double ret = b - '0';
        while (true) {
          b = input.read();
          if (b < '0' || '9' < b) break;
          ret *= 10;
          ret += b - '0';
        }
        if (b != '.') return sign * ret;
        double div = 1;
        b = input.read();
        while ('0' <= b && b <= '9') {
          ret *= 10;
          ret += b - '0';
          div *= 10;
          b = input.read();
        }
        return sign * ret / div;
      } catch (IOException e) {
        e.printStackTrace();
        return Double.NaN;
      }
    }

    char nextChar() {
      try {
        int b = input.read();
        while (Character.isWhitespace(b)) {
          b = input.read();
        }
        return (char) b;
      } catch (IOException e) {
        e.printStackTrace();
        return 0;
      }
    }

    String nextStr() {
      try {
        StringBuilder sb = new StringBuilder();
        int b = input.read();
        while (Character.isWhitespace(b)) {
          b = input.read();
        }
        while (b != -1 && !Character.isWhitespace(b)) {
          sb.append((char) b);
          b = input.read();
        }
        return sb.toString();
      } catch (IOException e) {
        e.printStackTrace();
        return "";
      }
    }

  }
}
