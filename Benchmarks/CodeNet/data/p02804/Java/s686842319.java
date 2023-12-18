import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
    int k = Integer.parseInt(sl[1]);

    long a[] = new long[n];

    s = r.readLine();
    sl = s.split(" ");
    for(int i = 0; i < n; i++)
    {
      a[i] = Long.parseLong(sl[i]);
    }

    Arrays.sort(a);

    RemRing rr = new RemRing(1000000007L);

    long fact[] = new long[100001];
    fact[0] = 1;
    fact[1] = 1;

    for(int i = 2; i <= 100000; i++)
    {
      fact[i] = rr.prod(fact[i - 1], i);
    }

    long res = 0;

    for(int i = 0; i <= n - k; i++)
    {
      long c = rr.div(fact[n - i - 1], fact[k - 1]);
      c = rr.div(c, fact[(n - i - 1) - (k - 1)]);
      long v = a[n - 1 - i];
      v = rr.sub(v, a[i]);
      v = rr.prod(c, v);
      res = rr.sum(res, v);
    }

    System.out.println(res);
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