import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] a = Stream.of(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    sc.close();
    int sum = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        sum += a[i] * a[j];
      }
    }
    System.out.println(sum);
  }
}