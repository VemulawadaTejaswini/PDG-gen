import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String  out = "";
    while (scanner.hasNext()) {
      int a1 = scanner.nextInt();
      int m1 = scanner.nextInt();
      int a2 = scanner.nextInt();
      int m2 = scanner.nextInt();
      int a3 = scanner.nextInt();
      int m3 = scanner.nextInt();
      if (a1 == 0 && m1 == 0 && a2 == 0 && m2 == 0 && a3 == 0 && m3 == 0) {
        break;
      }
      int x = 1;
      int y = 1;
      int z = 1;
      for (int c = 0; ; c++) {
        if (c != 0 && x == 1 && y == 1 && z == 1) {
          out += c + "\n";
          break;
        }
        x = a1 * x % m1;
        y = a2 * y % m2;
        z = a3 * z % m3;
      }
    }
    System.out.print(out);
  }
}