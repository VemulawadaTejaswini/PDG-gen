import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int ans = 0;
    int index = 0;
    String lstr = "";

    while (index < (s.length() - 1)) {
      String rstr = "";
      while (index < s.length()) {
        rstr += s.charAt(index);
        index++;
        if (!lstr.equals(rstr)) {
          break;
        }
      }
      lstr = rstr;
      ans++;
    }

    if (index == (s.length() - 1)) {
      System.out.println(ans + 1);
    } else {
      System.out.println(ans);
    }

  }
}