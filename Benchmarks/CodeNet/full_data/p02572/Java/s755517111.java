import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] data = new int[n];
    for (int h = 0; h < n; h++) {
      data[h] = scanner.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j <= n - 1; j++) {
        sum = sum + ((data[i] * data[j]) % (10 ^ 9 + 7));
      }
    }
    System.out.println(sum);
  }
}
