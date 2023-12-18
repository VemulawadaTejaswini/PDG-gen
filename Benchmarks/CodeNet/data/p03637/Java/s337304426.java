import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if (2 <= n && n <= 1.0e5) {
      int[] sunukenoaho = new int[n];
      for (int i = 0; i < n ; i++) {
        sunukenoaho[i] = scan.nextInt();
        sunukenoaho[i] = sunukenoaho[i] % 4;
      }
      int sum = 0;
      for (int i = 1; i < n; i++) {
        if (sunukenoaho[i] * sunukenoaho[i - 1] % 4 == 0) {
          sum++;
        }
      }

      if (sum == n - 1) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
