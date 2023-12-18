import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int l = s.length();

    String first = s.substring(0,1);
    String last = s.substring(l-1,l);

    System.out.println(first+(l-2)+last);

  }

}
