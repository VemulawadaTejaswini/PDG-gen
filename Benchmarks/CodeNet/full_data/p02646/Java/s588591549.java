import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int v = sc.nextInt();
    int b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();
    if (v <= w) {
      System.out.println("NO");
    } else if ((v - w) * t >= Math.abs(a - b)) {
      System.out.println("YES");
    }
  }
}
