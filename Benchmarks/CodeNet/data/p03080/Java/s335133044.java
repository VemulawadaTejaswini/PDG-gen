import java.util.*;

public class Main {
  public static void main(String[] arga) {
    Scanner sc = new Scannser(System.in);
    String s = sc.next();
    int r = 0;
    int b = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'R') {
        r++;
      } else {
        b++;
      }
    }
    System.out.println(r > b ? "Yes" : "No");
  }
}