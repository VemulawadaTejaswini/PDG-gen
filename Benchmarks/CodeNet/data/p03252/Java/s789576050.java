import java.util.Scanner;

public class Main {

  public static String setChar(String str, int index, char replace) {
    char[] chars = str.toCharArray();
    chars[index] = replace;
    return String.valueOf(chars);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    for (int i = 0; i < t.length(); i++) {
      if (s.charAt(i) != t.charAt(i)) {
        t = setChar(t, i, s.charAt(i));
      }
    }
    System.out.println(s.equals(t) ? "Yes" : "No");
  }

}
