import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();

    int ans = Math.min(p + q, q + r);
    int ans = Math.min(ans, p + r);
    
    System.out.println(ans);
  }
}
