import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int ans = 0;

    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'A') {
        ans = -i;
        break;
      }
    }

    for (int i = n - 1; i >= 0; i--) {
      if (s.charAt(i) == 'Z') {
        ans += i;
        break;
      }
    }

    System.out.println(ans + 1);

  }
}