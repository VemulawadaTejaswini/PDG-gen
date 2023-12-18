import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int Q = scanner.nextInt();
    int[] a = new int[Q];
    int[] b = new int[Q];
    int[] c = new int[Q];
    int[] d = new int[Q];
    for (int i = 0; i < Q; i++) {
      a[i] = scanner.nextInt() - 1;
      b[i] = scanner.nextInt() - 1;
      c[i] = scanner.nextInt();
      d[i] = scanner.nextInt();
    }
    List<List<Integer>> lists = rec(1, M, N);
    int max = 0;
    for (List<Integer> list : lists) {
      int score = 0;
      for (int i = 0; i < Q; i++) {
        if (list.get(b[i]) - list.get(a[i]) == c[i]) score += d[i];
      }
      max = Math.max(max, score);
    }
    System.out.println(max);
  }

  private static List<List<Integer>> rec(int last, int M, int remain) {
    if (remain == 0) {
      ArrayList<List<Integer>> ret = new ArrayList<>();
      ret.add(new ArrayList<>());
      return ret;
    }
    List<List<Integer>> ret = new ArrayList<>();
    for (int i = last; i <= M; i++) {
      List<List<Integer>> tail = rec(i, M, remain - 1);
      for (List<Integer> t : tail) {
        Collections.reverse(t);
        t.add(i);
        Collections.reverse(t);
        ret.add(t);
      }
    }
    return ret;
  }
}
