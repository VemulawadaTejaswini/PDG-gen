import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
    int ans = 0;

    int cntA = 0;
    for (int i = 0; i < A; i++) {
      if (cntA == K) {
        break;
      }
      ans += 1;
      cntA++;
    }

    int cntB = 0;
    for (int i = 0; i < B; i++) {
      if (cntB == K - cntA) {
        break;
      }
      ans += 0;
      cntB++;
    }

    int cntC = 0;
    for (int i = 0; i < C; i++) {
      if (cntC == K - cntA - cntB) {
        break;
      }
      ans -= 1;
      cntC++;
    }

    System.out.println(ans);
  }
}
