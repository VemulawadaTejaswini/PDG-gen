import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main
{
  public static long d[] = new long[123456];
  public static HashMap<Integer, ArrayList<Integer>> h = new HashMap<>();
  public static HashMap<Integer, ArrayList<Long>> hd = new HashMap<>();

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    int n = Integer.parseInt(r.readLine());


    for(int i = 0; i <= n; i++)
    {
      h.put(i, new ArrayList<Integer>());
      hd.put(i, new ArrayList<Long>());
    }

    for(int i = 0; i < n - 1; i++)
    {
      String s = r.readLine();
      String sl[] = s.split(" ");
      int a = Integer.parseInt(sl[0]);
      int b = Integer.parseInt(sl[1]);
      long c = Long.parseLong(sl[2]);

      h.get(a).add(b);
      h.get(b).add(a);
      hd.get(a).add(c);
      hd.get(b).add(c);
    }

    String s = r.readLine();
    String sl[] = s.split(" ");
    int q = Integer.parseInt(sl[0]);
    int k = Integer.parseInt(sl[1]);

    search(k, 999999, 0);
    
    for(int i = 0; i < q; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      int x = Integer.parseInt(sl[0]);
      int y = Integer.parseInt(sl[1]);
      System.out.println(d[x] + d[y]);
    }

  }

  public static void search(int src, int proh, long offset)
  {
    ArrayList<Integer> a = h.get(src);
    ArrayList<Long> ad = hd.get(src);
    d[src] = offset;
    int an = a.size();
    for(int i = 0; i < an; i++)
    {
      int z = a.get(i);
      if(z == proh)
      {
        continue;
      }
      long v = ad.get(i);
      search(z, src, offset + v);
    }
  }

}