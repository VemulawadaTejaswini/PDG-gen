import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.next());
    String str = sc.next();
    boolean flag = false;
    if(number % 2 == 0) {
      String first = str.substring(0, number / 2);
      String end = str.substring(number / 2, number);
      if(first.equals(end)) flag = true;
    }
    if(flag) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
