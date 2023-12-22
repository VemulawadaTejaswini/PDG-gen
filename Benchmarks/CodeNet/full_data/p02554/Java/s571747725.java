import java.util.*;


class Main{
  private static int[] fac = new int[1000000];
  private static int[] finv = new int[1000000];
  private static int[] inv = new int[1000000];
  private static int MOD = 1000000007;
  public static void COMinit() {
    fac[0] = 1;
    fac[1] = 1;
    finv[0] = 1;
    finv[1] = 1;
    inv[1] = 1;
    for (int i = 2; i < 1000000; i++){
      fac[i] = fac[i - 1] * i % MOD;
      inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
      finv[i] = finv[i - 1] * inv[i] % MOD;
    }
  }
  public static long COM(int n, int k){
    if (n < k) return 0;
    if (n < 0 || k < 0) return 0;
    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
  }
    //ans
  public static void main(String[] args){
    COMinit();
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long r=0;
    long use = 1;
    long up2 = 2;
    long up7 = 1;
    int[] is = new int[1];
    for(int i=0;i<N-2;i++){
      up7 = up7*7;
      if(up7>1000000007){
        up7 = up7%1000000007;
      }
    }
    //System.out.println(up7);
    for(int i=2;i<=N;i++){
      use = COM(N,i);
      //System.out.println(finv[N-i]);
      //System.out.println(up2);
      //System.out.println(up7);
      r+=(use*(up2-2)*up7)%1000000007;
      //System.out.println(r);
      if(r>1000000007){
        r=r%1000000007;
      }
      up2 = up2*2;
      up7 = up7*142857122;
      if(up2>1000000007){
        up2=up2%1000000007;
      }
      if(up7>1000000007){
        up7=up7%1000000007;
      }
    }
    System.out.println(r);
  }
}