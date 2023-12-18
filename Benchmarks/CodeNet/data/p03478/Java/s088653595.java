import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;

    for (int i = 1; i <= n; i++) {
      int tmp = (i / 100) + ((i / 10) % 10) + (i % 10);
      if ((a <= tmp) && (tmp <= b)) {
        ans += i;
      }
    }

    System.out.println(ans);

  }
}