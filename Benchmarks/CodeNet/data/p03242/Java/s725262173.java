import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int n = in.nextInt();
      int ans = 0;
      int tenExp = 1;

      while (n > 0) {
        if (n % 10 == 9) {
          ans += 1 * tenExp;
        } else {
          ans += 9 * tenExp;        
        }

        n /= 10;
        tenExp *= 10;
      }

      System.out.println(ans);
    }
  }
}