
import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);
  static int n;
  static int k;


  public static void main(String[] args) {
    n = sc.nextInt();
    k = sc.nextInt();
    int answer = solve(n, k);
    System.out.println(answer);
  }

  private static int solve(int n, int k) {
    int answer = 0;
    for (int i = k; i <= n; i++) {
      if (i == 0) {
        continue;
      }
      answer += n - i;
    }
    for (int i = k + 1; i <= n; i++) {
      for (int j = k + 1; j <= n; j++) {
        if (i < j) {
          continue;
        }
        if (Math.floorMod(i, j) >= k) {
          answer++;
        }
      }
    }
    return answer;
  }
}
