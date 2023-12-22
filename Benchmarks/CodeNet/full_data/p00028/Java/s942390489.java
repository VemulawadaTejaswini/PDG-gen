import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out ="";
    int[] a = new int[100];
    int[]maxes = new int[100];
    for (int ii = 0; ii < 100; ii++) {
      maxes[ii] = -1;
    }
    TreeMap tm = new TreeMap();
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      a[n - 1]++;
    }
    for (int ii = 0; ii < 100; ii++) {
      for (int jj = 0; jj < 100; jj++) {
        if (a[ii] < maxes[jj]) {
          break;
        }
        if (a[ii] == maxes[jj]) {
          continue;
        }
        if (a[ii] > maxes[jj]) {
          maxes[jj] = ii + 1;
          break;
        }
      }
    }
    for (int ii = 0; ii < 100; ii++) {
      if (maxes[ii] == -1) {
          break;
      }
      out += maxes[ii] + "\n";
    }
    System.out.print(out);
  }
}