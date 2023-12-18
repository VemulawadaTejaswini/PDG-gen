import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  static boolean[][] z = new boolean[22][22];
  static boolean[][] zz = new boolean[22][22];
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");

    long n = Integer.parseInt(sl[0]);
    long v = 0;

    for(int i = 1; i <= n; i++)
    {
      for(int j = 1; j <= n; j++)
      {
        int ii = i, jj = j;
        if(ii < jj)
        {
          int tt = ii;
          ii = jj;
          jj = tt;
        }
        while(jj != 0)
        {
          int tt = ii % jj;
          ii = jj;
          jj = tt;
        }
        if(ii == 1)
        {
          v += n;
        }
        else
        {
          for(int k = 1; k <= n; k++)
          {
            int iii = ii, jjj = k;
            if(iii < jjj)
            {
              int tt = iii;
              iii = jjj;
              jjj = tt;
            }
            while(jjj != 0)
            {
              int tt = iii % jjj;
              iii = jjj;
              jjj = tt;
            }
            v += iii;
          }
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