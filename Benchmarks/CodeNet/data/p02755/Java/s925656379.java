import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    int minA = (int) ((A * 100) / 8);
    int minB = (int) ((B * 100) / 10);
    int min = Math.max(minA, minB);

    int maxA = (int) (((A + 1) * 100)) / 8 - 1;
    int maxB = (int) (((B + 1) * 100)) / 10 - 1;
    int max = Math.min(maxA, maxB);

    int ans = (min <= max) ? min : -1;
    System.out.println(ans);
  }
}
