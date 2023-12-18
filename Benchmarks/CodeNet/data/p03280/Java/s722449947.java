import java.util.Scanner;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    int A = sc.nextInt();
    int B = sc.nextInt();
    System.out.println((A - 1) * (B - 1));
  }
}

