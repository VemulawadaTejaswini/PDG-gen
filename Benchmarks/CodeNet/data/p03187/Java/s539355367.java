import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int n = sc.nextInt();
    int[] x = new int[n];
    for (int i=0; i<n; i++) {
      x[i] = sc.nextInt();
    }

    int distWithCCWStart = x[0] + maxDist(x, l, 1, n-1, x[0]);
    int distWithCWStart = l - x[n-1] + maxDist(x, l, 0, n-2, x[n-1]);
    System.out.println(Math.max(distWithCCWStart, distWithCWStart));
  }

  static int maxDist(int[] x, int l, int first, int last, int currPos) {
    int dist = 0;
    while (first <= last) {
      int ccwToFirstDist = currPos <= x[first] ? x[first] - currPos : l - currPos + x[first];
      int cwToLast = currPos >= x[last] ? currPos - x[last] : currPos + l - x[last];
      if (ccwToFirstDist > cwToLast) {
        dist += ccwToFirstDist;
        currPos = x[first];
        first++;
      } else {
        dist += cwToLast;
        currPos = x[last];
        last--;
      }
    }
    return dist;
  }
}
