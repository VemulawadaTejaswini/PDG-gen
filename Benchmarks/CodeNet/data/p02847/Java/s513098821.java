import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String[] DAY_OF_WEEK = new String[]{ "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int d = -1;
    for (int i = 0; i < DAY_OF_WEEK.length; i++) {
      if (s.equals(DAY_OF_WEEK[i])) {
        d = i;
        break;
      }
    }

    System.out.println(7 - d);
  }
}
