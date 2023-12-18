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

    if (Math.abs(a - b) >= Math.pow(10, 8)) {
      System.out.println("Unfair");
      return;
    }

    if (k % 2 == 0) {
      System.out.println(a-b);
    } else {
      System.out.println(b-a);
    }
  }
}
