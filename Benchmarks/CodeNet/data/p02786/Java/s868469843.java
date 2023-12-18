import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    System.out.println(func(h));
  }

  public static long func(long a) {
    if(a == 1) return 1;
    long t = func(a / 2);
    return (2 * t + 1);
  }
}