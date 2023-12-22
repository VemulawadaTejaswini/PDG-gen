import java.util.Scanner;

public class Main {

  static void trace(int[] a, int n) {
    for (int i = 0; i < n; i++) {
      if (i > 0) System.out.print(" ");
      System.out.print(a[i]);
    }
    System.out.println();
  }
    
  static void insertionSort(int[] a, int n) {
    int t, j;
    for (int i = 1; i < n; i++) {
      t = a[i];
      j = i - 1;
      while (j >= 0 && a[j] > t) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = t;
      trace(a, n);
    }
  } 

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = stdIn.nextInt();
    trace(a, n);
    insertionSort(a, n);
  }
}