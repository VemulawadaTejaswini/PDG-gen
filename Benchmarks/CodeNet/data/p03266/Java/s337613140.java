import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    // a+b = l*K, b = l*K - a
    // b+c = m*K, l*K + n*K - 2*a = m*K
    // c+a = n*K, c = n*K - a
    //
    // (l+n-m)*K = 2*a
    // x*K = 2*a
    // y*K = 2*b
    // z*K = 2*c
    
    int sum1 = 0;
    int sum2 = 0;
    for (int a = 1; a <= N; a++) {
      if (a%K == 0) {
        sum1++;
      }
      if (K%2 == 0 && a%K == K/2) {
        sum2++;
      }
    }
    
    System.out.println(sum1*sum1*sum1 + sum2*sum2*sum2);
  }
}