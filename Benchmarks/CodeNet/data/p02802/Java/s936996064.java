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
    int m = Integer.parseInt(sl[1]);

    boolean acd[] = new boolean[100001];
    int wa[] = new int[100001];

    for(int i = 0; i < m; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      int v = Integer.parseInt(sl[0]) - 1;
      if(sl[1].equals("AC"))
      {
        acd[v] = true;
      }
      else if(!acd[v])
      {
        wa[v]++;
      }
    }


    int acs = 0;
    int was = 0;
    for(int i = 0; i < n; i++)
    {
      if(acd[i])
      {
        acs++;
        was += wa[i];
      }
    }

    System.out.printf("%d %d", acs, was);
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