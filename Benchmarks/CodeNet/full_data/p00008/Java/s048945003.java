import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      int a = scanner.nextInt();
      int c = 0;
      if (a == 0 || a > 36) {
        out += "0\n";
        continue;
      }
      if (a == 36) {
        out += "1\n";
        continue;
      }
      for (int ii = 0; ii < 10; ii++) {
        for (int jj = 0; jj < 10; jj++) {
          for (int mm = 0; mm < 10; mm++) {
            for (int nn = 0; nn < 10; nn++) {
              if (ii + jj + mm + nn == a) {
                c++;
              }
            }
          }
        }
      }
      out += c + "\n";
    }
    System.out.print(out);
  }
}