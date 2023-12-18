import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    long ans = 0;
    if (n <= 3 * k) {
      if (k % 2 == 1) {
        ans = (long)Math.pow(n/k, 3);
      } else {
        ans += (long)Math.pow(n/k, 3);
        ans += (long)Math.pow((n-k/2)/k+1, 3);
      }
    }

    System.out.println(ans);
  }
}
