import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] a = new int[N + 1];
    for (int i = 0; i < N; i++) a[i + 1] = scanner.nextInt();

    for (int i = 1; i <= N; i++) {
      a[i] += a[i - 1];
      a[i] %= K;
    }
    for (int i = 1; i <= N; i++) {
      a[i] -= i % K;
      if (a[i] < 0) a[i] += K;
    }

    long count = 0;
    HashMap<Integer, Integer> freq = new HashMap<>();
    for (int i = 0; i <= N; i++) {
      count += freq.getOrDefault(a[i], 0);
      freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
      if (i >= K - 1) freq.put(a[i - K + 1], freq.get(a[i - K + 1]) - 1);
    }
    System.out.println(count);
  }
}
