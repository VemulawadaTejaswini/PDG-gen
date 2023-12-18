import java.util.Scanner;
import java.util.Arrays;

public class Main{
  static final long INF = Long.MAX_VALUE / 2;
  static int n, m;
  static int[] a, b;
  static long[] c;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    m = sc.nextInt();
    a = new int[m];
    b = new int[m];
    c = new long[m];
    for(int i = 0; i < m; i++){
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
      c[i] = sc.nextInt();
    }

    long[] dist = new long[n];
    Arrays.fill(dist, INF);

    boolean cycled = false;
    dist[0] = 0;
    for(int i = 0; i < n; i++){
      boolean updated = false;
      for(int j = 0; j < m; j++){
        if(dist[a[j]] != INF && dist[b[j]] > dist[a[j]] - c[j]){
          dist[b[j]] = dist[a[j]] - c[j];
          updated = true;
        }
      }
      if(!updated){
        break;
      }
      if(i == n - 1){
        cycled = true;
      }
    }

    if(cycled){
      System.out.println("inf");
    }
    else{
      System.out.println(-dist[n - 1]);
    }
  }
}
