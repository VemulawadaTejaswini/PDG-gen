import java.io.*;

public class Main {

  static int n, k;
  static final long MOD = 1000000007L;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    k = Integer.parseInt(in[1]);
    
    br.close();

    long ans = 0;

    for(int i = k; i <= n+1; i++){
      ans += (((2 * n + 1 - i) * i / 2) - (i * (i-1) / 2) + 1) % MOD;
      ans %= MOD;
    }

    System.out.println(ans);
    
  }
}