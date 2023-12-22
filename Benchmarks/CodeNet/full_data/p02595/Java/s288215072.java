import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    int n = sc.nextInt();
    long d = sc.nextInt();
    for (int cnt = 0; cnt < n; cnt++) {
      long x = sc.nextInt();
      long y = sc.nextInt();
      if (x * x + y * y <= d * d) {
        ans++;
      }
    }
    System.out.println(ans);
    sc.close();
  }
}