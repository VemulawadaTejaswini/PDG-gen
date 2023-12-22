import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long sum = 0;
    long[] a = new long[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextLong();
      sum += a[i];
    }

    long ret = 0;
    for (int i=0;i<n-1;i++){
      sum -= a[i];
      long t1 = (long) sum%1000000007;
      long app =  (long) t1 * a[i];
      long app1 = (long) app%1000000007;
      ret += app1;
    }

    System.out.println(ret%1000000007);
  }
}
