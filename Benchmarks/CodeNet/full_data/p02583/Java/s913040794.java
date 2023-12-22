import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int l[] = new int[n];
    for (int i = 0; i < n; i++) {
      l[i] = Integer.parseInt(sc.next());
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          int li = l[i];
          int lj = l[j];
          int lk = l[k];
          if (li == lj || lj == lk || lk == li) {
            continue;
          }
          if (li + lj > lk && lj + lk > li && lk + li > lj) {
            ans++;
          }
        }
      }
    }
    pw.println(ans);
  }
}

