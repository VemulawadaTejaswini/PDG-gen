import java.util.Scanner;

public class Main {
  public static long gcd(long a, long b) {
    return b == 0 ? a: gcd(b, a % b);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = gcd(sc.nextLong(), sc.nextLong());
    int count = 1;
    for (int i = 2; i <= Math.sqrt(n); i++)
      if (n % i == 0) {
        while (n % i == 0)
          n /= i;
        count++;
      }
    System.out.println(count + (n == 1 ? 0 : 1));
  }
}