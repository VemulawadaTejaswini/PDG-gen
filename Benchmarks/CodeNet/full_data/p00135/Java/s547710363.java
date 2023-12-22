import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    int n = scanner.nextInt();
    scanner.nextLine();
    for (int ii = 0; ii < n; ii++) {
      String line = scanner.nextLine();
      String[] work = line.split(":");
      int hh = Integer.parseInt(work[0]);
      int mm = Integer.parseInt(work[1]);
      double mmr = 360 / 60 * mm;
      double hhr = 360 / 12 * hh + mmr / 12;
      double r = Math.abs(mmr - hhr);
      if (0 <= r && r < 30) {
        out += "alert\n";
      } else if (90 <= r && r <= 180) {
        out += "safe\n";
      } else {
        out += "warning\n";
      }
    }
    System.out.print(out);
  }
}