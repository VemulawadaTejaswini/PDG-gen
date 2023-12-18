import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    Long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();

    long n = test(a,c,d);
    long m = test(b,c,d);

    System.out.println(m-n);

  }

  public static long test (long k,long c,long d) {
    long i = k/c;
    long j = k/d;
    long v = k/(c*d);

    return (k-(i+j-v));
  }

}
