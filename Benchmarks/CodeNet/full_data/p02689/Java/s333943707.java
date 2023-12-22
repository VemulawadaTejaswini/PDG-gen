
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

    boolean a[] = new boolean[100001];
    int x[] = new int[100001];
    a[0] = true;

    int n = Integer.parseInt(sl[0]);
    int m = Integer.parseInt(sl[1]);

    s = r.readLine();
    sl = s.split(" ");

    for(int i = 0; i < n; i++)
    {
      x[i + 1] = Integer.parseInt(sl[i]);
    }

    for(int i = 0; i < m; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      int v1 = Integer.parseInt(sl[0]);
      int v2 = Integer.parseInt(sl[1]);
      if(v1 >= v2)
      {
        a[v2] = true;
      }
      if(v2 >= v1)
      {
        a[v1] = true;
      }
    }

    int ss = 0;
    for(int i = 1; i <= n; i++)
    {
      if(!a[i]) ss++;
    }
    System.out.println(ss);
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