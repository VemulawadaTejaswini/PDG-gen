import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String s = sc.next();
    String reverseS = new StringBuilder(s).reverse().toString();
    int total = 0;
    int x = 1;
    int modCount[] = new int[2019];
    int ans = 0;
    for (int i = 0; i < s.length(); i++) {
      modCount[total]++;
      int a = Integer.parseInt(reverseS.substring(i, i + 1));
      total += a * x;
      total %= 2019;
      ans += modCount[total];
      x *= 10;
      x %= 2019;
    }
    pw.println(ans);
  }
}
