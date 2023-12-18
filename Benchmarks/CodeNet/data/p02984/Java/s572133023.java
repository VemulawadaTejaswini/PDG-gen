import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++)
      A[i] = sc.nextInt();
    int[] result = new int[N];
    for (int i = 0; i < N; i++)
      result[i] = 0;
    result[0] += A[0] / 2 + A[N-1];
    for (int i = 1; i < N - 1; i++) {
      result[i] += A[i] / 2;
      result[i+1] += A[i] /2;
    }
    System.out.println(Arrays.toString(result));
  }
}