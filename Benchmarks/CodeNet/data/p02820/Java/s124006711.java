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
    int n = Integer.parseInt(sl[0]);
    int k = Integer.parseInt(sl[1]);

    int a[] = new int[3];
    s = r.readLine();
    sl = s.split(" ");
    a[0] = Integer.parseInt(sl[0]);
    a[1] = Integer.parseInt(sl[1]);
    a[2] = Integer.parseInt(sl[2]);

    s = r.readLine();
    int t[] = new int[100000];
    for(int i = 0; i < n; i++)
    {
      char c = s.charAt(i);
      if(c == 'r')
      {
        t[i] = 2;
      }
      else if(c == 's')
      {
        t[i] = 0;
      }
      else
      {
        t[i] = 1;
      }
    }

    int v[][] = new int[100000][3];
    for(int i = n - 1; i >= n - k; i--)
    {
      v[i][0] = (t[i] == 0 ? 0 : Math.max(t[i] == 1 ? a[1] : 0, t[i] == 2 ? a[2] : 0));
      v[i][1] = (t[i] == 1 ? 0 : Math.max(t[i] == 0 ? a[0] : 0, t[i] == 2 ? a[2] : 0));
      v[i][2] = (t[i] == 2 ? 0 : Math.max(t[i] == 0 ? a[0] : 0, t[i] == 1 ? a[1] : 0));
    }
    for(int i = n - k - 1; i >= 0; i--)
    {
      v[i][0] = Math.max(v[i + k][1] + (t[i] == 1 ? a[1] : 0), v[i + k][2] + (t[i] == 2 ? a[2] : 0));
      v[i][1] = Math.max(v[i + k][0] + (t[i] == 0 ? a[0] : 0), v[i + k][2] + (t[i] == 2 ? a[2] : 0));
      v[i][2] = Math.max(v[i + k][0] + (t[i] == 0 ? a[0] : 0), v[i + k][1] + (t[i] == 1 ? a[1] : 0));
    }

    int vv = 0;
    for(int i = 0; i < k; i++)
    {
      vv += Math.max(v[i][0], Math.max(v[i][1], v[i][2]));
    }

//    for(int i = 0; i < 3; i++)
//    {
//      for(int j = 0; j < n; j++)
//      {
//        System.out.printf("%5d ", v[j][i]);
//      }
//      System.out.println();
//    }

    System.out.println(vv);
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