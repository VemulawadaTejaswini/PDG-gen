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

    long n = Integer.parseInt(sl[0]);

    s = r.readLine();
    int a[] = new int[4000];
    long z[] = new long[3];
    for(int i = 0; i < n; i++)
    {
      char c = s.charAt(i);
      int t = c == 'R' ? 0 : (c == 'G' ? 1 : 2);
      a[i] = t;
      z[t]++;
    }

    long v = z[0] * z[1] * z[2];

    for(int d = 1; d <= 1999; d++)
    {
      for(int i = 0; i + 2 * d < n; i++)
      {
        if(a[i] != a[i + d] && a[i + d] != a[i + 2 * d] && a[i + 2 * d] != a[i])
        {
          v--;
        }
      }
    }



    System.out.println(v);
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
