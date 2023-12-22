import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      StringBuffer sb = new StringBuffer(scanner.next());
      System.out.println(sb.reverse());
    }
  }
}