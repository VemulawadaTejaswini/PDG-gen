import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    scanner.nextLine();
    final int[] a = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
    final int q = scanner.nextInt();
    scanner.nextLine();
    final int[][] bc = new int[q][2];
    for (int i = 0; i < q; i++) {
      bc[i][0] = scanner.nextInt();
      bc[i][1] = scanner.nextInt();
      scanner.nextLine();
    }

    long sum = 0;
    Map<Integer, Long> counts = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      counts.put(
          a[i],
          counts.containsKey(a[i]) ? counts.get(a[i]) + 1 : 1
      );
      sum += a[i];
    }

    for (int i = 0; i < q; i++) {
      final long replaceCount = counts.containsKey(bc[i][0]) ?
                                counts.get(bc[i][0]) :
                                0L;

      if (replaceCount > 0) {
        counts.put(
            bc[i][1],
            counts.containsKey(bc[i][1]) ? counts.get(bc[i][1]) + replaceCount : replaceCount
        );
        counts.put(
            bc[i][0],
            0L
        );
      }

      sum += replaceCount * (bc[i][1] - bc[i][0]);

      System.out.println(sum);
    }
  }
}
