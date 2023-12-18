import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long k = sc.nextLong();

    long rest = n % k;
    long abs = Math.abs(rest - k);
    System.out.println(Math.min(rest, abs));
  }
}