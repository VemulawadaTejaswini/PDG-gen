import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    new Main().b();

  }

  private void b() {
    try (Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {

      long a = in.nextLong();
      long b = in.nextLong();
      long x = in.nextLong();

      System.out.println(solve(a, b, x));
    }
  }

  private long solve(long a, long b, long x) {
    long b_x = b / x;
    long a_x = a / x;
    if (a % x != 0) {
      a_x++;
    }
    return b_x - a_x + 1;
  }
}
