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

    insertionSort(A, N);    
  }

  public static void insertionSort(int[] a, int n) {
      for (int i = 1; i < n; i++) {
          println(a);
          int tmp = a[i];
          int j = i - 1;
          while (j >= 0 && a[j] > tmp) {
              a[j+1] = a[j];
              j--;
          }
          a[j+1] = tmp;
      }
      println(a);
    }

  public static void println(int[] a) {
    System.out.println(Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
  }
}
