import java.util.*;
public class Main{
   static long factorial(int n, long ans){
    if(n <= 1) return ans;
    return factorial(n-1, ans*n);  
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long mod = (long)(Math.pow(10,9))+7;
    long ans = 0;
    long fact[] = new long[n+2];
    fact[n+1] = factorial(n+1, 1);
    for(int i = 0 ; i <= n-k+1; i++){
      if(fact[k+i] == 0) fact[k+i] = factorial(k+i, 1);
      if(fact[n-k-i] == 0) fact[n-k-i] = factorial(n-k-i, 1);
      ans += fact[n+1]/(fact[k+i]*fact[n-k-i+1]);
    }
    if(ans > mod) ans = ans % mod;
    System.out.println(ans);
  }
}