import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int T = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    int[] max = new int[N];
    max[N - 1] = a[N - 1];
    for (int i = N - 2; i >= 0; i--) max[i] = Math.max(a[i], max[i + 1]);
    int[] min = new int[N];
    min[0] = a[0];
    for (int i = 1; i < N; i++) min[i] = Math.min(a[i], min[i - 1]);

    int cnt1 = 0;
    int maxDiff = 0;
    for (int i = 0; i < N; i++) {
      int diff = max[i] - a[i];
      if (diff > maxDiff) {
        cnt1 = 1;
        maxDiff = diff;
      } else if (diff == maxDiff) {
        cnt1++;
      }
    }

    int cnt2 = 0;
    maxDiff = 0;
    for (int i = N - 1; i >= 0; i--) {
      int diff = a[i] - min[i];
      if (diff > maxDiff) {
        cnt2 = 1;
        maxDiff = diff;
      } else if (diff == maxDiff) {
        cnt2++;
      }
    }

    System.out.println(Math.min(cnt1, cnt2));
  }
}
