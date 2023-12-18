import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long b = sc.nextInt();
    long n = sc.nextLong();
    long maxNumber = 0;
    for (long x = 1; x <= n; x++) {
      long fx = (long) (Math.floor(a * x / b) - a * Math.floor(x / b));
      if (fx > maxNumber) {
        maxNumber = fx;
      }
    }
    System.out.println(maxNumber);
  }

}