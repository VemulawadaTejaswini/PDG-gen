import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
    
    int max = Math.max(Math.max(A, B), C);
    long ans = A + B + C - max + power(max, K);
    
    System.out.println(ans);
  }
  
  private static long power(int max, int K) {
    long ret = max;
    for (int i = 0; i < K; i++) {
      ret *= 2;
    }
    return ret;
  }
}