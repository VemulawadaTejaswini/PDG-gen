import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String[] works1 = line.split("=");
      String c = works1[1];
      String[] works2 = works1[0].split("\\+");
      String a = works2[0];
      String b = works2[1];
      boolean flag = false;
      for (char ii = '0'; ii <= '9'; ii++) {
        int aa = Integer.parseInt(a.replace('X', ii));
        int bb = Integer.parseInt(b.replace('X', ii));
        int cc = Integer.parseInt(c.replace('X', ii));
        if (aa + bb == cc) {
          flag = true;
          out += ii + "\n";
          break;
        }
      }
      if (!flag) {
        out += "NA\n";
      }
    }
    System.out.print(out);
  }
}