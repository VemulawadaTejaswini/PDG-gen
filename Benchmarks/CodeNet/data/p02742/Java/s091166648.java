import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    if (h % 2 == 0) {
      System.out.println(h / 2 * w);
    } else {
      int r = 0;
      for (int i = 0; i < w; i++) {
        if (i == 0) {
          r += (h + 1) / 2;
        } else if (i % 2 == 0) {
          r += (h + 1) / 2;
        } else {
          r += (h - 1) / 2;
        }
      }
      System.out.println(r);
      sc.close();
    }
  }
}
