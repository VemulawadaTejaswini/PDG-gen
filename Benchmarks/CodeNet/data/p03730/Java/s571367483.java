import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    for (int i = 1; i <= B; i++) {
      if (A * i % B == C) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
