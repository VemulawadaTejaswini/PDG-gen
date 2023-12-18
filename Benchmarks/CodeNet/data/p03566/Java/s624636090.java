import java.util.Scanner;
import java.util.Arrays;

public class Main{
  static final double INF = Double.MAX_VALUE / 2;
  static int n;
  static int[] t, v;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    t = new int[n];
    for(int i = 0; i < n; i++){
      t[i] = sc.nextInt();
    }
    v = new int[n];
    for(int i = 0; i < n; i++){
      v[i] = sc.nextInt();
    }

    double[][] dist = new double[n + 1][101];
    for(int i = 0; i <= n; i++){
      Arrays.fill(dist[i], -INF);
    }
    dist[0][0] = 0;
    for(int i = 1; i <= n; i++){
      for(int vn = 0; vn <= v[i - 1]; vn++){
        double max = -INF;
        for(int v0 = 0; v0 <= v[i - 1]; v0++){
          if(dist[i - 1][v0] == -INF){
            continue;
          }
          if(Math.abs(vn - v0) <= t[i - 1]){
            int ta = vn - v0;
            int tb = v[i - 1] - vn;
            double d = v[i - 1] * (t[i - 1] - (ta + tb)) +
              v0 * ta + (double)(ta * ta) / 2.0 +
              vn * tb + (double)(tb * tb) / 2.0;
            max = Math.max(max, dist[i - 1][v0] + d);
          }
        }
        dist[i][vn] = max;
      }
    }

    System.out.println(dist[n][0]);
  }
}