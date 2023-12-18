import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    List<Integer>[] exits = new List[N];
    for (int i = 0; i < N; i++) exits[i] = new ArrayList<>();

    int[][] edges = new int[M][2];
    for (int i = 0; i < M; i++) {
      int s = scanner.nextInt() - 1;
      int t = scanner.nextInt() - 1;
      exits[s].add(t);
      edges[i][0] = s;
      edges[i][1] = t;
    }

    double[] e = new double[N];
    for (int j = N - 2; j >= 0; j--) {
      for (int k : exits[j]) e[j] += e[k] + 1;
      e[j] /= exits[j].size();
    }
    double min = e[0];

    for (int i = 0; i < M; i++) {
      if (exits[edges[i][0]].size() <= 1) continue;
      Arrays.fill(e, 0.d);
      exits[edges[i][0]].remove(Integer.valueOf(edges[i][1]));

      for (int j = N - 2; j >= 0; j--) {
        for (int k : exits[j]) e[j] += e[k] + 1;
        e[j] /= exits[j].size();
      }
      if (e[0] < Double.POSITIVE_INFINITY) min = Math.min(min, e[0]);

      exits[edges[i][0]].add(edges[i][1]);
    }
    System.out.println(min);
  }
}
