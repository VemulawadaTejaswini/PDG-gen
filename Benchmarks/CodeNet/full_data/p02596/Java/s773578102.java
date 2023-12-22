import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int k = Integer.parseInt(sc.next());
    if (k % 2 == 0) {
      pw.println(-1);
      return;
    }
    long remain = 7 % k;
    int ans = 1;
    while (true) {
      if (remain == 0) {
        pw.println(ans);
        return;
      }
      remain = ((remain * 10) + 7) % k;
      ans++;
    }
  }
}
