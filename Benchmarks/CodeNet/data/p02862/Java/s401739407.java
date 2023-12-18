import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long mod = 1000000007;

      long x = Long.parseLong(sc.next());
      long y = Long.parseLong(sc.next());

      long m = (2*x-y)/3;
      long n = (2*y-x)/3;

      long ans = 0;

      int flag = 1;

if((x+y)%3!=0 || m<0 ||n<0){
  flag = 0;
}
else{
//////////////////////////////////////////////
long m2 = m + n;

long ue = bikkuriP(m2,mod);
long hidari = bikkuriP(n,mod);
long migi =  bikkuriP(m2-n,mod);

long shita = (hidari*migi)%mod;

ans = ue*pinv(shita,mod,mod)%mod;
//////////////////////////////////////////////
}

  System.out.println(ans*flag);




    }
    public static long bikkuriP(long n, long mod){
      long ans = 1;
      for(long i = n;i>0;i--){
        ans = (ans*i)%mod;
      }
      return ans;
    }
    public static long pinv(long a, long b, long p){
      long r0 = a; long r1 = b;
      long x0 = 1; long x1 = 0;
      long y0 = 0; long y1 = 1;
      while(r1>0){
        long q = r0/r1;
        long r2 = r0 % r1;
        long x2 = x0 -pmult(q,x1,p)+p;
        x2 %= p;
        long y2 = y0 -pmult(q,y1,p)+p;
        y2 %= p;
        r0 = r1; r1 = r2;
        x0 = x1; x1 = x2;
        y0 = y1; y1 = y2;
      }
      return x0;
    }
    public static long pmult(long a,long b,long p){
      return (a * b) % p;
    }

}
