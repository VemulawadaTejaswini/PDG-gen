import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    int minA = (int) (A / 0.08d);
    int minB = (int) (B / 0.1d);
    int min = Math.max(minA, minB);

    int maxA = (int) ((A + 1) / 0.08d);
    int maxB = (int) ((B + 1) / 0.1d);
    int max = Math.min(maxA, maxB);

    int ans = (min <= max) ? min : -1;
    System.out.println(ans);
  }
}
