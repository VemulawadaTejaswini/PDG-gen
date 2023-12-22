import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int N = scanner.nextInt();

    int count = 0;
    for (int A = 1; A < N; A++) {
      for (int B = 1; B < N; B++) {
        if (N - (A * B) >= 1) {
          count++;
        } else {
          break;
        }
      }
    }

    System.out.println(count);
  }
}