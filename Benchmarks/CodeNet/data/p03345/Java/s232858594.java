import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    new Main().solve();
  }

  public void solve() {

    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    long k = input.nextLong();

    int x = Math.abs(a - b);

    if (x > Math.pow(10, 8)) {
      System.out.println("Unfair");
      return;
    }

    if (k % 2 == 0) {
      System.out.println(-x);
    } else {
      System.out.println(x);
    }
  }
}
