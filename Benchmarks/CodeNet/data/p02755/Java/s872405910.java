import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    int minA = (int) Math.ceil(A * 100 / 8d);
    int minB = (int) Math.ceil(B * 100 / 10d);
    int min = Math.max(minA, minB);

    int maxA = (int) Math.ceil((A + 1) * 100 / 8d) - 1;
    int maxB = (int) Math.ceil((B + 1) * 100 / 10d) - 1;
    int max = Math.min(maxA, maxB);


    int ans = (min <= max) ? min : -1;
    System.out.println(ans);
  }
}