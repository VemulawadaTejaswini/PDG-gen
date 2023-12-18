import java.util.*;
import java.math.*;

public class Main {

  static int min = 10000;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int n = s.length();

    if (!s.substring(0,(n-1)/2).equals(s.substring(n-(n-1)/2,n))) {
      System.out.println("No");
      return;
    }

    if (!s.substring(0,(n-1)/4).equals(s.substring((n-1)/2-(n-1)/4,(n-1)/2))) {
      System.out.println("No");
      return;
    }

    if (!s.substring((n+3)/2-1,(n+3)/2+n/4-1).equals(s.substring((n-(n+3)/2)/2+(n+3)/2,n))) {
      System.out.println("No");
      return;
    }

    System.out.println("Yes");

  }

}
