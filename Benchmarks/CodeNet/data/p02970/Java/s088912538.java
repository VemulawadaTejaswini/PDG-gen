import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int d = sc.nextInt() + 1;
    int ans = 1;

    while (true) {
      d *= 2;
      if (d <= n) {
        ans++;
      } else {
        break;
      }
    }

    System.out.println(ans);

  }
}