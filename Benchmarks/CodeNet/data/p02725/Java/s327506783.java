import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final String[] array1 = scanner.next().split("\\s+");
    final String[] array2 = scanner.next().split("\\s+");

    final Integer K = Integer.valueOf(array1[0]);
    final Integer N = Integer.valueOf(array1[1]);
    final List<Integer> As = Arrays.stream(array2)
        .map(Integer::valueOf)
        .collect(Collectors.toList());

    int min = K - (As.get(As.size() - 1) - As.get(0));
    for (int i = 0; i < As.size() - 1; i++) {
      final int diff = As.get(i + 1) - As.get(i);
      min = Math.min(diff, min);
    }
      System.out.println(min);
  }
}
