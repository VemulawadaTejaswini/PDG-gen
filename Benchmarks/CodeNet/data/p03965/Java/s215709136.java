import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int win = 0;
    int lose = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0 && s.charAt(i) == 'p') {
        lose++;
      } else if (i % 2 == 1 && s.charAt(i) == 'g') {
        win++;
      }
    }
    System.out.println(win - lose);
  }
}