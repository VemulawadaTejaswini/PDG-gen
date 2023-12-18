import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();
    String T = sc.next();

    // 最大公約数を求める
    int n = N;
    int m = M;
    int tmp;
    while ((tmp = n % m) != 0) {
      n = m;
      m = tmp;
    }
    int gcd = m;

    boolean flag = true;
    for (int i = 0; i < gcd; i++) {
      if (S.charAt(N * i / gcd) != T.charAt(M * i / gcd)) {
        flag = false;
        break;
      }
    }

    System.out.println(flag ? N * M / gcd : -1);
  }
}
