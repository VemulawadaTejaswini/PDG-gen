import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int left = (25 * N - 1) / 27 + 1;
    int right = (25 * N + 24) / 27;
    if (right < left) System.out.println(":(");
    else System.out.println(left);
  }
}
