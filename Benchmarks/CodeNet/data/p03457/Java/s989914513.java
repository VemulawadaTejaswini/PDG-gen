import java.util.Scanner;
import java.lang.Math;
public class Main {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int t[] = new int[N+1];
    int xt[] = new int[N+1];
    int yt[] = new int[N+1];
    t[0]=0;
    xt[0]=0;
    yt[0]=0;
    for(int i = 1; i<=N; i++){
      t[i] = sc.nextInt();
      xt[i] = sc.nextInt();
      yt[i] = sc.nextInt();      
    }
    boolean can = true;
    int dt=0;
    int dist=0;
    for(int i = 0; i<=N; i++){
      if(i!=N) {
        dt = t[i+1] - t[i];
        dist = Math.abs(xt[i+1] - xt[i]) + Math.abs(yt[i+1] - yt[i]);
      if(dt < dist) can = false;
      if(dist %2 != dt %2) can = false;
      }
    }
    if(can)   System.out.println("Yes");
    else System.out.println("No");
  }
}
