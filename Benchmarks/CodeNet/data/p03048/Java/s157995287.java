import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    int ans = 0;
    for(int i = 0; i <= Max.min(r, n); i++) {
      for(int j = 0; j <= Max.min(g, n); j++) {
        if((n - i - j) <= b) ans++;
      }
    }
    System.out.println(ans);
  }
}