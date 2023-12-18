import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long ans = 0;
    for(long b = k + 1; b <= n; b++) {
      long r = n % b;
      long t = n / b;
      ans += (t * (b - k));
      if(r >= k) ans += (r - k + 1); 
    }
    System.out.println(ans);
  }
}