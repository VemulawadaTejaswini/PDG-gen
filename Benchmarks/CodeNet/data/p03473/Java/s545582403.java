import java.util.*;
import java.io.*;

class Main {
  int M, ans;
  public static void main(String[] args) {
    Main m = new Main();
    m.input();
    m.solve();
    m.out();
  }

  public void input() {
    Scanner sc = new Scanner(System.in);
    M = sc.nextInt();
  }

  public void solve() {
    ans = (24 - M) + 24;
  }

  public void out() {
    System.out.println(ans);
  }
}
