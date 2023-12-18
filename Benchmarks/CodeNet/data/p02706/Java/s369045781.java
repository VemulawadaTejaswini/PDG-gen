import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < m; i++) {
      sum += scanner.nextInt();
    }
    if(sum > n) {
      System.out.println(-1);
    } else {
      System.out.println(n - sum);
    }
  }
}
