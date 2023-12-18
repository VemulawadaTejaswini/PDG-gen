import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    long c = scan.nextLong();
    long d = scan.nextLong();
    if (c<d){
      long g = c;
      c = d;
      d = g;
    }
    long gg = divisor(c,d);
    long e = c*d/gg;
    long f = find(a,b,c);
    long f1 = find(a,b,d);
    long f2 = find(a,b,e);
    System.out.println(b-a+1-f-f1+f2);
  }

  static long find(long a, long b, long c){
    long sum = 0;
    if (a%c == 0){
      sum += 1;
    }

    long aa = (long) a/c;
    long bb = (long) b/c;
    sum += (bb-aa);
    return sum;
  }

  static long divisor(long a, long b){
    if (b == 0){
      return a;
    }

    long remain = (long) a%b;
    a = b;
    b = remain;
    long result = divisor(a,b);
    return result;
  }
}
