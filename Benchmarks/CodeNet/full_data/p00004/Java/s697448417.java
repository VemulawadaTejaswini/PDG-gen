import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String str;
    double a, b, c, d, e, f;
    double x, y;
    while ((str = buf.readLine()) != null) {
      String[] tmp = new String[6];
      tmp = str.split(" ");
      a = Double.parseDouble(tmp[0]);
      b = Double.parseDouble(tmp[1]);
      c = Double.parseDouble(tmp[2]);
      d = Double.parseDouble(tmp[3]);
      e = Double.parseDouble(tmp[4]);
      f = Double.parseDouble(tmp[5]);
      y = (c*d - a*f) / (b*d - a*e);
      x = (c - b*y) / a;
      System.out.printf("%.3f %.3f\n", x, y);
    }
  }
}