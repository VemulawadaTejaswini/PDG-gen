import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    int count = bubbleSort(A, N);

    System.out.println(Arrays.stream(A).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    System.out.println(count);
  }

  public static int bubbleSort(int[] a, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = n-1; j > i; j--) {
        if (a[j] < a[j-1]) {
          int tmp = a[j];
          a[j] = a[j-1];
          a[j-1] = tmp;
          count++;
        }
      }
    };

    return count;
  }
}
