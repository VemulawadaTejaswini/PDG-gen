import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    String line = scanner.nextLine();
    String[] a = line.split(" ");
    for (int ii = 0; ii < a.length; ii++) {
      boolean flag = false;
      for (int jj = 0; jj < a[ii].length(); jj++) {
        if (a[ii].startsWith("apple", jj)) {
          a[ii] = a[ii].replace("apple", "peach");
          flag = true;
        }
      }
      if (!flag) {
        a[ii] = a[ii].replace("peach", "apple");
      }
      out += a[ii] + " ";
    }
    System.out.println(out.trim());
  }
}