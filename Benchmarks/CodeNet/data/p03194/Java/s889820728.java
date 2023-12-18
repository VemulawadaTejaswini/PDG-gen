import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long p = sc.nextLong();
    long ans = 0;
    long lim = p;
    for (long i = 0; i < n; i++) {
      lim += n;
      lim /= n;
    }
    for (long i = 1; i <= lim; i++) {
      if (p % Math.pow(i, n) == 0) {
        ans = i;
      }
    }
    System.out.println(ans);
  }

}
