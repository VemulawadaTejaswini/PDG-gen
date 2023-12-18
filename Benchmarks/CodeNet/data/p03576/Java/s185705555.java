import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[][] arr = new long[n][2];
    for(int i = 0; i < n; i++) {
      long x = sc.nextLong();
      long y = sc.nextLong();
      arr[i] = {x, y};
    }
    Arrays.sort(arr, new Comparator<int[]>() {
      public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
      }
    });
    long ans = Long.MAX_VALUE;
    for(int i = 0; i < n - k + 1; i++) {
      long xmin = arr[i][0];
      long xmax = arr[i + k - 1][0];
      long ymin = arr[i][1];
      long ymax = arr[i][1];
      for(int j = 1; j < k; j++) {
        ymin = Math.min(ymin, arr[i + j][1]);
        ymax = Math.max(ymax, arr[i + j][1]);
      }
      long t = (xmax - xmin) * (ymax - ymin);
      ans = Math.min(ans, t);
    }
    System.out.println(ans);
  }
}