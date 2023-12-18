import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int result = 0;
    for (int index = 0; index < N; index++) {
      final int a = scanner.nextInt();
      int q = a;
      int count = 0;
      while (q % 2 == 0) {
        q = q / 2;
        count++;
      }
      if (count > result) {
        result = count;
      }
    }
    System.out.println(result);
  }
}
