import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long sum = 0;
    int[] a = new int[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
      sum += a[i];
    }

    long ret = 0;
    for (int i=0;i<n-1;i++){
      sum -= a[i];
      long app =  sum*a[i];
      app = (long) app%1000000007;
      ret += app;
    }

    System.out.println(ret%1000000007);
  }
}
