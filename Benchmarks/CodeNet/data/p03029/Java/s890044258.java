import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int p = sc.nextInt();
    int t = 3 * a + p;
    int ans = t / 2;
    System.out.println(ans);
  }
}