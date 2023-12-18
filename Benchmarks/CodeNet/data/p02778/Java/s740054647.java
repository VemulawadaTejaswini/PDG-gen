import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();

    StringBuilder buf = new StringBuilder();
    for (int i = 0; i < S.length(); i++) buf.append("x");

    System.out.println(buf.toString());
  }
}
