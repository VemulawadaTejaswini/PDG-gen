import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int ans = 0;
    int index = 0;
    String lstr = "";

    while (index < s.length()) {
      String rstr = "";
      while (index < s.length()) {
        rstr += s.charAt(index);
        index++;
        if (!lstr.equals(rstr)) {
          break;
        }
      }
      if (!lstr.equals(rstr)) {
        ans++;
      }
      lstr = rstr;
    }

    System.out.println(ans);

  }
}