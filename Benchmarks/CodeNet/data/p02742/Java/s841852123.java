import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long W = sc.nextLong();
    sc.close();

	long h1 = (H + 1) / 2;
    long w1 = (W + 1) / 2;
	long h2 = (H) / 2;
    long w2 = (W) / 2;
    long ans = h1 * w1 + h2 * w2;

    System.out.println(ans);
  }
}
