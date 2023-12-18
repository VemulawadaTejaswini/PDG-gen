import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    long n = scan.nextLong();

    long g = Math.min(b-1,n);

    double t1 = (double) (a/b);
    t1 *= g;

    double t = g*a;
    t /= b;
    

    System.out.println((long) t);

  }
}
