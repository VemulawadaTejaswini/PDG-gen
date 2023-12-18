
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
    int prof[] = new int[n + 1];
    g.add(new ArrayList<Integer>());
    HashSet<Integer> set = new HashSet<>();
    for(int i = 1; i <= n; i++)
    {
      g.add(new ArrayList<Integer>());
      set.add(i);
    }

    for(int i = 0; i < n - 1 + m; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      int a = Integer.parseInt(sl[0]);
      int b = Integer.parseInt(sl[1]);
      g.get(a).add(b);
      set.remove(b);
    }
    Object[] rs = set.toArray();
    int root = (int)rs[0];

    //System.out.println(root);
    ArrayDeque<Integer> q = new ArrayDeque<>();

    q.add(root);
    while(!q.isEmpty())
    {
      int proc = q.pop();
      for(Integer e : g.get(proc))
      {
        prof[e] = proc;
        q.add(e);
      }
    }

    for(int i = 1; i <= n; i++)
    {
      System.out.println(prof[i]);
    }
  }


}