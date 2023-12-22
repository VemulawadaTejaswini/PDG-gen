import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String[] work = line.split(" |,|\\.");
      for (String str : work) {
        if (3 <= str.length() && str.length() <= 6) {
          out += str + " ";
        }
      }
    }
    System.out.print(out.trim() + "\n");
  }
}