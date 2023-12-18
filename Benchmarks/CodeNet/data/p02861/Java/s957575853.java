
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  static double x[] = new double[8];
  static double y[] = new double[8];
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);

    for(int i = 0; i < n; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      x[i] = Double.parseDouble(sl[0]);
      y[i] = Double.parseDouble(sl[1]);
    }

    int v = 1;
    double a = 0;
    for(int i = 0; i < n; i++)
    {
      v *= i + 1;
      a += sum(n, i, 1 << i);
    }

    System.out.println(a / v);
  }


  public static double sum(int n, int start, int mask)
  {
    double a = 0;
    for(int i = 0; i < n; i++)
    {
      if((mask & (1 << i)) == 0)
      {
        a += sum(n, i, mask | (1 << i)) + Math.sqrt((x[start] - x[i]) * (x[start] - x[i]) + (y[start] - y[i]) * (y[start] - y[i]));
      }
    }
    return a;
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
