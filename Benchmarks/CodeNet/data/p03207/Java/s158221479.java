import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int sum = 0;
    int max = 0;
    for (int i = 0; i < N; i++) {
      int p = scanner.nextInt();
      sum += p;
      max = Math.max(max, p);
    }
    sum -= max / 2;
    System.out.println(sum);
  }
}
