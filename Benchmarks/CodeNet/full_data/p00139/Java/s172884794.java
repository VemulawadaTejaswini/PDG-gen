import java.util.*;
import java.util.regex.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    for (int ii = 0; ii < n; ii++) {
      String str = scanner.nextLine();
      Pattern pa = Pattern.compile("^>'(=+)#\\1~$");
      Pattern pb = Pattern.compile("^>\\^(?:Q=)+~~$");
      Matcher ma = pa.matcher(str);
      Matcher mb = pb.matcher(str);
      if (ma.matches()) {
        System.out.println("A");
      } else if (mb.matches()) {
        System.out.println("B");
      } else {
        System.out.println("NA");
      }
    }
  }
}