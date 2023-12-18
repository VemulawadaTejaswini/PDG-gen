import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int xy[][] = new int[n][2];

    List<Integer> quadrant1 = new ArrayList<>();
    List<Integer> quadrant2 = new ArrayList<>();
    List<Integer> quadrant3 = new ArrayList<>();
    List<Integer> quadrant4 = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      xy[i][0] = x;
      xy[i][1] = y;
      if (x >= 0) {
        if (y >= 0) {
          quadrant1.add(i);
        } else {
          quadrant4.add(i);
        }
      } else {
        if (y >= 0) {
          quadrant2.add(i);
        } else {
          quadrant3.add(i);
        }
      }
    }
    long maxPow = Math.max(0L, distancePow(quadrant1, xy));
    maxPow = Math.max(maxPow, distancePow(quadrant2, xy));
    maxPow = Math.max(maxPow, distancePow(quadrant3, xy));
    maxPow = Math.max(maxPow, distancePow(quadrant4, xy));
    pw.println(Math.sqrt(maxPow));
  }

  static long distancePow(List<Integer> indexes, int xy[][]) {
    long xTotal = indexes.stream().mapToLong(i -> xy[i][0]).sum();
    long yTotal = indexes.stream().mapToLong(i -> xy[i][1]).sum();
    return xTotal * xTotal + yTotal * yTotal;
  }
}
