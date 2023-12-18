import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);
    int m = Integer.parseInt(sl[1]);
    ArrayList<ArrayList<Integer>> g = new ArrayList<>();
    ArrayList<HashSet<Integer>> ig = new ArrayList<>();
    int prof[] = new int[n + 1];
    g.add(new ArrayList<Integer>());
    ig.add(new HashSet<Integer>());
    HashSet<Integer> set = new HashSet<>();
    for(int i = 1; i <= n; i++)
    {
      g.add(new ArrayList<Integer>());
      ig.add(new HashSet<Integer>());
      set.add(i);
    }

    for(int i = 0; i < n - 1 + m; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      int a = Integer.parseInt(sl[0]);
      int b = Integer.parseInt(sl[1]);
      g.get(a).add(b);
      ig.get(b).add(a);
      set.remove(b);
    }
    Object[] rs = set.toArray();
    int root = (int)rs[0];

    //System.out.println(root);
    ArrayDeque<Integer> q = new ArrayDeque<>();
    ArrayDeque<Integer> q2 = new ArrayDeque<>();

    q.add(root);
    q2.add(0);
    while(!q.isEmpty())
    {
      int proc = q.pop();
      int proc2 = q2.pop();
      ig.get(proc).remove(proc2);
      if(ig.get(proc).isEmpty())
      {
        prof[proc] = proc2;
        for(Integer e : g.get(proc))
        {
          q.add(e);
          q2.add(proc);
        }
      }
    }

    for(int i = 1; i <= n; i++)
    {
      System.out.println(prof[i]);
    }
  }


}
