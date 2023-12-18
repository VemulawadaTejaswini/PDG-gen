import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final long A = Long.parseLong(scanner.next());
    final long B = Long.parseLong(scanner.next());

    long result = 0;
    for(long i = A; i <= B; i++) {
      result = result ^ i;
    }
    System.out.println(result);
  }
}
