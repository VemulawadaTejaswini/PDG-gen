import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdInt = new Scanner(System.in);

    int n;
    n = stdInt.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = stdInt.nextInt();
    }

    //bubble sort
    int cnt = 0;
    for (int i = 0; i < n-1; i++) {
      for (int j = n-1; j > i; j--) {
        if (a[j] < a[j-1]) {
          int tmp;
          tmp = a[j];
          a[j] = a[j-1];
          a[j-1] = tmp;
          cnt++;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(a[i]);
      if (i != n-1)
      System.out.print(" ");
    }
    System.out.println();
    System.out.println(cnt);
  }
}
