import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    int a, b, t, ab;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String str;
    String[] array = new String[2];
    while ((str = buf.readLine()) != null) {
      array = str.split(" ");
      a = Integer.parseInt(array[0]);
      b = Integer.parseInt(array[1]);
      if (a < b) {
        t = a;
        a = b;
        b = t;
      }
      ab = a * b;
      while (true) {
        t = a % b;
        a = b;
        b = t;
        if (b == 0) {
          System.out.printf("%d %d\n", a, ab/a);
          break;
        }
      }
    }
  }
}