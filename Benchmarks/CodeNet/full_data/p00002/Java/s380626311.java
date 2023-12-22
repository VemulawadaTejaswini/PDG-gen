import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      int a = scanner.nextInt() + scanner.nextInt();
      out += Integer.toString(a).length() + "\n";
    }
    System.out.print(out);
  }
}