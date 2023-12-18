import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    Arrays.sort(a);
    boolean[] used = new boolean[N];
    int cnt = 0;
    for (int i = N - 1; i >= 0; i--) {
      if (used[i]) continue;
      int j = Arrays.binarySearch(a, 0, i, (Integer.highestOneBit(a[i]) << 1) - a[i]);
      if (j >= 0) {
        cnt++;
        used[j] = true;
      }
    }
    System.out.println(cnt);
  }
}
