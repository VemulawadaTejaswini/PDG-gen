import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      int p = 0;
      for (int ii = 0; ii < n; ii++) {
        int xyh = scanner.nextInt() + scanner.nextInt() + scanner.nextInt();
        int w = scanner.nextInt();
        if (xyh <= 60 && w <= 2) {
          p += 6;
        } else if (xyh <= 80 && w <= 5) {
          p += 8;
        } else if (xyh <= 100 && w <= 10) {
          p += 10;
        } else if (xyh <= 120 && w <= 15) {
          p += 12;
        } else if (xyh <= 140 && w <= 20) {
          p += 14;
        } else if (xyh <= 160 && w <= 25) {
          p += 16;
        }
      }
      System.out.println(p * 100);
    }
  }
}