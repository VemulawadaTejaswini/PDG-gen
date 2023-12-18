import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] x = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
    }
    int gcd = Math.abs(X - x[0]);
    for (int i = 1; i < N; i++) {
      gcd = gcd(gcd, Math.abs(X - x[i]));
    }
    
    System.out.println(gcd);
  }
  
  private static int gcd(int a, int b) {
    if (b > a) {
      int tmp = a;
      a = b;
      b = tmp;
    }
    if (b == 0) {
      return a;
    }
    
    return gcd(b, a % b);
  }
}