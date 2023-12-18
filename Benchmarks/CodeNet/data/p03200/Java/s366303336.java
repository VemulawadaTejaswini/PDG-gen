import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    int N = S.length();

    long ans = 0;
    int black = 0;

    for (int i = 0; i < N; i++) {
      char c = S.charAt(i);
      if (c == 'B') {
        black += 1;
      } else {
        ans += black;
      }
    }

    System.out.println(ans);
  }
}