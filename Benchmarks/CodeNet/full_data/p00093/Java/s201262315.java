import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      int beginY = scanner.nextInt();
      int endY = scanner.nextInt();
      if (beginY == 0 && endY == 0) {
        break;
      }
      boolean flag = false;
      for (int y = beginY;  y <= endY; y++) {
        if (y % 4 != 0) {
          continue;
        }
        if (y % 100 == 0 && y % 400 != 0) {
          continue;
        }
        out += y + "\n";
        flag = true;
      }
      if (!flag) {
        out += "NA\n";
      }
      out += "\n";
    }
    System.out.print(out);
  }
}