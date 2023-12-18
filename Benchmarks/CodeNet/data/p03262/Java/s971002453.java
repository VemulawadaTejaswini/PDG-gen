import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int X = sc.nextInt();

    int[] x = new int[X];

    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
    }

    sc.close();

    long g = Math.abs(x[0] - X);

    for (int i = 1; i < N; i++) {
       g = gcd(g, Math.abs(x[i] - X));
    }

    System.out.println(g);

  }

  public static long gcd(long x, long y){

    if (x < y) {
      long t = x;
      x = y;
      y = t;
    }

    while (y > 0) {
      long r = x % y;
      x = y;
      y = r;
    }

    return x;
    
  }

}