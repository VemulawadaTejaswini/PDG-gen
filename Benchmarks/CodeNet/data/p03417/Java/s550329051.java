
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);
  static long n;
  static long m;


  public static void main(String[] args) {
    n = sc.nextLong();
    m = sc.nextLong();
    int answer = solve(n, m);
    System.out.println(answer);
  }

  private static int solve(long n, long m) {
    int answer = 0;
    if (n < 2 || m < 2) {
      answer = getAnswer(n, m);
    } else {
      answer += (n - 2) * (m - 2);
    }
    return answer;
  }

  private static int getAnswer(long n, long m) {
    int answer = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        int count = 9;
        if (i == 0) {
          count -= 3;
        }
        if (j == 0) {
          count -= 3;
        }
        if (i + 1 == n) {
          count -= 3;
        }
        if (j + 1 == m) {
          count -= 3;
        }
        if (i + 1 == n && j == 0) {
          count++;
        }
        if (i == 0 && j == 0) {
          count++;
        }
        if (j + 1 == m && i == 0) {
          count++;
        }
        if (i + 1 == n && j + 1 == m) {
          count++;
        }

        if (count % 2 == 1) {
          answer++;
        }
      }
    }
    return answer;
  }


}
