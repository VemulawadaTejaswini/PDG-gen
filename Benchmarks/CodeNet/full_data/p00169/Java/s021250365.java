import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String work = scanner.nextLine();
      if (work.equals("0")) {
        break;
      }
      String works[] = work.split(" ");
      int s = 0;
      for (int ii = 0; ii < works.length; ii++) {
        int w = Integer.parseInt(works[ii]);
        if (2 <= w && w <= 9) {
          s += w;
        } else if (10 <= w && w <= 13) {
          s += 10;
        } else {
          int t1 = s + 1;
          int t11 = s + 11;
          if (t1 <= 21 && t11 <= 21 && ii == works.length - 1) {
            s = t11;
          } else {
            s = t1;
          }
        }
      }
      if (s > 21) {
        s = 0;
      }
      System.out.println(s);
    }
  }
}