import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long start = System.currentTimeMillis();

    int N = 26;
    int D = scanner.nextInt();
    int[] c = new int[N];
    int[][] s = new int[D][N];
    for (int i = 0; i < N; i++) c[i] = scanner.nextInt();
    for (int i = 0; i < D; i++) for (int j = 0; j < N; j++) s[i][j] = scanner.nextInt();
    int[] t = new int[D];

    int score = 0;
    List<Integer>[] last = new List[N];
    for (int i = 0; i < N; i++) {
      last[i] = new ArrayList<>();
      last[i].add(0);
    }
    for (int d = 0; d < D; d++) {
      int type = -1;
      int max = -36500 * 26;
      for (int i = 0; i < N; i++) {
        int ss = s[d][i];
        for (int j = 0; j < N; j++)
          if (j != i) ss -= c[j] * (d + 1 - last[j].get(last[j].size() - 1));
        if (ss > max) {
          max = ss;
          type = i;
        }
      }
      t[d] = type;
      last[type].add(d + 1);
      score += max;
    }
    for (int i = 0; i < N; i++) last[i].add(D + 1);

    Random rand = new Random();
    while (System.currentTimeMillis() - start < 2000) {
      int d = rand.nextInt(D) + 1;
      int oldType = t[d - 1];
      int newType = rand.nextInt(N);
      int newScore = update(c, s, t, score, last, d, newType);
      if (newScore > score) {
        score = newScore;
        t[d - 1] = newType;
        int p1 = upperBound(last[newType], d);
        int p2 = upperBound(last[oldType], d);
        last[oldType].remove(p2 + 1);
        last[newType].add(p1 + 1, d);
      }
    }

    for (int i = 0; i < D; i++) {
      System.out.println(t[i] + 1);
    }
  }

  private static int update(int[] c, int[][] s, int[] t, int score, List<Integer>[] last, int d,
      int newType) {
    int oldType = t[d - 1];
    int p1 = upperBound(last[newType], d);
    int p2 = upperBound(last[oldType], d);
    score += s[d - 1][newType] - s[d - 1][oldType];
    score += c[newType] * (d - last[newType].get(p1)) * (last[newType].get(p1 + 1) - d)
        - c[oldType] * (d - last[oldType].get(p2)) * (last[oldType].get(p2 + 2) - d);
    return score;
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
}
