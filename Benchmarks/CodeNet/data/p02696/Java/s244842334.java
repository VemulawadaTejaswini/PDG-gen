import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long n = sc.nextInt();
    double max = 0.0;

    for (int x = 1; x <= n; x++) {
      double tmp = Math.floor((a * x) / b) - a * Math.floor(x / b);
      if (tmp > max) {
        max = tmp;
      }
    }
    System.out.println((int) max);
  }
}