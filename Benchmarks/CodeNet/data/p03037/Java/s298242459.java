import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int left = sc.nextInt();
    int right= sc.nextInt();
    int[] range = new int[] {left, right};
    if (M != 1) {
      for (int i = 1; i < M; i++) {
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        hoge(range, l2, r2);
        if (range[0] == -2 && range[1] == -1) {
          break;
        }
      }
    }
    System.out.println(range[1] - range[0] + 1);
  }

  private static void hoge(int[] range, int l2, int r2) {
    if (range[1] < l2) {
      range[0] = -2;
      range[1] = -1;
      return;
    } else {
      if (range[0] < l2) {
        range[0] = l2;
        return;
      }
    }

    if (r2 < range[0]) {
      range[0] = -2;
      range[1] = -1;
      return;
    } else {
      if (l2 < range[0]) {
        range[1] = r2;
        return;
      } else {
        range[0] = l2;
        range[1] = r2;
        return;
      }
    }
  }
}