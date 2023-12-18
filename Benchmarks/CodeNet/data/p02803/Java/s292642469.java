
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main
{

  static boolean[][] z = new boolean[22][22];
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");
    int h = Integer.parseInt(sl[0]);
    int w = Integer.parseInt(sl[1]);

    for(int i = 0; i < h; i++)
    {
      s = r.readLine();
      for(int j = 0; j < w; j++)
      {
        z[i + 1][j + 1] = (s.charAt(j) == '.');
      }
    }

    int d = 0;
    for(int i = 0; i < 22; i++)
    {
      for(int j = 0; j < 22; j++)
      {
        for(int k = 0; k < 22; k++)
        {
          for(int l = 0; l < 22; l++)
          {
            if(z[i][j] && z[k][l] && i * 22 + j < k * 22 + l)
            {
              d = Math.max(d,  dist(i, j, k, l));
            }
          }
        }
      }
    }
    System.out.println(d);
  }

  public static int dist(int sx, int sy, int gx, int gy)
  {
    boolean[][] b = new boolean[22][22];
    for(int i = 0; i < 22; i++)
    {
      for(int j = 0; j < 22; j++)
      {
        //System.out.print(z[i][j]);
        b[i][j] = z[i][j];
      }
      //System.out.println();
    }
    return dist_w(b, sx, sy, gx, gy);
  }

  public static int dist_w(boolean[][] b, int sx, int sy, int gx, int gy)
  {
    b[sx][sy] = false;
    int res = 9999;

    ArrayDeque<Integer> qsx = new ArrayDeque<>();
    ArrayDeque<Integer> qsy = new ArrayDeque<>();
    ArrayDeque<Integer> qc = new ArrayDeque<>();
    qsx.add(sx);
    qsy.add(sy);
    qc.add(0);
    int x;
    int y;
    int c;
    while(!qc.isEmpty())
    {
      x = qsx.poll();
      y = qsy.poll();
      c = qc.poll();

//      System.out.println(x);
//      System.out.println(y);
//      System.out.println(c);
//      System.out.println();

      if(x == gx && y == gy)
      {
        return c;
      }

      b[x][y] = false;
      if(b[x - 1][y])
      {
        qsx.add(x - 1);
        qsy.add(y);
        qc.add(c + 1);
      }

      if(b[x + 1][y])
      {
        qsx.add(x + 1);
        qsy.add(y);
        qc.add(c + 1);
      }

      if(b[x][y - 1])
      {
        qsx.add(x);
        qsy.add(y - 1);
        qc.add(c + 1);
      }

      if(b[x][y + 1])
      {
        qsx.add(x);
        qsy.add(y + 1);
        qc.add(c + 1);
      }
    }

    return 0;
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
