import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] a = new int[10];
    Scanner cin = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      a[i] = cin.nextInt();
    }

    Arrays.sort(a);

    for (int i = 9; i > 6; i--) {
      System.out.println(a[i]);
    }
  }
}