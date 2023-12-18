import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split("[\\s]+");
    int h = Integer.parseInt(sl[0]);
    int w = Integer.parseInt(sl[1]);
    int d = Integer.parseInt(sl[2]);

    HashMap<Integer, Integer> mh = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> mw = new HashMap<Integer, Integer>();

    class z
    {
      public int h;
      public int w;
      public int c;

      z(int hh, int ww, int cc)
      {
        h = hh;
        w = ww;
        c = cc;
      }
    }

    TreeMap<Integer, TreeMap<Integer, z>> memo = new TreeMap<Integer, TreeMap<Integer, z>>();

    for(int i = 1; i <= h; i++)
    {
      s = r.readLine();
      sl = s.split("[\\s]+");
      for(int j = 1; j <= w; j++)
      {
        int k = Integer.parseInt(sl[j - 1]);
        mh.put(k, i);
        mw.put(k, j);
      }
    }

    s = r.readLine();
    int q = Integer.parseInt(s);
    //System.out.println(mh);
    //System.out.println(mw);

    for(int i = 0; i < q; i++)
    {
      int mp = 0;
      s = r.readLine();
      sl = s.split("[\\s]+");
      int st = Integer.parseInt(sl[0]);
      int gl = Integer.parseInt(sl[1]);
      int bs = st;
      int bg = gl;
      int ch = mh.get(st);
      int cw = mw.get(st);
      while(st != gl)
      {
        if(memo.containsKey(st))
        {
          Entry<Integer, z> e = memo.get(st).floorEntry(gl);
          z nz = e.getValue();
          st = e.getKey();
          ch = nz.h;
          cw = nz.w;
          mp += nz.c;

        }
        else
        {
          int nh = mh.get(st + d);
          int nw = mw.get(st + d);
          mp += Math.abs(ch - nh) + Math.abs(cw - nw);
          if(!memo.containsKey(bs))
          {
            memo.put(bs, new TreeMap<Integer, z>());
          }
          memo.get(bs).put(st + d, new z(nh, nw, mp));

          st += d;
          ch = nh;
          cw = nw;
        }
      }
      System.out.println(mp);
    }

  }

}
