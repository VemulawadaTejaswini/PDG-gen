
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int sum = 0;
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
      sum += a[i];
    }

    final int finalSum = sum;
    if(Arrays.stream(a).filter( e -> 4 * e > finalSum / m).count() >= m ) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
