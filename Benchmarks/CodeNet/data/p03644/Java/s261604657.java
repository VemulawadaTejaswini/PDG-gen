import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 1;
    int ansi = 0;
    for (int i = 1; i <= n; i++) {
      int tmp = i;
      int cnt = 0;
      while (tmp % 2 == 0) {
        int x = tmp / 2;
        tmp = x;
        cnt++;
        if (ansi <= cnt) {
          ansi = cnt;
          ans = i;
        }
      }
    }
    System.out.println(ans);
  }
}