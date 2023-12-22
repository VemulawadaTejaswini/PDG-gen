import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String out = "";
    for (int ii = 0; ii < n; ii++) {
      String str = scanner.next();
      List<String> ascs = new ArrayList<String>();
      List<String> descs = new ArrayList<String>();
      String ascStr = "";
      String descStr = "";
      for (int jj = 0; jj < str.length(); jj++) {
        ascs.add(str.substring(jj, jj + 1));
        descs.add(str.substring(jj, jj + 1));
      }
      Collections.sort(ascs);
      Collections.sort(descs);
      Collections.reverse(descs);
      for (int jj = 0; jj < ascs.size(); jj++) {
        ascStr += ascs.get(jj);
        descStr += descs.get(jj);
      }
      out += Integer.parseInt(descStr) - Integer.parseInt(ascStr);
    }
    System.out.print(out);
  }
}