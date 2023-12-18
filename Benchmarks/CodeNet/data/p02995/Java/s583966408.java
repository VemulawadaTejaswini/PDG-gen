import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=sc.nextLong();
    long d=sc.nextLong();
    long cab=b/c-(a-1)/c;
    long dab=b/d-(a-1)/d;
    long e=c*d/gcm(c,d);
    long i=1;
    long eab=b/e-(a-1)/e;
    System.out.println( b-(a-1) - cab - dab + eab );
  }
  static long gcm(long cc,long dd){
    long c=cc;
    long d=dd;
    while(true){
      long f=c%d;
      if(f==0){
        return d;
      }
      c=d;
      d=f;
    }
  }
}
