import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long X = sc.nextLong();
    sc.close();

    long ans = 0;
    if (A == 0) {
      ans = B / X + 1;
    } else {
      ans = B / X - (A - 1) / X;
    }

    System.out.println(ans);
  }
}