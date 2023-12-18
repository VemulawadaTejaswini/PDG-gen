import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    long n = s.nextLong();
    long dMin = Long.MAX_VALUE;
    for (int i = 0; i < 5; i++) {
      long d = s.nextLong();
      dMin = Math.min(dMin, d);
    }
    long count = (n / dMin) + (n % dMin > 0 ? 1 : 0);
    System.out.println(4 + count);
  }
}
