import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      double w = scanner.nextDouble();
      if (91.00 < w) {
        out += "heavy";
      } else if (81.00 < w && w <= 91.00) {
        out += "light heavy";
      } else if (75.00 < w && w <= 81.00) {
        out += "middle";
      } else if (69.00 < w && w <= 75.00) {
        out += "light middle";
      } else if (64.00 < w && w <= 69.00) {
        out += "welter";
      } else if (60.00 < w && w <= 64.00) {
        out += "light welter";
      } else if (57.00 < w && w <= 60.00) {
        out += "lightkg";
      } else if (54.00 < w && w <= 57.00) {
        out += "feather";
      } else if (51.00 < w && w <= 54.00) {
        out += "bantamkg";
      } else if (48.00 < w && w <= 51.00) {
        out += "fly";
      } else if (w <= 48.00) {
        out += "light fly";
      }
      out += "\n";
    }
    System.out.print(out);
  }
}