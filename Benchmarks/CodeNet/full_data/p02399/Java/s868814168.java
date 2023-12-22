import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main {
  public static void main(String[] args) throws IOException {
    int d, r;
    double a, b, f;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] strArray = input.split(" ");
    a = Integer.parseInt(strArray[0]);
    b = Integer.parseInt(strArray[1]);
    d = getD(a, b);
    r = getR(a, b);
    f = getF(a, b);
    System.out.printf("%d %d %.5f", d, r, f);
  }
  static int getD(double a, double b) {
    return (int)(a / b);
  }
  static int getR(double a, double b) {
    return (int)(a % b);
  }
  static double getF(double a, double b) {
    return a / b;
  }
}