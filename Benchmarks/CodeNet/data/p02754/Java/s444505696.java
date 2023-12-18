import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long a = sc.nextInt();
    long b = sc.nextInt();
    sc.close();

    long ab = a + b;
    long p = n / ab;
    long q = n % ab;
    long o = (p*a) + (q>a?a:q);

    System.out.println(o);
  }
}