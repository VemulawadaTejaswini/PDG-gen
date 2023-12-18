import java.util.*;
public class Main {
  static String[] WDAYS = new String[] { "SUN","SAT","FRI","THU","WED","TUE","MON" };
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    for (int i = 0; i < WDAYS.length; i++) {
      if (a.equals(WDAYS[i])) {
        System.out.println(i == 0 ? 7 : i);
        return;
      }
    }
    System.out.println(-1);
  }
}