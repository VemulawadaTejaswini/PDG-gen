import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); double min_v;
      try { while (true) { min_v = scn.nextFloat(); int n = (int)(Math.ceil(min_v*min_v / 98 + 1) + 0.1); System.out.println(n); } }
      catch (Exception e) {}
  }
}