import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = n;
    if((n % 2) == 1) ans = 2 * n;
    System.out.println(ans);
  }
}