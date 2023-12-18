import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    long[] colorToMin = new long[n];
    long totalMin = -1;
    int colors = 0;
    for (int i = 0; i < n; i++) {
      long a = Long.parseLong(sc.next());
      boolean canPaintSameColor = false;
      if (totalMin < a) {
        for (int j = 0; j < colors; j++) {
          if (colorToMin[j] < a) {
            canPaintSameColor = true;
            colorToMin[j] = a;
            if (totalMin == -1) {
              totalMin = a;
            } else {
              totalMin = Math.min(totalMin, a);
            }
            break;
          }
        }
      }
      if (!canPaintSameColor) {
        colorToMin[colors] = a;
        if (totalMin == -1) {
          totalMin = a;
        } else {
          totalMin = Math.min(totalMin, a);
        }
        colors++;
      }
    }
    pw.println(colors);
  }
}
