import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int n = Integer.parseInt(line);
    line = sc.nextLine();
    
    String subAi[] = new String[n];
    subAi = line.split(" ", 0);
    int mod = 1000000007;
    
    //A1からAnまでの値を格納する配列 Ai
    long Ai[] = new long[n];
    for(int i = 0; i < n; i++){
      Ai[i] = Integer.parseInt(subAi[i]);
    }
    
    long Si[] = new long[n];
    Si[n - 1] = 0;
    for(int i = n - 2; i >= 0; i--){
      Si[i] = Si[i + 1] + Ai[i + 1];
      System.out.println(Si[i]);
    }
    
    long ans = 0;
    for(int i = 0; i < n - 1; i++){
      ans += Ai[i] * Si[i] % mod;
      ans %= mod;
    }
    
    //ans = ans % mod;
    System.out.println(ans);
  }
}