import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 30000;
    String s = sc.next();
    String t = sc.next();
    char[] tc = t.toCharArray();

    for (int cnt = 0; cnt < (int) Math.pow(2, t.length()); cnt++) {
      StringBuilder tcs = new StringBuilder("");
      int tmpCnt = cnt;
      int ansCnt = 0;
      for (int j = 0; j < t.length(); j++) {

        if (tmpCnt % 2 == 0) {
          tcs.append(tc[j]);

        } else {
          tcs.append(".");
          ansCnt++;
        }
        tmpCnt /= 2;
      }
      // System.out.println(tcs);
      StringBuilder sei = new StringBuilder(".*");
      if (s.matches(tcs.append(sei).append(sei).toString())) {
        ans = Math.min(ans, ansCnt);
      }

    }
    System.out.println(ans);
    sc.close();
  }
}
