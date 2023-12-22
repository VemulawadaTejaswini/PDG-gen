import java.lang.System;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    String s = new Scanner(System.in).nextLine();
    String t = new Scanner(System.in).nextLine();

    String p = t.replaceFirst(".$", "");
     if (s.equals(p)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
  }
}
