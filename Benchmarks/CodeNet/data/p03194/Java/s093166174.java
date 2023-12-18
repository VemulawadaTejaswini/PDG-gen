import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int ans = 0;
    int lim = p;
    for (int i = 0; i < n; i++) {
      lim += n;
      lim /= n;
    }
    for (int i = 1; i <= lim; i++) {
      if (p % Math.pow(i, n) == 0) {
        ans = i;
      }
    }
    System.out.println(ans);
  }

}
