import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    s.close();
    int d = a / b;
    int r = a % b;
    double f = (double) a / b;
    DecimalFormat df = new DecimalFormat("#.00000");
    df.setRoundingMode(RoundingMode.HALF_UP);
    System.out.println(d + " " + r + " " + df.format(f));
  }
}

