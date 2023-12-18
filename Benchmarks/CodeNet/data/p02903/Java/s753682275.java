import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] P = new int[N];
    Arrays.setAll(P, i -> sc.nextInt());
    int result = 1;
    TreeSet<Integer> ts = new TreeSet<Integer>();
    int over = 0;
    int count = 1;
    for (int i = 0; i < N; i++) {
      ts.add(P[i]);
      if (i >= K) {
        if (ts.first() != P[i - K] || ts.last() != P[i])
          result++;
        ts.remove(P[i - K]);
      }
      if (i >= 1) {
        if (P[i - 1] < P[i]) {
          count++;
          if (count == K)
            over++;
        } else
          count = 1;
      }
    }
    System.out.println(result - (over >= 2 ? over - 1 : 0));
  }
}