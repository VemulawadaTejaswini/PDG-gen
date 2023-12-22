import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main {
  public static void main(String[] args) throws IOException {
    int a, b, d, r;
    float f;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    a = Character.getNumericValue(input.charAt(0));
    b = Character.getNumericValue(input.charAt(2));
    d = getD(a, b);
    r = getR(a, b);
    f = getF(a, b);
    System.out.println(d + " " + r + " " + f);
  }
  static int getD(int a, int b) {
    return a / b;
  }
  static int getR(int a, int b) {
    return a % b;
  }
  static float getF(float a, float b) {
    return a / b;
  }
}