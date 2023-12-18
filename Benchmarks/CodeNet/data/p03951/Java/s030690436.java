import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    int ans = N;

    for (int i = 0; i < N; i++) {
      if (S.substring(i, N).equals(T.substring(0, N - i))) {
        break;
      } else {
        ans++;
      }
    }

    System.out.println(ans);

  }
}
