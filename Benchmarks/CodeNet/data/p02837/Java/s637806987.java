import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] honest = new int[15];
    Arrays.fill(honest, 1);

    int n = sc.nextInt();
    int testimony = 0;
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      for (int j = 0; j < a; j++) {
        int x = sc.nextInt() - 1;
        int y = sc.nextInt();
        if (honest[x] != 0) {
          honest[x] = y;
        }
        testimony++;
      }
    }

    int ret = 0;
    for (int i = 0; i < n; i++) {
      ret += honest[i];
    }
    if (ret == 0 && testimony == n) {
      System.out.println(1);
    } else {
      System.out.println(ret);
    }
  }
}
