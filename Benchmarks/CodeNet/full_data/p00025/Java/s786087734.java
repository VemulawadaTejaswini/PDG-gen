import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      String[] a = new String[4];
      String[] b = new String[4];
      String line = scanner.nextLine();
      a = line.split(" ");
      line = scanner.nextLine();
      b = line.split(" ");
      int hit = 0;
      int blow = 0;
      for (int ii = 0; ii < a.length; ii++) {
        if (a[ii].equals(b[ii])) {
          hit++;
          continue;
        }
        for (int jj = 0; jj < b.length; jj++) {
          if (a[ii].equals(b[jj])) {
            blow++;
          }
        }
      }
      out += hit + " " + blow + "\n";
    }
  System.out.print(out);
  }
}