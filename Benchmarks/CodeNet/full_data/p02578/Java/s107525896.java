import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int max = sc.nextInt();
    int sum = 0;
    for (int i = 1; i < n; i++) {
      int p = sc.nextInt();
      int step;
      if (max > p) {
        step = max - p;
        sum += step;
      } else {
        max = p;
      }
    }
    System.out.println(sum);
  }
}
