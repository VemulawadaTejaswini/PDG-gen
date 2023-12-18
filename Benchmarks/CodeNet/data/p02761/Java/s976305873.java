import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] digits = new int[N];
    Arrays.fill(digits, -1);
    for (int i = 0; i < M; i++) {
      int s = scanner.nextInt() - 1;
      int c = scanner.nextInt();
      if (digits[s] >= 0 && digits[s] != c) {
        System.out.println(-1);
        return;
      }
      digits[s] = c;
    }
    if (digits[0] == 0 && N != 1) {
      System.out.println(-1);
      return;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      if (digits[i] >= 0) sb.append(digits[i]);
      else {
        if (i == 0) sb.append(N == 1 ? "0" : "1");
        else sb.append("0");
      }
    }
    System.out.println(sb.toString());
  }
}
