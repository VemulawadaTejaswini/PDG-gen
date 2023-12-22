import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int h = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    double hRad = (double) 90 - 360 * (double) h / 12 - 30 * ((double) m % 60) / 60;
    double hX = (double) a * Math.cos(Math.toRadians(hRad));
    double hY = (double) a * Math.sin(Math.toRadians(hRad));
    double mRad = (double) 90 - 360 * ((double) m % 60) / 60;
    double mX = (double) b * Math.cos(Math.toRadians(mRad));
    double mY = (double) b * Math.sin(Math.toRadians(mRad));
    double diffX = hX - mX;
    double diffY = hY - mY;
    pw.println(
      Math.sqrt(diffX * diffX + diffY * diffY)
    );
  }
}
