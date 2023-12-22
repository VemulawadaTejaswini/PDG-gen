import java.util.Scanner;

public class Main {

  static int bubbleSort(int[] a, int n) {
    int sw = 0;
    boolean flag = true;
    for (int i = 0; flag; i ++) {
      flag = false;
      for (int j = n - 1; j >= i + 1; j--) {
        if (a[j] < a[j-1]) {
          int t = a[j];
          a[j] = a[j-1];
          a[j-1] = t;
          flag = true;
          sw++;
        }
      }
    }
    return sw;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = stdIn.nextInt();
    int sw = bubbleSort(a, n);
    for (int i = 0; i < n; i++) {
      System.out.print(a[i]);
      if (i != n - 1) System.out.print(' ');
      else System.out.println();
    }
    System.out.println(sw);
  }
}