import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);

    long k[] = new long[100002];
    long fact[] = new long[100002];
    s = r.readLine();
    sl = s.split(" ");
    for(int i = 1; i <= n; i++)
    {
      k[i] = Long.parseLong(sl[i - 1]);
    }

    RemRing rr = new RemRing(1000000007L);

    fact[0] = 1;
    fact[1] = 1;

    for(int i = 2; i < 100002; i++)
    {
      fact[i] = rr.prod(i, fact[i - 1]);
    }

    for(int i = 2; i <= n; i++)
    {
      k[i] = rr.prod(k[i], i);
    }
    
    for(int i = 2; i <= n; i++)
    {
      k[i] = rr.sum(k[i], k[i - 1]);
    }


    long cost = 0;
    for(int i = 1; i <= n; i++)
    {
      long icost = k[i];
      icost = rr.prod(icost, fact[n]);
      icost = rr.div(icost,  fact[i]);
      icost = rr.div(icost,  fact[n - i]);

      System.out.println(icost);
      cost = rr.sum(cost, icost);
    }

    long num = 1;
    for(int i = 1; i <= n; i++)
    {
      num = rr.prod(num, 2L);
    }
    System.out.println(cost);
    cost = rr.prod(cost, num);


    System.out.println(cost);
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
    while (b > 0)
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
    if (u < 0)
      u += this.module;
    return u;
  }
}