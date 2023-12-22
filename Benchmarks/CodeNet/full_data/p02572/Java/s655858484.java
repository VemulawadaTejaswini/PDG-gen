import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long total = 0l;
    for(int i = 0;i<n;i++){
      a[i] = sc.nextLong();
      total += a[i];
    }
    long[] b = new long[n];
    for(int i = 0;i<n-1;i++){
      total -= a[i];
      b[i] = total;
    }
    long ans = 0l;
    for(int i = 0;i<n-1;i++){
      ans += a[i]*b[i];
      ans %= 1000000007;
    }
    System.out.println(ans);
  }
}
