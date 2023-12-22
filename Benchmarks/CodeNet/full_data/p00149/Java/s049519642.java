import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] ls = new int[5];
    int[] rs = new int[5];
    while (scanner.hasNext()) {
      ls[aaaa(scanner.nextDouble())]++;
      rs[aaaa(scanner.nextDouble())]++;
    }
    for (int ii = 1; ii < 5; ii++) {
      System.out.printf("%d %d\n", ls[ii], rs[ii]);
    }
  }

  private static int aaaa (double e) {
    if (1.1 <= e) {
      return 1;
    } if (0.6 <= e && e < 1.1) {
      return 2;
    } if (0.2 <= e && e < 0.6) {
      return 3;
    } if (e < 0.2) {
      return 4;
    }
    return 0;
  }
}