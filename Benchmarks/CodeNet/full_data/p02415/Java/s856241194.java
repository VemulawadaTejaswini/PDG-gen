import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
    String s;
    for (int i = 0; i < in.length(); i++) {
      s = in.substring(i, i + 1);
      if (isAlphabets(s)) {
        System.out.print(isLower(s)? s.toUpperCase() : s.toLowerCase());
      } else {
        System.out.print(s);
      }
    }
    System.out.println();
  }
  public static boolean isAlphabets(String s) {
    Pattern p = Pattern.compile("^[a-zA-Z]*$");
    Matcher m = p.matcher(s);
    return m.find();
  }
  public static boolean isLower(String s) {
    return s.equals(s.toLowerCase());
  }
}