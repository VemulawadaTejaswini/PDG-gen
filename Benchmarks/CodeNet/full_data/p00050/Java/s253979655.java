import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    String line = scanner.nextLine();
    String[] a = line.split(" ");
    for (int ii = 0; ii < a.length; ii++) {
      if (a[ii].startsWith("apple")) {
        a[ii] = a[ii].replace("apple", "peach");
      } else {
        a[ii] = a[ii].replace("peach", "apple");
      }
      out += a[ii] + " ";
    }
    System.out.println(out.trim());
  }
}