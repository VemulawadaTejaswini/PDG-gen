import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  static long x = 0;
  static long y = 0;

  static long m[][] = new long[64][2];

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split(" ");
    x = Long.parseLong(sl[0]);
    y = Long.parseLong(sl[1]);

    if((x + y) % 3 != 0 || y > 2 * x || x > 2 * y)
    {
      System.out.println(0);
      System.exit(0);
    }

    long n = (x + y) / 3;
    long k = 2 * n - y;
    long u = n - k;

    //System.out.println(n);
    //System.out.println(k);
    //System.out.println(u);

    long a = 1;
    RemRing rr = new RemRing(1000000007L);
    for(int i = 1; i <= n; i++)
    {
      a = rr.prod(a, i);
    }
    for(int i = 1; i <= k; i++)
    {
      a = rr.div(a, i);
    }
    for(int i = 1; i <= u; i++)
    {
      a = rr.div(a, i);
    }

    System.out.println(a);

  }

}

class RemRing
{
 long module;
 public RemRing(long module)
 {
   this.module = module;
 }

 public long sum(long a, long b)
 {
   return (a + b + module) % module;
 }

 public long sub(long a, long b)
 {
   return (a - b + module) % module;
 }

 public long prod(long a, long b)
 {
   return (a * b) % module;
 }

 public long div(long a, long b)
 {
   return (a * inv(b)) % module;
 }

 public long inv(long a)
 {
   long b = this.module;
   long u = 1;
   long v = 0;
   while(b > 0)
   {
     long t = a / b;
     a -= t * b;
     u -= t * v;
     long z = a;
     a = b;
     b = z;
     z = u;
     u = v;
     v = z;
   }
   u %= this.module;
   if(u < 0) u += this.module;
   return u;
 }

}
