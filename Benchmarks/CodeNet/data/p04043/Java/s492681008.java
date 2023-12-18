import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    solve(a, b, c);
  }

  private static void solve(int a, int b, int c) {
    int[] arr = new int[3];
    arr[0] = a;
    arr[1] = b;
    arr[2] = c;
    Arrays.sort(arr);
    if (Arrays.equals(arr, new int[]{5, 5, 7})) {
      System.out.println("YES");
      return;
    }
    System.out.println("NO");
  }


}