import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    String p = "";
    String q = "";
    String r = "";

    for (int i = 0; i < s.length()/2; i++) {
      p += s.charAt(i);
      q += s.charAt(s.length()-i-1);
    }

    for (int i = 0; i < q.length(); i++) {
      r += q.charAt(q.length()-i-1);
    }

    if (p.equals(r)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
