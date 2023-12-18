import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int ans = 0;

    while (true) {
      int nowlen = s.length();
      s = s.replaceFirst("01", "");
      int nextlen = s.length();
      if (nowlen == nextlen) {
        s = s.replaceFirst("10", "");
        int nextlen2 = s.length();
        if (nowlen == nextlen2) {
          break;
        } else {
          ans += 2;
        }
      } else {
        ans += 2;
      }
    }

    System.out.println(ans);

  }
}