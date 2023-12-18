import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    long ans = 0;
    for (int i = K+1; i <= N; i++) {
      ans += (long)(i-K)*(N/i);
      if (N%i != 0 && N%i >= K) {
        ans += K == 0 ? N%i : N%i-K+1;
      }
    }
    System.out.println(ans);
  }
}