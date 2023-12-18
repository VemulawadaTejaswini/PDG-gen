import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int M = in.nextInt();
      String S = in.next();
      String T = in.next();
      int gcdNM = gcd(N, M);
      long lcmNM = ((long)N / gcd(N, M)) * M;
      int stepS = M / gcdNM;
      int stepT = N / gcdNM;
      int curS = 0;
      int curT = 0;
      boolean isExisted = true;

      while (curS < S.length() && curT < T.length()) {
        int idxXS = curS * stepS + 1;
        int idxXT = curT * stepT + 1;

        if (idxXS == idxXT) {
          if (S.charAt(curS) != T.charAt(curT)) {
            isExisted = false;
            break;
          } else {
            ++curS;
            ++curT;
          }
        } else if (idxXS < idxXT) {
          ++curS;
        } else if (idxXT < idxXS) {
          ++curT;
        }
      }
      
      if (isExisted) {
        System.out.println(lcmNM);
      } else {
        System.out.println(-1);
      }
    }
  }

  public static int gcd (int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}
