import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] a = Stream.of(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    sc.close();
    String[] result = new String[n];
    for (int i = 0; i < n; i++) {
      result[a[i] - 1] = String.valueOf(i + 1);
    }
    System.out.println(String.join(" ", result));
  }
}