import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int n = stdin.nextInt();
    int min = 0;
    int max = 0;
    long sum = 0;

    for (int i = 0; i < n; i++) {
      int m = stdin.nextInt();
      sum += m;

      if (i == 0) {
        min = m;
        max = m;
      } else {
        min = Math.min(min, m);
        max = Math.max(max, m);
      }
    }

    System.out.printf("%d %d %d%n", min, max, sum);
  }

}