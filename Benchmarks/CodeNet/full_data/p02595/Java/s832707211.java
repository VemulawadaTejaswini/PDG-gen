import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int ans = 0;
    for (int cnt = 0; cnt < n; cnt++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      if (x * x + y * y <= d * d) {
        ans++;
      }
    }
    System.out.println(ans+"");
    sc.close();
  }
}
