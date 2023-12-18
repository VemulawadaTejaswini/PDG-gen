import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long b = sc.nextLong();
    long r = sc.nextLong();

    long ret;
    long a = n / (b + r);
    long mod = n % (b + r);
    if (mod > b) {
      ret = a * b + b;
    } else {
      ret = a * b + mod;
    }
    System.out.println(ret);
  }
}
