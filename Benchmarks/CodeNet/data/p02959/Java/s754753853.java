import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n + 1];
    int[] B = new int[n];
    for (int i = 0; i < n + 1; i++)
      A[i] = sc.nextInt();
    for (int i = 0; i < n; i++)
      B[i] = sc.nextInt();
    int result = 0;
    int tmp = A[0];
    for (int i = 0; i < n; i++)
      if (tmp > B[i]) {
        result += B[i];
        tmp = A[i + 1];
      } else {
        result += tmp;
        tmp = B[i] - tmp;
        if (A[i + 1] > tmp) {
          result += tmp;
          tmp = A[i + 1] - tmp;
        } else {
          result += A[i + 1];
          tmp = 0;
        }
      }
    System.out.println(result);
  }
}