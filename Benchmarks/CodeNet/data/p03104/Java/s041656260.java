import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();

    // B is n bit.
    long b = B;
    int n = 0;
    while (b/2 > 0) {
      b /= 2;
      n++;
    }

    long pow = 1;
    long ans = 0;
    int i = 0;
    while (i <= n) {
      long num1 = num1(B, pow) - num1(A-1, pow);
      if (num1 % 2 == 1) {
        ans += pow;
      }

      pow *= 2;
      i++;
    }
    
    System.out.println(ans);
  }

  private static long num1(long a, long pow) {
    long x = (a+1)/pow;
    long num1 = x/2 * pow;
    if (x%2 == 1) {
      num1 += (a+1)%pow;
    }
    return num1;
  }

}