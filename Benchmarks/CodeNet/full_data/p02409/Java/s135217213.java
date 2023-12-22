import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][][] count = new int[4][3][10];
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int b = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      int v = sc.nextInt();
      count[b - 1][f - 1][r - 1] += v;
    }
    for (int i = 0; i < count.length; i++) {
      for (int j = 0; j < count[i].length; j++) {
        for (int k = 0; k < count[i][j].length; k++) {
          System.out.print(" " + count[i][j][k]);
        }
        System.out.println();
      }
      if (i < count.length - 1) {
        for (int j = 0; j < 20; j++) {
          System.out.print('#');
        }
        System.out.println();
      }
    }
  }
}
