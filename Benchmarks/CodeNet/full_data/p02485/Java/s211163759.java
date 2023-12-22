import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = null;
    while (!(str = sc.next()).equals("0")) {
      int num = 0;
      for (char c: str.toCharArray()) {
        num += Character.getNumericValue(c);
      }
      System.out.println(num);
    }
  }
}