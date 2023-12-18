import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();

    int[][] pts = new int[N][2];

    for (int i = 0; i < N; i++) {
      pts[i][0] = scanner.nextInt();
      pts[i][1] = scanner.nextInt();
    }

    long min = Long.MAX_VALUE;

    Arrays.sort(pts, Comparator.comparingInt(o -> o[0]));
    min = getMin(N, K, pts, min);

    Arrays.sort(pts, Comparator.comparingInt(o -> o[1]));
    min = getMin(N, K, pts, min);

    System.out.println(min);
  }

  private static long getMin(int n, int k, int[][] pts, long min) {
    for (int i = 0; i <= n - k; i++) {
      long xmin = Integer.MAX_VALUE;
      long xmax = Integer.MIN_VALUE;
      long ymin = Integer.MAX_VALUE;
      long ymax = Integer.MIN_VALUE;
      for (int j = 0; j < k; j++) {
        int x = pts[i + j][0];
        int y = pts[i + j][1];
        xmin = Math.min(xmin, x);
        xmax = Math.max(xmax, x);
        ymin = Math.min(ymin, y);
        ymax = Math.max(ymax, y);
      }
      long area = Math.abs(xmax - xmin) * Math.abs(ymax - ymin);
      min = Math.min(min, area);
    }
    return min;
  }
}
