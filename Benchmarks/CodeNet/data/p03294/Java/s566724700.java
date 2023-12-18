import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] a = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    sc.close(); 

    int max = 0;

    long gcd = gcd(a[0],a[1]);
    long lcm = a[0] * a[1] / gcd;

    for (int i = 2; i < N; i++) {
      gcd = gcd(lcm, a[i]);
      lcm = lcm * a[i] / gcd;
    }

    long m = lcm - 1;

    for (int i = 0; i < N; i++){
      max += m % a[i]; 
    }

    System.out.println(max);

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