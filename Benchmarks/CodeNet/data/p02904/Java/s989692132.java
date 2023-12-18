import java.util.Scanner;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] p = new int[N];
    int[] cummDelta = new int[N + 1];
    for (int i = 0; i < N; i++) p[i] = scanner.nextInt();
    for (int i = 1; i < N; i++) cummDelta[i] = cummDelta[i - 1] + (p[i] > p[i - 1] ? 1 : 0);

    int count = N - K + 1;
    for (int i = 0; i < N - K; i++) if (cummDelta[i + K - 1] - cummDelta[i] == K - 1) count--;

    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < K; i++) set.add(p[i]);

    for (int i = 0; i < N - K; i++) {
      set.remove(p[i]);
      if (p[i] <= set.first() && p[i + K] >= set.last()) count--;
      set.add(p[i + K]);
    }
    System.out.println(count);
  }
}
