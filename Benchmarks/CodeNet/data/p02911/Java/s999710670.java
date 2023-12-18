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
    int k = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    int[] ansCount = new int[n];
    for (int i = 0; i < q; i++) {
      int a = Integer.parseInt(sc.next());
      ansCount[a - 1] += 1;
    }
    for (int i = 0; i < n; i++) {
      int score = k - (q - ansCount[i]);
      pw.println(score > 0 ? "Yes" : "No");
    }
  }
}
