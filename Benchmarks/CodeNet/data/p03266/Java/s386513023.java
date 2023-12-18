import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    long ans = 0;
    for (long a = 1; a <= N; a++) {
      if ((a+1)/K < 1) {
        continue;
      }
      for (long x = (a+1)/K; x*K - a <= N; x++) {
        long b = x*K - a;
        if ((b+1)/K < 1) {
          continue;
        }
        for (long y = (b+1)/K; y*K - b <= N; y++) {
          long c = y*K - b;
          
          if (c != 0 && (c + a) % K == 0) {
            //System.out.println(a + " " + b + " " + c);
            ans++;
          }
        }
      }
    }
    
    System.out.println(ans);
  }
}