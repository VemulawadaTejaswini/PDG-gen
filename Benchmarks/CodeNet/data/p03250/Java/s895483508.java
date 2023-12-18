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

    int add1 = a * 10 + b + c;
    int add2 = a * 10 + c + b;
    int add3 = b * 10 + c + a;
    int add4 = b * 10 + a + c;
    int add5 = c * 10 + a + b;
    int add6 = c * 10 + b + a;

    System.out.println(
        Math.max(Math.max(Math.max(Math.max(Math.max(add1, add2), add3), add4), add5), add6));
  }
}
