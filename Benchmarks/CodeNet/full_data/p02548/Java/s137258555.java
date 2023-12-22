import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int ans = 0;

    for (int i = n - 1; i > 0; i--) {
      for (int j = 1; j <= (int) Math.sqrt(i); j++) {
        if ((i % j) == 0) {
          if (j == Math.sqrt(i)) {
            ans++;
          } else {
            ans += 2;
          }
        }
      }
    }

    System.out.println(ans);
  }
}