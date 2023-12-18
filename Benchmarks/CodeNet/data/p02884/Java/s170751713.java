import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    List<Integer>[] exits = new List[N];
    for (int i = 0; i < N; i++) exits[i] = new ArrayList<>();

    for (int i = 0; i < M; i++) {
      int s = scanner.nextInt() - 1;
      int t = scanner.nextInt() - 1;
      exits[s].add(t);
    }

    double min = Double.POSITIVE_INFINITY;

    for (int i = 0; i < N; i++) {
      double[] e = new double[N];
      for (int j = N - 2; j >= 0; j--) {
        double max = 0.d;
        for (int k : exits[j]) {
          e[j] += e[k] + 1;
          max = Math.max(max, e[k] + 1);
        }
        int s = exits[j].size();
        if (s > 1 && j == i) e[j] = (e[j] - max) / (s - 1);
        else e[j] /= s;
      }
      min = Math.min(min, e[0]);
    }

    System.out.println(min);
  }
}
