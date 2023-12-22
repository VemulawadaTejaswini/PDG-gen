import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int ms = Integer.MIN_VALUE;
      int mv = Integer.MIN_VALUE;
      for (int ii = 0; ii < 5; ii++) {
        int am = scanner.nextInt();
        int pm = scanner.nextInt();
        if (am == 0 && pm == 0) {
          break;
        }
        if (am + pm > mv) {
          ms = ii;
          mv = am + pm;
        }
      }
      if (mv == Integer.MIN_VALUE) {
        return;
      }
      System.out.printf("%c %d\n", ms + 'A', mv);
    }
  }
}