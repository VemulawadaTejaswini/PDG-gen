import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = "Sunny";
    String b = "Cloudy";
    String c = "Rainy";

    String s = sc.next();

    if (s.equals(a)) {
      System.out.println(b);
    } else if (s.equals(b)) {
      System.out.println(c);
    } else {
      System.out.println(a);
    }

  }
}
