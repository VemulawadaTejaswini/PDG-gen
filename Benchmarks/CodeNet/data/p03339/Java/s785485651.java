import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    String S = scanner.next();
    scanner.close();
    int[] countW = new int[N + 1];
    Arrays.fill(countW, 0);
    for (int i = 1; i < N + 1; i++) {
      if (S.charAt(i - 1) == 'W') {
        countW[i] = countW[i - 1] + 1;
      } else {
        countW[i] = countW[i - 1];
      }
    }
    int[] tmp = new int[N];
    for (int i = 0; i < N; i++) {
      tmp[i] = countW[i] + N - (i + 1) - (countW[N] - countW[i + 1]);
    }
    int ans = Integer.MAX_VALUE / 4;
    for (int i : tmp) {
      ans = Math.min(ans, i);
    }
    System.out.println(ans);
  }

}
