import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class Main {
  private static void solve(int n, int m, int[] a, int[] b, int[] c) {
    Arrays.sort(a);
    int[][] d = new int[m][2];
    for (int i = 0; i < m; i++) {
      d[i][0] = b[i];
      d[i][1] = c[i];
    }
    Arrays.sort(d, (v1, v2) -> v2[1] - v1[1]);
    long s = 0;
    int count = 0;
    int j = 0;
    for (int i = n - 1; i >= 0; i--) {
      int vala = a[i];
      while (j < m && d[j][1] >= vala && count < n) {
        if (count + d[j][0] <= n) {
          s += (long) d[j][1] * d[j][0];
          count += d[j][0];
          j++;
        } else {
          s += (long) d[j][1] * (n - count);
          count = n;
          j++;
        }
      }
      if (count == n) {
        break;
      } else {
        s += vala;
        count += 1;
      }
    } 
    System.out.println(s);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nums = sc.nextLine().split(" ");
    int n = Integer.parseInt(nums[0]);
    int m = Integer.parseInt(nums[1]);
    int[] a = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int [] b = new int[m];
    int [] c = new int[m];
    for (int i = 0; i < m; i++) {
      String[] bc = sc.nextLine().split(" ");
      b[i] = Integer.parseInt(bc[0]);
      c[i] = Integer.parseInt(bc[1]);
    }
    solve(n, m, a, b, c);
    sc.close();
  }
}
