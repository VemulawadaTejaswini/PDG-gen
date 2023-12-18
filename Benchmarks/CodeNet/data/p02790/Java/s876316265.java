import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    String k = "";
    String l = "";

    for (int i = 0; i < Integer.parseInt(b); i++) {
      k += a;
    }

    for (int i = 0; i < Integer.parseInt(a); i++) {
      l += b;
    }


    if (k.compareTo(l) < 0) {
      System.out.println(k);
    } else {
      System.out.println(l);
    }

  }

}
