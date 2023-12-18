import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.valueOf(sc.next());

    int[] x = new int[N];
    int[] y = new int[N];
    
    for (int i = 0; i < N; i++) {
      x[i] = Integer.valueOf(sc.next());
      y[i] = Integer.valueOf(sc.next());
    }

    double[][] costs = new double[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        costs[i][j] = dist(x[i], y[i], x[j], y[j]);
      }
    }

    List<List<Integer>> list = new ArrayList<>();
    perm(IntStream.rangeClosed(1, N).boxed().collect(Collectors.toList()), new ArrayList<>(), list);

    List<Double> ans = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      double d = 0;
      for (int j = 0; j < list.get(i).size() - 1; j++) {
        d += costs[list.get(i).get(j)-1][list.get(i).get(j+1)-1];
      }
      ans.add(d);
    }

    System.out.println(ans.stream().mapToDouble(Double::valueOf).average().getAsDouble());
  }

  private static void perm(List<Integer> candidate, List<Integer> perm, List<List<Integer>> perms) {
    if (candidate.size() == 0) {
      perms.add(perm);
    }
    for (int i = 0; i < candidate.size(); i++) {
      List<Integer> c = new ArrayList<>(candidate);
      List<Integer> p = new ArrayList<>(perm);
      p.add(c.get(i));
      c.remove(i);
      perm(c, p, perms);
    }
  }

  private static double dist(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  }
}