import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x = sc.nextInt();

    int[] a = new int[n];

    for (int i = 0; i < n; ++i) {
      a[i] = sc.nextInt();
    }

    int res = 0;

    for (int i : a) {
      int y = 1;
      while(y <= d) {
        y += i;
        ++res;
      }
    }

    System.out.println(res + x);
  }
}