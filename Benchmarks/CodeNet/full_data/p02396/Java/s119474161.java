import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdInt = new Scanner(System.in);

  int[] a = new int[10000];
  int i = 0;
    while (true) {
      int x;
      x = stdInt.nextInt();
      if (x == 0) break;
      a[i++] = x;
    }

    for (int j = 0; j < i; j++) {
      System.out.println("Case " + (j+1) + ": " + a[j]);
    }
  }
}
