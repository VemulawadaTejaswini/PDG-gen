import java.util.*;

public class c{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n, m;
    n = sc.nextInt();
    m = sc.nextInt();

    int x, y, l, r;
    l = 0;
    r = (int)1E5 + 10;

    for (int i = 0; i < m; i++) {
      x = sc.nextInt();
      y = sc.nextInt();
      l = Math.max(x, l);
      r = Math.min(y, r);
    }

    System.out.println(r - l + 1);
  }
}
