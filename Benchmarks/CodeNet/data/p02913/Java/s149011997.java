import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    int left = 0;
    int right = N / 2 + 1;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (possible(s, N, mid)) {
        left = mid;
      } else {
        right = mid;
      }
    }
    System.out.println(left);
  }

  private static boolean possible(char[] s, int N, int K) {
    for (int i = 0; i <= N - K * 2; i++) {
      loop:
      for (int j = i + K; j <= N - K; j++) {
        for (int k = 0; k < K; k++) if (s[i + k] != s[j + k]) continue loop;
        return true;
      }
    }
    return false;
  }
}
