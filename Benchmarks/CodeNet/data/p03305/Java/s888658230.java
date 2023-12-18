
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String str = r.readLine();
    String[] sl = str.split("[\\s]+");
    int n = Integer.parseInt(sl[0]);
    int m = Integer.parseInt(sl[1]);
    int s = Integer.parseInt(sl[2]);
    int t = Integer.parseInt(sl[3]);

    int u[] = new int[100003];
    int v[] = new int[100003];
    long a[] = new long[100003];
    long b[] = new long[100003];
    long uy[] = new long[100003];
    long up[] = new long[100003];
    long vs[] = new long[100003];
    long vp[] = new long[100003];

    for(int i = 0; i < m; i++)
    {
      str = r.readLine();
      sl = str.split("[\\s]+");
      int uu = Integer.parseInt(sl[0]);
      int vv = Integer.parseInt(sl[1]);
      int aa = Integer.parseInt(sl[2]);
      int bb = Integer.parseInt(sl[3]);

      u[i] = uu;
      v[i] = vv;
      a[i] = aa;
      b[i] = bb;
    }

    for(int i = 0; i <= n; i++)
    {
      uy[i] = 1000000000000000000L;
      up[i] = 1000000000000000000L;
      vs[i] = 1000000000000000000L;
      vp[i] = 1000000000000000000L;
    }

    uy[s] = 0;
    vs[t] = 0;

    for(int i = 1; i <= n; i++)
    {
      for(int j = 0; j < m; j++)
      {
        int uu = u[j];
        int vv = v[j];
        long aa = a[j];
        long bb = b[j];

        if(uy[uu] > uy[vv] + aa)
        {
          uy[uu] = uy[vv] + aa;
          up[uu] = vv;
        }

        if(uy[vv] > uy[uu] + aa)
        {
          uy[vv] = uy[uu] + aa;
          up[vv] = uu;
        }

        if(vs[uu] > vs[vv] + bb)
        {
          vs[uu] = vs[vv] + bb;
          vp[uu] = vv;
        }
        if(vs[vv] > vs[uu] + bb)
        {
          vs[vv] = vs[uu] + bb;
          vp[uu] = vv;
        }

      }
    }

    long tc[] = new long[100003];
    tc[n + 1] = 1000000000000000000L;
    for(int i = n; i >= 1; i--)
    {
      tc[i] = Math.min(uy[i] + vs[i], tc[i + 1]);
    }

    for(int i = 1; i <= n; i++)
    {
      System.out.println(1000000000000000L - tc[i]);
    }

  }
}