package abc091.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int n = Integer.parseInt(r.readLine());
    int[] a = new int[200];
    int[] b = new int[200];

    HashMap<Integer, HashSet<Integer>> g = new HashMap<>();
    int[] vn = new int[200];

    for (int i = 0; i < n; i++)
    {
      String[] ls = r.readLine().split("[\\s]+");
      a[i] = Integer.parseInt(ls[0]);
      b[i] = Integer.parseInt(ls[1]);
    }

    for (int i = n; i < 2 * n; i++)
    {
      String[] ls = r.readLine().split("[\\s]+");
      a[i] = Integer.parseInt(ls[0]);
      b[i] = Integer.parseInt(ls[1]);
    }

    for (int i = 0; i < 2 * n; i++)
    {
      g.put(i, new HashSet<Integer>());
    }
    HashSet<Integer> t = new HashSet<>();
    for (int i = 0; i < n; i++)
    {
      t.add(i);
    }
    g.put(1000, t);
    for (int i = n; i < 2 * n; i++)
    {
      g.get(i).add(2000);
    }
    g.put(2000, new HashSet<>());

    for (int i = 0; i < n; i++)
    {
      for (int j = n; j < 2 * n; j++)
      {
        if (a[i] < a[j] && b[i] < b[j])
        {
          g.get(i).add(j);
        }
      }
    }

    // System.out.println(g);
    // System.out.println(path(g, 1000, new HashSet<>()));

    int z = 0;
    for (z = 0;; z++)
    {
      ArrayList<Integer> p = path(g, 1000, new HashSet<>());
      if (p == null)
      {
        break;
      }
      ArrayList<Integer> w = new ArrayList<>(p);
      w.add(0, 1000);
      int ws = w.size();
      for (int i = 0; i < ws - 1; i++)
      {
        re(g, w.get(i), w.get(i + 1));
      }
      
      /*
      ArrayDeque<Integer> qi = new ArrayDeque<>();
      ArrayDeque<ArrayList<Integer>> qa = new ArrayDeque<>();
      ArrayDeque<HashSet<Integer>> qs = new ArrayDeque<>();

      qi.add(1000);
      ArrayList<Integer> ar = new ArrayList<>();
      ar.add(1000);
      qa.add(ar);
      HashSet<Integer> h = new HashSet<>();
      h.add(1000);
      qs.add(h);

      ArrayList<Integer> k = null;
      while (true)
      {
        Integer v = qi.poll();
        // System.out.println(v);
        ArrayList<Integer> arr = qa.poll();
        HashSet<Integer> s = qs.poll();
        if (v == null)
        {
          break;
        }
        else if (s.contains(2000))
        {
          k = arr;
          break;
        }
        else
        {
          for (Integer i : g.get(v))
          {
            if (!s.contains(i))
            {
              qi.add(i);
              ar = new ArrayList<>(arr);
              ar.add(i);
              qa.add(ar);
              h = new HashSet<>(s);
              h.add(i);
              qs.add(h);
            }
          }
        }
        
      }

      if (k == null)
      {
        break;
      }
      else
      {
        int ks = k.size();
        for (int i = 0; i < ks - 1; i++)
        {
          re(g, k.get(i), k.get(i + 1));
        }
      }
      */
    }

    System.out.println(z);
  }

  public static ArrayList<Integer> path(HashMap<Integer, HashSet<Integer>> g, Integer v, HashSet<Integer> h)
  {
    // System.out.println(v);
    if (v == 2000)
    {
      return new ArrayList<>();
    }
    HashSet<Integer> z = g.get(v);
    for (Integer c : z)
    {
      if (!h.contains(c))
      {
        h.add(c);
        ArrayList<Integer> a = path(g, c, h);
        if (a != null)
        {
          a.add(0, c);
          return a;
        }
        h.remove(c);
      }
    }
    return null;
  }

  public static void re(HashMap<Integer, HashSet<Integer>> g, Integer a, Integer b)
  {
    HashSet<Integer> z1 = g.get(a);
    HashSet<Integer> z2 = g.get(b);
    z1.remove(b);
    z2.add(a);
  }

}
