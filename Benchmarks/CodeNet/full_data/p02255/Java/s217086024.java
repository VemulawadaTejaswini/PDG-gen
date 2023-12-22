import java.util.Scanner;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  private static int N;
  private static int[] a;

  private static void print() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < N; i++) {
      result.append(a[i]);
      result.append(" ");
    }
    System.out.println(result.toString().trim());
  }

  private static void sort() {
    if (N == 1) {
      print();
      return;
    }

    for (int i = 1; i < N; i++) {
      int key = i;
      int j = i - 1;
      while (j >= 0 && key < a[j]) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = in.nextInt();
    }

    // sort a.
    sort();
    // a is now sorted.


  }
}