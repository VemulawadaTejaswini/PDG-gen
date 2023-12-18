import java.util.Scanner;

public class Main {
  static final long INF = Integer.MAX_VALUE;
  static int n;
  static long[] t, a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    t = new long[n]; a = new long[n];
    for(int i = 0; i < n; i++){
      t[i] = sc.nextInt();  a[i] = sc.nextInt();
    }

    long tc = t[0], ac = a[0];
    for(int i = 1; i < n; i++){
      long d = binarySearch(t[i], a[i], ac, tc);
      ac += d;
      if(ac % a[i] != 0){
        ac = (ac / a[i]) * a[i] + a[i];
      }
      tc = t[i] * (ac / a[i]);
    }

    long sum = tc + ac;
    System.out.println(sum);
  }

  private static long binarySearch(long T, long A, long ac, long tc){
    long low = -1, high = INF;
    while(high - low > 1){
      long mid = (high + low) / 2;
      if(f(mid, T, A, ac, tc)){
        high = mid;
      }
      else{
        low = mid;
      }
    }
    return high;
  }

  private static boolean f(double d, double T, double A, double a, double t){
    return T * (a + d) - A * t >= 0;
  }
}
