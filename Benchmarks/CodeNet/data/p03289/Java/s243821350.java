import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = new char[s.length()];
    int count1 = 0;
    int count2 = 0;

    if (s.length() >= 4 && s.length() <=10) {
      for (int i = 0; i < s.length(); i++) {
        c[i] = s.charAt(i);
      }

      if (c[0] != 'A') {
        System.out.println("WA");
        return;
      }

      for (int i = 2; i < c.length-1; i++) {
        if (c[i] == 'C') {
          count1++;
        }
        if (c[i] >= 'A' && c[i] <= 'Z'){
          count2++;
        }
      }

      if (count1 == 1 && count2 == 1) {
        System.out.println("AC");
      } else {
        System.out.println("WA");
      }
    }
  }
}
