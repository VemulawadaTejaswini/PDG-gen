import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    int n = Integer.parseInt(data[0]);
    int a = Integer.parseInt(data[1]);
    int b = Integer.parseInt(data[2]);
    
    COMinit();
    int result = 0;
    for(int i=1; i<=n; i++){
      if(i==a || i==b){
        continue;
      }
      result += combination(n, i);
    }
    System.out.println(result);
  }
  
  public static int MOD = 1_000_000_007;
  public static int MAX = 1000000000;
  public static long[] fac = new long[MAX];
  public static long[] finv = new long[MAX];
  public static long[] inv = new long[MAX];
  
  public static void COMinit() {
    fac[0] = fac[1] = 1;
    finv[0] = finv[1] = 1;
    inv[1] = 1;
    for(int i = 2; i < MAX; i++) {
      fac[i] = fac[i-1] * i % MOD;
      inv[i] = MOD - inv[MOD%i] * (MOD/i) % MOD;
      finv[i] = finv[i-1] * inv[i] % MOD;
    }
  }
  
  public static long combination(int n, int k){
    if(n < k || n < 0 || k < 0) return 0;
    return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
  }
}
