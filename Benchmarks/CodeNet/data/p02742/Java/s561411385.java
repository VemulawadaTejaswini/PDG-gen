import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();

    long b = sc.nextLong();
    long size = a * b;
    if (a % 2 == 0) {
      a /= 2;
      System.out.println(a*b);
    } else if (b % 2 == 0) {
      b /= 2;
      System.out.println(a*b);
    } else {
      a /= 2;
      System.out.println(a*b+1);
    }
  }
}
