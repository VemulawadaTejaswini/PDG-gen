import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] ages = new int[7];
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      for (int ii = 0; ii < n; ii++) {
        int a = scanner.nextInt();
        int c = 0;
        if (a < 10) {
          ;
        } else if (a < 19) {
          c = 1;
        } else if (a < 29) {
          c = 2;
        } else if (a < 39) {
          c = 3;
        } else if (a < 49) {
          c = 4;
        } else if (a < 59) {
          c = 5;
        } else {
          c = 6;
        }
        ages[c]++;
      }
      for (int ii = 0; ii < 7; ii++) {
        System.out.println(ages[ii]);
      }
    }
  }
}