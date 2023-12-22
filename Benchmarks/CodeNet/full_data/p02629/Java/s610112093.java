import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    long n = scanner.nextLong();

    final StringBuilder s = new StringBuilder();
    while (n > 0) {
      char c = (char)(((n - 1) % 26) + 'a');
      n /= 26;
      s.insert(0, c);
    }

    System.out.println(s.toString());
  }
}
