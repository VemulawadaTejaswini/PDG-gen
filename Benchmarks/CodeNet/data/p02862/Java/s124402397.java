import java.util.*;

public class Main{
  static int p = 1000000007;
  static long[] fac, inv, finv;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = X+Y;
    if(Z%3 != 0){
      System.out.println(0);
      return;
    }
    
    
    int d = Z/3;
    int e = (d-Math.abs(X-Y))/2;
    
    fac = new long[Z];
    finv = new long[Z];
    inv = new long[Z];
    fac[0] = fac[1] = 1;
    finv[0] = finv[1] = 1;
    inv[1] = 1;
    for (int i = 2; i < Z; i++){
        fac[i] = fac[i - 1] * i % p;
        inv[i] = p - inv[p%i] * (p/i)%p;
        finv[i] = finv[i-1] * inv[i] % p;
    }
    long ans = cmb(d, e);
    System.out.println(ans);
  }
  
  public static long cmb(int n, int k){
    if(n < k){
      return 0;
    }
    if(n<0 || k<0){
      return 0;
    }
    return fac[n] * (finv[k] * finv[n - k] % p) % p;
  }
}
