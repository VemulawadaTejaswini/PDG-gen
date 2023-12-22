
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
    long a[] = new long[n];
    long b[] = new long[n];

    s = r.readLine();
    sl = s.split(" ");
    for(int i = 0; i < n; i++)
    {
      a[i] = Long.parseLong(sl[i]);
      b[i] = a[i];
      a[i] = i + 1 + a[i];
      b[i] = i + 1 - b[i];
    }

    Arrays.sort(a);
    Arrays.sort(b);

//    for(int i = 0; i < n; i++)
//    {
//      System.out.println(a[i]);
//    }
//    for(int i = 0; i < n; i++)
//    {
//      System.out.println(b[i]);
//    }

    int k = 0;
    int l = 0;
    int v = 0;
    while(k < n && l < n)
    {
      //System.out.println(k);
      //System.out.println(l);
      if(a[k] < b[l])
      {
        while(k < n && a[k] < b[l]) k++;
      }
      else if(a[k] > b[l])
      {
        while(l < n && a[k] > b[l]) l++;
      }
      else
      {
        long t = a[k];
        int kk = 0;
        int ll = 0;
        while(k < n && a[k] == t)
        {
          k++;
          kk++;
        }
        while(l < n && b[l] == t)
        {
          l++;
          ll++;
        }
        v += kk * ll;
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