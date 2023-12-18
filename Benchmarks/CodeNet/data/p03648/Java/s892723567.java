import java.util.Scanner;

public class Main{
  static final long MAX = 10_000_000_000_001_000L;
  static long k;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    k = sc.nextLong();

    long[] a = null;
    for(int n = 2; n <= 50; n++){
      long s = n * (n - 1) + k - ((k - 1) * n + (n + 1));
      long r = s % (n - 1);
      a = new long[n];
      a[0] = (k - 1) * n + (n + 1);
      a[1] = s / (n - 1) + r;
      for(int i = 1; i < n; i++){
        a[i] = s / (n - 1);
      }
      boolean ok = true;
      for(int i = 0; i < n; i++){
        if(a[i] < 0 || a[i] > MAX){
          ok = false;
          break;
        }
      }
      if(ok){
        break;
      }
    }

    for(int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}