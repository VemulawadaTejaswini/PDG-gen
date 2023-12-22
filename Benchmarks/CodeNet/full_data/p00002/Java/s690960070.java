import java.util.*;
import java.io.*;

public class Main {
  private static int a, b;
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    List<String> numst = new ArrayList<String>();
    while (stdIn.hasNextInt()) {
      a = stdIn.nextInt();
      b = stdIn.nextInt();
      numst.add(String.valueOf(a+b));
    }
    for (String  sum: numst) {
      System.out.println(sum.length());
    }
  }
}