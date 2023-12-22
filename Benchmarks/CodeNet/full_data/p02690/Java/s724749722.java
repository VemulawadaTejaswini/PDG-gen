
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

    long a[] = new long[1001];

    long n = Long.parseLong(sl[0]);

    for(int i = 0; i <= 1000; i++)
    {
      a[i] = i;
      a[i] *= i;
      a[i] *= i;
      a[i] *= i;
      a[i] *= i;
    }

    for(int i = 0; i <= 1000; i++)
    {
      for(int j = 0; j <= 1000; j++)
      {
        if(a[i] - a[j] == n)
        {
          System.out.printf("%d %d\n", i, j);
          System.exit(0);
        }
        if(a[i] + a[j] == n)
        {
          System.out.printf("%d %d\n", i, - j);
          System.exit(0);
        }
        if(- a[i] - a[j] == n)
        {
          System.out.printf("%d %d\n", - i, j);
          System.exit(0);
        }
        if(- a[i] + a[j] == n)
        {
          System.out.printf("%d %d\n", - i, - j);
          System.exit(0);
        }
      }
    }

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