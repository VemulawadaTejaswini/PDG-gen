import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int n;
  static int a;
  static int b;
  static int c;
  static int[] l;

  public static void main(String[] args) {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);

    n = in.nextInt();
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    l = new int[n];

    for (int i = 0; i < n; i++)
      l[i] = in.nextInt();

    out.println(dfs(0, 0, 0, 0));

    out.close();
  }

  static int dfs(int cur, int a, int b, int c) {
    if (cur == n)
      return (min3(a, b, c) > 0) ? Math.abs(a - Main.a) + Math.abs(b - Main.b) + Math.abs(c - Main.c) - 30 : 1000000000;

    int ret0 = dfs(cur + 1, a, b, c);
    int ret1 = dfs(cur + 1, a + l[cur], b, c) + 10;
    int ret2 = dfs(cur + 1, a, b + l[cur], c) + 10;
    int ret3 = dfs(cur + 1, a, b, c + l[cur]) + 10;
    return min4(ret0, ret1, ret2, ret3);
  }

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
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
  }

  static int min3(int a, int b, int c) {return Math.min(a, Math.min(b, c));}
  static double min3(double a, double b, double c) {return Math.min(a, Math.min(b, c));}
  static long min3(long a, long b, long c) {return Math.min(a, Math.min(b, c));}

  static int min4(int a, int b, int c, int d) {return Math.min(Math.min(a, b), Math.min(c, d));}
  static double min4(double a, double b, double c, double d) {return Math.min(Math.min(a, b), Math.min(c, d));}
  static long min4(long a, long b, long c, long d) {return Math.min(Math.min(a, b), Math.min(c, d));}

  static int max3(int a, int b, int c) {return Math.max(a, Math.max(b, c));}
  static double max3(double a, double b, double c) {return Math.max(a, Math.max(b, c));}
  static long max3(long a, long b, long c) {return Math.max(a, Math.max(b, c));}

  static int max4(int a, int b, int c, int d) {return Math.max(Math.max(a, b), Math.max(c, d));}
  static double max4(double a, double b, double c, double d) {return Math.max(Math.max(a, b), Math.max(c, d));}
  static long max4(long a, long b, long c, long d) {return Math.max(Math.max(a, b), Math.max(c, d));}

}

