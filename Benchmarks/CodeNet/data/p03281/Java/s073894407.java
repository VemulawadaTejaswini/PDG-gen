import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int ans = 0;

    for (int i = 1; i <= n; i += 2) {
      int cnt = 0;
      for (int j = 1; (j <= i) && (cnt <= 8); j++) {
        if (i % j == 0) {
          cnt++;
        }
      }
      if (cnt == 8) {
        ans++;
      }
    }

    System.out.println(ans);

  }

}