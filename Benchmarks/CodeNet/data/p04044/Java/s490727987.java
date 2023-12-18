import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int n = scanner.nextInt();
    final int l = scanner.nextInt();
    scanner.nextLine();
    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = scanner.nextLine();
    }

    System.out.println(Arrays.stream(s).sorted().collect(Collectors.joining()));
  }
}