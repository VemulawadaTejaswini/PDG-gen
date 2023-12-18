import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    sc.close();

    double max = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (i == j) continue;
        double dist = Math.sqrt(
            (x[i] - x[j]) * (x[i] - x[j]) +
            (y[i] - y[j]) * (y[i] - y[j]));
        max = Math.max(max, dist);
      }
    }

    double ans = max / 2d;
    System.out.println(ans);
  }
}