import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int H = sc.nextInt();
    int M = sc.nextInt();
    sc.close();

    double h = (H * 60 + M) * 360 / 720;
    double m = M * 360 / 60;
    double ans = Math.sqrt(A * A + B * B
        - 2 * A * B * Math.cos(Math.toRadians(Math.abs(h - m))));
    if (h == m) ans = 0.0;
    if (Math.abs(h - m) == 180) ans = 0.0;
    System.out.println(ans);
  }
}
