import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  char[] s, t;

  public void input() {
    String str = Console.nextLine();
    s = str.toCharArray();
    str = Console.nextLine();
    t = str.toCharArray();
  }

  public void process() {
    if (s.length == t.length) {
      boolean flag = true;
      for (int i = 0; i < s.length; i++) {
        while (i < s.length && s[i] != t[0]) {
          i++;
        }
        int k = i + 1;
        if (k >= s.length) {
          break;
        }
        for (int j = 1; j < t.length && k != i; j++, k++) {
          if (k == s.length) {
            k = 0;
          }
          if (s[k] != t[j]) {
            flag = false;
          }
        }
        if (flag) {
          System.out.print("Yes");
          return;
        }
      }
    }
    System.out.print("No");
  }

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    input();
    process();
  }

  static class Console {

    private final BufferedReader bf;
    private StringTokenizer tokenizer;
    private static final Console instance;

    static {
      instance = new Console();
    }

    public Console() {
      bf = new BufferedReader(new InputStreamReader(System.in));
    }

    public static String nextLine() {
      try {
        return instance.bf.readLine();
      } catch (IOException e) {
        e.printStackTrace();
        return null;
      }
    }

    public static StringTokenizer nextTokenizer() {
      return new StringTokenizer(nextLine());
    }

    public static String next() {
      if (instance.tokenizer == null || !instance.tokenizer.hasMoreTokens()) {
        instance.tokenizer = nextTokenizer();
      }
      return instance.tokenizer.nextToken();
    }

    public static int nextInt() {
      return Integer.parseInt(next());
    }

    public static long nextLong() {
      return Long.parseLong(next());
    }

    public static double nextDouble() {
      return Double.parseDouble(next());
    }

  }
}
