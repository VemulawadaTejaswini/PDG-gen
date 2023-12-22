import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      String n = scanner.next();
      out += n.toUpperCase() + " ";
    }
    System.out.print(out.trim() + "\n");
  }
}