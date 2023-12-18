import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    long N = sc.nextInt();
    int K = sc.nextInt();
    int[][] m = new int[11][5];
    for (int i = 0; i < 11; i++) {
      for (int j = 0; j < 5; j++) {
        for (int k = 0; k < 3; k++) {
          for (int l = 0; l < 3; l++) {
            m[i][j] += (i + k) * 7 + j + l + 1;
          }
        }
        m[i][j] %= 11;
      }
    }
    long ans = 0;
    if (N >= 13) {
      long rep = (N - 2) / 11;
      for (int i = 0; i < 11; i++) {
        for (int j = 0; j < 5; j++) {
          if (m[i][j] == K) ++ans;
        }
      }
      ans *= rep;
    }
    if (N >= 3) {
      for (int i = 0; i < (N - 2) % 11; i++) {
        for (int j = 0; j < 5; j++) {
          if (m[i][j] == K) ++ans;
        }
      }
    }
    System.out.println(ans);
  }

}
