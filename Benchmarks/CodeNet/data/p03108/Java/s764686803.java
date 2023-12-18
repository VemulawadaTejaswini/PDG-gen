import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    PrintWriter out = new PrintWriter(System.out);

    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");

    int n = Integer.parseInt(sl[0]);
    int m = Integer.parseInt(sl[1]);

    UnionFind uf = new UnionFind(n);

    int a[] = new int[m];
    int b[] = new int[m];
    long res[] = new long[m];

    for(int i = 0; i < m; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      a[i] = Integer.parseInt(sl[0]) - 1;
      b[i] = Integer.parseInt(sl[1]) - 1;
    }

    long z = n * (n - 1) / 2;

    for(int i = m - 1; i >= 0; i--)
    {
      res[i] = z;
      int x = a[i];
      int y = b[i];

      if(!uf.sim(x, y))
      {
        int xx = uf.getSize(x);
        int yy = uf.getSize(y);
        uf.union(x, y);
        z -= xx * yy;
      }
    }


    for(int i = 0; i < m; i++)
    {
      out.println(res[i]);
    }

    out.flush();
  }

  public static class UnionFind
  {
    int n;
    int parent[];
    int rank[];
    int size[];

    public UnionFind(int n)
    {
      this.n = n;
      parent = new int[n];
      rank = new int[n];
      size = new int[n];

      for(int i = 0; i < n; i++)
      {
        parent[i] = i;
        size[i] = 1;
      }
    }

    public int getSize(int x)
    {
      if(parent[x] == x)
      {
        return size[x];
      }
      return getSize(find(x));
    }

    public int union(int x, int y)
    {
      int fx = find(x);
      int fy = find(y);
      if(rank[fx] > rank[fy])
      {

        size[fx] += getSize(fy);
        parent[fy] = fx;
      }
      else if(rank[fx] < rank[fy])
      {
        size[fy] += getSize(fx);
        parent[fx] = fy;
      }
      else if(fx != fy)
      {
        size[fx] += getSize(fy);
        parent[fy] = fx;
        rank[fx]++;
      }

      return 0;
    }

    public int find(int x)
    {
      if(parent[x] == x)
      {
        return x;
      }
      parent[x] = find(parent[x]);
      return parent[x];
    }

    public boolean sim(int x, int y)
    {
      return find(x) == find(y);
    }
  }


}