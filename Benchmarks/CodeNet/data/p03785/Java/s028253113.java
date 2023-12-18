import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int C = scanner.nextInt();
    int K = scanner.nextInt();
    int[] T = new int[N];
    for (int i = 0; i < N; i++) T[i] = scanner.nextInt();
    Arrays.sort(T);

    int last = 0;
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      if (T[i] - T[last] > K || i - last + 1 > C) {
        cnt++;
        last = i;
      }
    }
    System.out.println(cnt + 1);
  }
}
