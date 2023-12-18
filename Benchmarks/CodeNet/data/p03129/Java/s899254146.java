import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
  }
  public void solve() {
    Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = scan.nextInt();
    int K = scan.nextInt();
    if (K * 2 - 1 <= N) {
      System.out.println("YES");
    } else {
      System.out.println("YES");
    }
  }
}
