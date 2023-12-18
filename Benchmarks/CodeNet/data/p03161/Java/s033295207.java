
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int iSize = scanner.nextInt();
    int k = scanner.nextInt();
    int[] input = new int[iSize];
    for (int i = 0; i < iSize; i++) {
      input[i] = scanner.nextInt();
    }
    scanner.close();
    int[] arr = new int[iSize];
    Arrays.fill(arr, Integer.MAX_VALUE);
    arr[0] = 0;
    for (int i = 0; i < iSize; i++) {
      for (int j = i + 1; j <= i + k && j < iSize; j++) {
        arr[j] = Math.min(arr[j], arr[i] + Math.abs(input[i] - input[j]));
      }
    }
    System.out.println(arr[iSize - 1]);
  }
}
