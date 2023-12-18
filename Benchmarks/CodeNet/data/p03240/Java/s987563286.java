import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    int[] h = new int[n];
    int nx = 0;
    int ny = 0;
    int nh = 0;
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      h[i] = sc.nextInt();
      if(h[i] != 0) {
        nx = x[i];
        ny = y[i];
        nh = h[i];
      }
    }
    int ansx = 0;
    int ansy = 0;
    int ansh = 0;
    for(int X = 0; X <= 100; X++) {
      for(int Y = 0; Y <= 100; Y++) {
        int high = nh + Math.abs(X - nx) + Math.abs(Y - ny);
        int p = 0;
        for(int i = 0; i < n; i++) {
          int s = Math.max(high - Math.abs(x[i] - X) - Math.abs(y[i] - Y), 0);
          if(s != h[i]) p = 1;
        }
        if(p == 0) {
          ansx = X;
          ansy = Y;
          ansh = high;
        }
      }
    }
    System.out.print(ansx);
    System.out.print(" ");
    System.out.print(ansy);
    System.out.print(" ");
    System.out.print(ansh);
  }
}