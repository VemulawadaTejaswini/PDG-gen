import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long v = sc.nextInt();
    long b = sc.nextInt();
    long w = sc.nextInt();
    long t = sc.nextInt();
    if (v <= w) {
      System.out.println("NO");
    } else if ((v - w) * t >= Math.abs(a - b)) {
      System.out.println("YES");
    }
  }
}
