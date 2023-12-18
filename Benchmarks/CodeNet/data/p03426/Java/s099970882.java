package abc089.d;

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

    int c[] = new int[100000];
    HashMap<Integer, TreeMap<Integer, Integer>> m = new HashMap<Integer, TreeMap<Integer, Integer>>();

    int lim = h * w - d;
    for(int i = 1; i <= lim; i++)
    {
      int ch = mh.get(i);
      int cw = mw.get(i);
      int nh = mh.get(i + d);
      int nw = mw.get(i + d);
      int mp = Math.abs(ch - nh) + Math.abs(cw - nw);
      c[i] = mp;
    }

    s = r.readLine();
    int q = Integer.parseInt(s);


    for(int i = 0; i < q; i++)
    {
      int mp = 0;
      s = r.readLine();
      sl = s.split("[\\s]+");
      int st = Integer.parseInt(sl[0]);
      int gl = Integer.parseInt(sl[1]);
      int bs = st;
      int bg = gl;
      while(st != gl)
      {
        if(m.containsKey(st) && m.get(st).floorEntry(gl) != null)
        {
          Entry<Integer, Integer> e = m.get(st).floorEntry(gl);
          mp += e.getValue();
          st = e.getKey();
        }
        else
        {
          mp += c[st];
          st += d;
        }
      }
      System.out.println(mp);
      if(!m.containsKey(bs))
      {
        m.put(bs, new TreeMap<Integer, Integer>());
      }
      m.get(bs).put(bg, mp);
    }

  }

}
