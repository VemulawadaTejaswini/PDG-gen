import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextLong();
    }
    long[] b = new long[n+1];
    for(int i = 1;i<n;i++){
      b[i] = a[i] + b[i-1];
    }
    long ans = 0l;
    for(int i = 0;i<n-1;i++){
      long tmp = a[i] * (b[n-1] - b[i]);
      tmp %= 1000000007;
      ans += tmp;
      ans %= 1000000007;
    }
    System.out.println(ans);
  }
}
