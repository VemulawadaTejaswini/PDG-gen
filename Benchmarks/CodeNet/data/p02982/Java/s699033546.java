import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int[][] points = new int[N][D];
    for (int i = 0; i < N; i++) for (int j = 0; j < D; j++) points[i][j] = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        double d = getDistance(points[i], points[j]);
        if (d == Math.ceil(d)) ans++;
      }
    }
    System.out.println(ans);
  }
  static double getDistance(int[] p1, int[] p2) {
    double ret = 0;
    for (int i = 0; i < p1.length; i++) {
      ret += Math.pow(p1[i]-p2[i],2);
    }
    return Math.sqrt(ret);
  }
}