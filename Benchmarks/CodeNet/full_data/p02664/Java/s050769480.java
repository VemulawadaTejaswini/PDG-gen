import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String t = sc.next();

    for (int i = 0; i < t.length(); i++) {
      String k = t.substring(i,i+1);
      if (k.equals("?")) {
        System.out.print("D");
      } else {
        System.out.print(k);
      }
    }

    System.out.println();

  }

}
