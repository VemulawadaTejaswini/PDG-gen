import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> bs = new ArrayList<String>();
    ArrayList<String> rs = new ArrayList<String>();
    for (;;) {
      String op = scanner.next();
      if (op.equals("quit")) {
        break;
      }
      if (op.equals("push")) {
        String b = scanner.next();
        bs.add(b);
        continue;
      }
      if (op.equals("pop")) {
        rs.add(bs.get(bs.size() - 1));
        bs.remove(bs.size() - 1);
        continue;
      }
    }
    for (int ii = 0; ii < rs.size(); ii++) {
      System.out.println(rs.get(ii));
    }
  }
}