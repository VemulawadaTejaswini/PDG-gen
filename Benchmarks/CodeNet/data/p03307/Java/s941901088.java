import java.util.Scanner;

public class C {
  public static void main(String ...args) {
    final Scanner scanner = new Scanner(System.in);
    final int length = scanner.nextInt();
    final int[] numbers = new int[length];
    for (int idx = 0; idx < length; idx++) {
      numbers[idx] = scanner.nextInt();
    }

    final int result = linearApproximation(length, numbers);
    System.out.println(result);
  }

  public static int linearApproximation(final int N, final int[] A) {
    final int b = 0;
    int acc = 0;
    for (int n = 1; n <= N; n++) {
      acc += Math.abs(A[n - 1] + (b - n));
    }

    return acc;
  }
}
