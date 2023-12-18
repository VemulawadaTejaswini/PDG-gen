import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int C = scanner.nextInt();
    char[] S = scanner.next().toCharArray();

    List<Integer> workdays = new ArrayList<>();
    for (int i = 0; i < N; i++) if (S[i] == 'o') workdays.add(i);
    int W = workdays.size();
    int[] right = new int[W];
    for (int i = W - 1; i >= 0; i--) {
      int next = lowerBound(workdays, workdays.get(i) + C);
      if (next == W) right[i] = 1;
      else right[i] = right[next] + 1;
    }
    int[] left = new int[W];
    for (int i = 0; i < W; i++) {
      int prev = upperBound(workdays, workdays.get(i) - C);
      if (prev < 0) left[i] = 1;
      else left[i] = left[prev] + 1;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < W; i++) {
      int r = i < W - 1 ? right[i + 1] : 0;
      int l = i > 0 ? left[i - 1] : 0;
      if (r + l < K) sb.append(workdays.get(i) + 1).append('\n');
    }
    System.out.print(sb.toString());
  }

  public static int upperBound(List<Integer> a, int k) {
    int left = -1;
    int right = a.size();
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (a.get(mid) < k) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return left;
  }

  public static int lowerBound(List<Integer> a, int k) {
    int left = -1;
    int right = a.size();
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (k < a.get(mid)) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return right;
  }
}
