import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(final String[] args) throws Exception {
    try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String l = r.readLine();
      int ln = l.length();
      int a = 0;
      for (int i = 0, ll = ln - 1; i < ll; i++) {
        int j = i + 1;
        int m = Integer.parseInt(l.substring(i, j)) % 2019;
        if (m == 0) {
          a++;
        }
        for (; j < ln; j++) {
          int x = (int) (l.charAt(j) - '0');
          m = (m * 10 + x) % 2019;
          if (m == 0) {
            a++;
          }
        }
      }
      System.out.println(a);
    }
  }
}
