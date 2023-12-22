import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long v = sc.nextLong();
    long b = sc.nextLong();
    long w = sc.nextLong();
    long t = sc.nextLong();
    String ans = "NO";
    if((t * (v - w)) >= (long)Math.abs(a - b)) ans = "YES";
    System.out.println(ans);
  }
}