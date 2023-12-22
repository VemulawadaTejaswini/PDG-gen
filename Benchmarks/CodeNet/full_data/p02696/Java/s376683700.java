import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    long n = scan.nextLong();

    long g = Math.min(b-1,n);

    long t1 = (long) (a*n/b);
    long t2  = a* ((long) n/b);

    System.out.println(t1-t2);

  }
}
