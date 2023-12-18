import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = n;
    int a = 0;
    for (int i = 0; i < n; i++) {
      int c = Integer.parseInt(sc.next());
      m = Math.min(m, c);
      if (m >= c) {
        a += 1;
      }
    }
    System.out.println(a);
  }
}
