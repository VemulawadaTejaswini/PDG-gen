import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    long mod = s % ((long)Math.pow(10, 9));
    long x3 = (long)Math.pow(10, 9) - mod;
    if(mod == 0) x3 = 0;
    long y3 = (s + x3) / (long)(Math.pow(10, 9));
    System.out.println(0 + " " + 0 + (long)Math.pow(10, 9) + " " + 1 + " " + x3 + " " + y3);
  }
}