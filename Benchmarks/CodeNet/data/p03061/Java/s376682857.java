import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] a = new int[n];

    for (int i = 0; i < n; ++i) {
      a[i] = sc.nextInt();
    }

    int gcdMax = 1;

    for (int i = 0; i < n; ++i) {
      int gcd = (i == 0) ? a[1] : a[0];
      for (int j = 1; j < n; ++j) {
        gcd = (i == j) ? gcd : gcd(gcd, a[j]);
      }
      gcdMax = (gcd > gcdMax) ? gcd : gcdMax;
    }

    System.out.println(gcdMax);
  }

  public static int gcd(int a, int b) {
    return (a == 0) ? b : gcd(b % a, a);
  }
}