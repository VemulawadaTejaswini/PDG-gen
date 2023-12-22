import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long m = sc.nextLong();

    long x;
    if (n % 2 == 0) {
      x = n + 1;
    } else {
      x = n;
    }

    long cnt = 0;

    while (cnt < m) {
      cnt++;
      System.out.println(cnt + " " + (x - cnt));
    }

  }
}
