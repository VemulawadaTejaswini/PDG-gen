import java.util.*;

class Main {
  
  public static final int mod = 1000000007;
  public static final int fmax = 200005;
  public static long fac[] = new long[fmax];
  public static long inv[] = new long[fmax];
  public static long finv[] = new long[fmax];
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = Long.parseLong(sc.next());
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
	//long ans = 0;
    
    if(n==2 & a==1 & b==2){
      System.out.println("0");
      return;
    }
    
    NCRinit();
    
    long ap = n % mod;
    long bp = n % mod;
    
    for(long i=1; i<=a-1; i++){
      ap *= (n-i);
      ap %= mod;
    }
    for(long i=1; i<=b-1; i++){
      bp *= (n-i);
      bp %= mod;
    }
    
    for(int i=1; i<=a; i++){
      ap *= inv[i];
      ap %= mod;
    }
    for(int i=1; i<=b; i++){
      bp *= inv[i];
      bp %= mod;
    }
    
    long ans = modpow(2, n);
    ans %= mod;
    
    ans -= 1L;
    ans %= mod;
    if(ans<0) ans += mod;
    ans -= ap;
    ans %= mod;
    if(ans<0) ans += mod;
    ans -= bp;
    ans %= mod;
    if(ans<0) ans += mod;
    
    System.out.println(ans);
    
  }

  // a^n mod を計算する
  public static long modpow(long a, long n) {
    long ret = a;
    int s = 1;
    for(int i=0; i<100; i++){
      s *= 2;
      if(s==n){
        return (ret*ret)%mod;
      }
      if(s>n){
        s /= 2;
        break;
      }
      ret *= ret;
      ret %= mod;
    }
    for(int i=s+1; i<=n; i++){
      ret *= a;
      ret %= mod;
    }
    return ret;
  }
  
  // テーブルを作る前処理
  public static void NCRinit() {
    fac[0] = 1;
    fac[1] = 1;
    finv[0] = 1;
    finv[1] = 1;
    inv[0] = 1;
    inv[1] = 1;
    for (int i = 2; i < fmax; i++){
      fac[i] = fac[i - 1] * i % mod;
      inv[i] = mod - inv[mod%i] * (mod / i) % mod;
      finv[i] = finv[i - 1] * inv[i] % mod;
    }
  }
 
  // 二項係数計算
  public static long ncr(int n, int k){
    if (n < k) return 0;
    if (n < 0 || k < 0) return 0;
    return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
  }
  
}
