import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(final String[] args) throws Exception {
    String l;
    try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      l = r.readLine();
    }
    int[] x = new int[l.length()];
    for (int i = 0; i < x.length; i++) {
      x[i] = l.charAt(i) - '0';
    }

    int ln = l.length();
    int a = 0;
    for (int i = 0, m = 0; i < ln; i++, m = 0) {
      for (int j = i; j < ln; j++) {
        m = ((m << 3) + (m << 1) + x[j]) % 2019;
        if (m == 0) {
          a++;
        }

      }
    }
    System.out.println(a);
  }
}
