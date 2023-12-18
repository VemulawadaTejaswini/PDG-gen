import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<int[]> edges = new ArrayList<>();
    int L = scanner.nextInt();

    int r = findR(L);
    int N = r + 1;
    for (int i = N - 1; i >= 1; i--) {
      edges.add(new int[]{i, i + 1, 0});
      edges.add(new int[]{i, i + 1, 1 << (N - i - 1)});
    }

    int k = L - (1 << r);
    for (int i = r - 1; i >= 0; i--) {
      int d = 1 << i;
      if (k >= d) {
        edges.add(new int[]{1, N - i, L - k});
        k -= d;
      }
    }

    System.out.printf("%d %d\n", N, edges.size());
    for (int[] edge : edges) {
      System.out.printf("%d %d %d\n", edge[0], edge[1], edge[2]);
    }
  }

  private static int findR(int L) {
    int left = 0;
    int right = (int) Math.floor(Math.log(L) / Math.log(2)) + 1;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (1L << mid > L) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return left;
  }
}
