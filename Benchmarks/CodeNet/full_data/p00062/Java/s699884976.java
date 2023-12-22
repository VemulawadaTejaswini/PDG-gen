import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    boolean keyBreak = false;
    List<String> scores = new ArrayList<String>();
    List<String> ranks = new ArrayList<String>();
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      out += func(line) + "\n";
    }
    System.out.print(out);
  }

  private static String func (String line) {
    if (line.length() == 1) {
      return line;
    }
    int len = line.length();
    int[] a = new int[len];
    for (int ii = 0; ii < len; ii++) {
      a[ii] = line.charAt(ii) - '0';
    }
    String s = "";
    for (int ii = 0; ii < a.length; ii++) {
      if (ii == a.length - 1) {
        continue;
      }
      int w = a[ii] + a[ii + 1];
      if (w >= 10) {
        w -= 10;
      }
      s += w;
    }
    return func(s);
  }

}