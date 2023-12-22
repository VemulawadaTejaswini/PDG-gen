import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    final int[] a = Arrays
        .stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    int allXor = a[0];
    for (int i = 1; i < a.length; i++) {
      allXor ^= a[i];
    }

    int[] results = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      results[i] = allXor ^ a[i];
    }

    System.out.println(
        Arrays.stream(results)
            .boxed()
            .map(it -> Integer.toString(it))
            .collect(Collectors.joining(" "))
    );
  }
}
