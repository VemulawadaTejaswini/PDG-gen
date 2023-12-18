import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long A = scanner.nextInt();
    long B = scanner.nextInt();
    long C = scanner.nextInt();
    long K = scanner.nextInt();
    long minus = A + B >= K ? 0 : K - A - B;
    long plus = A >= K ? K : A;
    System.out.println(plus - minus);
  }
}
