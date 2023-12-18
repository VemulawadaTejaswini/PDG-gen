import java.util.Scanner;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    int N = sc.nextInt();
    int i = sc.nextInt();
    System.out.println(N + 1 - i);

  }
}

