import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int h = sc.nextInt();
      int w = sc.nextInt();
      if (h == 0) return;

      int d = h * h + w * w;
      int minh = h, minw = w, mind = 22500+22500;
      for (int i = 1; i <= 150; i++) {
        for (int j = 1; j < i; j++) {
          int dd = i * i + j * j;
          if ( ((dd > d) || (dd == d && j > h)) && ((dd < mind) || (dd == mind && minh > j)) ) {
            minh = j;
            minw = i;
            mind = dd;
          }
        }
      }
      System.out.println(minh + " " + minw);
    }
  }
}

