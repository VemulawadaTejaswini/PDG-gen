import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = 26;
    int D = scanner.nextInt();
    int[] c = new int[N];
    int[][] s = new int[D][N];
    for (int i = 0; i < N; i++) c[i] = scanner.nextInt();
    for (int i = 0; i < D; i++) for (int j = 0; j < N; j++) s[i][j] = scanner.nextInt();

    int[] t = new int[D];
    for (int i = 0; i < D; i++) t[i] = scanner.nextInt() - 1;

    int score = 0;
    List<Integer>[] last = new List[N];
    for (int i = 0; i < N; i++) {
      last[i] = new ArrayList<>();
      last[i].add(0);
    }
    for (int i = 0; i < D; i++) {
      int type = t[i];
      score += s[i][type];
      last[type].add(i + 1);
      for (int j = 0; j < N; j++) score -= c[j] * (i + 1 - last[j].get(last[j].size() - 1));
    }
    for (int i = 0; i < N; i++) last[i].add(D + 1);

    int M = scanner.nextInt();
    int[] newd = new int[M];
    int[] newt = new int[M];
    for (int i = 0; i < M; i++) {
      newd[i] = scanner.nextInt();
      newt[i] = scanner.nextInt() - 1;
    }
    for (int i = 0; i < M; i++) {
      int d = newd[i];
      int oldType = t[d - 1];
      int newType = newt[i];
      int p1 = upperBound(last[newType], d);
      int p2 = upperBound(last[oldType], d);
      score += s[d - 1][newType] - s[d - 1][oldType];
      score += c[newType] * (d - last[newType].get(p1)) * (last[newType].get(p1 + 1) - d) - c[oldType] * (d - last[oldType].get(p2)) * (last[oldType].get(p2 + 2) - d);
      System.out.println(score);
      t[d - 1] = newType;
      last[oldType].remove(p2 + 1);
      last[newType].add(p1 + 1, d);
    }
  }

  // Returns the largest index of the array where a_i < k.
  // If no element is smaller than or equal to k, returns -1.
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
}
