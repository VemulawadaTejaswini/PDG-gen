import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      double l = scanner.nextDouble();
      double w = scanner.nextDouble();
      double h = scanner.nextDouble();
      if (l == 0 && w == 0 && h == 0) {
        break;
      }
      l /= 2;
      w /= 2;
      h /= 2;
      int n = scanner.nextInt();
      for (int ii = 0; ii < n; ii++) {
        double r = scanner.nextDouble();
        out += r * r > l * l + w * w || r * r > l * l + h * h || r * r > h * h + w * w ? "OK\n" : "NA\n";
      }
    }
    System.out.print(out);
  }
}