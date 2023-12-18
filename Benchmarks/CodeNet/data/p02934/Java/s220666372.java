import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double ans = 0;
    for (int i = 0; i < N; i++) ans += 1d / sc.nextInt();
    System.out.println(1 / ans);
  }
}