import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    List<String> week = new ArrayList<String>();
    week.add("SUN");
    week.add("MON");
    week.add("TUE");
    week.add("WED");
    week.add("THU");
    week.add("FRI");
    week.add("SAT");

    String S = sc.next();

    int remainNextSunday = week.indexOf(S);
    System.out.println(7 - remainNextSunday);
  }
}
