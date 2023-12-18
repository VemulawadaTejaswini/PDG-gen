import java.util.*;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int ans = 0;
    for (int i = 1; i <= k; i++) {
      if (i <= a) ans++;
      if (i > a+b) ans--;
  }
  System.out.println(ans);
  }
}
