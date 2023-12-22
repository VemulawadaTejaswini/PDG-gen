import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    while (true) {
      int n = stdin.nextInt();
      if (n == 0) {
        break;
      }

      int[] arr = new int[n];
      int sum = 0;
      for (int i = 0; i < n; i++) {
        arr[i] = stdin.nextInt();
        sum += arr[i];
      }

      double m = sum / n;
      double a = 0.0;
      for (int i : arr) {
        a += Math.pow(i - m, 2);
      }

      System.out.println(Math.sqrt(a / n));
    }
  }

}