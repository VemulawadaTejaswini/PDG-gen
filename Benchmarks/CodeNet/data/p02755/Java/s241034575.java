import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    sc.close();

    long min = Math.max(A * 100 / 8, B * 100 / 10);
    long max = Math.min((A + 1) * 100 / 8, (B + 1) * 100 / 10);
    long ans = (min <= max) ? min : -1;
    System.out.println(ans);
  }
}