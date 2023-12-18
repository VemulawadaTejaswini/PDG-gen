import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();
    int a = (int)Math.pow(100, d);
    int ans = a * n;
    if(n == 100) ans = a * 101;
    System.out.println(ans);
  }
}