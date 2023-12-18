import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.solve());
  }

  int n;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
    } finally {
      sc.close();
    }
  }

  String solve() {
    int ans = calc();
    if (ans == -1) return ":(";
    return String.valueOf(ans);
  }

  int calc() {
    for (int i = 1; i <= n; i++) if (i * 108 / 100 == n) return i;
    return -1;
  }
}
