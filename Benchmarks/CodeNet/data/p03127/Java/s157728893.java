import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    for (int i = 1; i < N; i++) {
      if (A[i] > A[i-1]) {
        A[i] = gcd(A[i], A[i-1]);
      } else {
        A[i] = gcd(A[i-1], A[i]);
      }
    }
    
    System.out.println(A[N-1]);
  }
  
  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a%b);
  }
}