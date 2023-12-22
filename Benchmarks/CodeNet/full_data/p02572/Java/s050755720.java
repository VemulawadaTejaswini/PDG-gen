import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    final long mod = 1000000007;
    long sum = 0, ans = 0, a;
    for(int i = 0; i < n; i++){
      a = sc.nextInt();
      ans += (sum * a) % mod;
      sum += a;
    }
    
    ans = ans % mod;
    if(ans < 0){
        ans += mod;
    }
    System.out.println(ans);
  }
}
