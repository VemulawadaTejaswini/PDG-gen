import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int removals = 0;

    for (int i = 1; i < s.length(); ++i) {
      if (s.charAt(i - 1) == '0' && s.charAt(i) == '1' ||
          s.charAt(i - 1) == '1' && s.charAt(i) == '0') {
        int lo = i - 1, hi = i + 1;
        while (lo > 0 && hi < s.length()
            && (s.charAt(lo - 1) == '0' && s.charAt(hi) == '1'
            || s.charAt(lo - 1) == '1' && s.charAt(hi) == '0')) {
          --lo;
          ++hi;
        }
        StringBuilder sb = new StringBuilder(s.substring(0, lo));
        sb.append(s.substring(hi));
        s = sb.toString();
        removals += hi - lo;
        i = lo;
      }
    }

    System.out.println(removals);
  }
}
