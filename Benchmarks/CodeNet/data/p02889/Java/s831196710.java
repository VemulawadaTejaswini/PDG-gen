import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
import java.util.*;
import java.lang.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class Main implements Runnable {

  static BufferedReader in;
  static PrintWriter out;

  static int n,m,l;
  static int[] from, to, parent, timesRefilled, fuelLeft, queue;
  static int[][] adj;
  static Map<Integer,Integer> costOfPath, totalRefills;
  static Map<Integer,Boolean> visited;

  public static int[][] generateAdjList(int n, int[] from, int[] to, int fromLen)
  {
    int[][] g = new int[n][];
    int[] p = new int[n];
    for (int f : from)
      p[f]++;
    for (int t : to)
      p[t]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]];
    for (int i = 0; i < fromLen; i++)
    {
      g[from[i]][--p[from[i]]] = to[i];
      g[to[i]][--p[to[i]]] = from[i];
    }
    return g;
  }

  public static void bfs(int start)
  {
    int i=0;
    int queueSize=0;
    queue[queueSize++]=start;
    parent[start] = -1;

    while(i<queueSize) {
      int cur = queue[i++];
      for (int next : adj[cur]) {
        if(!hasVisitedEdge(cur, next) && parent[cur] != next) {
          int fuelNeeded = costOfPath.get(getEdgeKey(cur, next));
          if(timesRefilled[cur] < timesRefilled[next]) {
            if(fuelNeeded <= fuelLeft[cur]) {
              timesRefilled[next] = timesRefilled[cur];
              fuelLeft[next] = fuelLeft[cur] - fuelNeeded;

              parent[next]=cur;
              queue[queueSize++]=next;

              visited.put(getEdgeKey(next,cur), true);
              visited.put(getEdgeKey(cur,next), true);
            }
            else if(fuelNeeded > fuelLeft[cur] && fuelNeeded <= l) {
              timesRefilled[next] = timesRefilled[cur] + 1;
              fuelLeft[next] = l - fuelNeeded;

              parent[next]=cur;
              queue[queueSize++]=next;

              visited.put(getEdgeKey(next,cur), true);
              visited.put(getEdgeKey(cur,next), true);
            }
          }
          else if(timesRefilled[cur] == timesRefilled[next]) {
            fuelLeft[next] = Math.max(fuelLeft[next], fuelLeft[cur]);

            if(fuelNeeded <= fuelLeft[next]) {
              fuelLeft[next] -= fuelNeeded;

              parent[next]=cur;
              queue[queueSize++]=next;

              visited.put(getEdgeKey(next,cur), true);
              visited.put(getEdgeKey(cur,next), true);
            }
            else if(fuelNeeded > fuelLeft[next] && fuelNeeded <= l) {
              fuelLeft[next] = l - fuelNeeded;

              parent[next]=cur;
              queue[queueSize++]=next;

              visited.put(getEdgeKey(next,cur), true);
              visited.put(getEdgeKey(cur,next), true);
            }
          }
        }
      }
    }
  }

  public static int getEdgeKey(int x, int y) {
    return x*1000+y;
  }

  public static boolean hasVisitedEdge(int x, int y) {
    int key = getEdgeKey(x, y);
    return visited.get(key) != null && !visited.get(key);
  }
 
  public static void main(String[] args) {
      new Thread(null, new Main(), "whatever", 1<<29).start();
  }
 
  public void run() {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out, false);
 
    try
    {
      // in = new BufferedReader(new FileReader("class_treasurer.txt"));
      // out = new PrintWriter("output.txt");

      int t,x1,q,i,j,s;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Integer.parseInt(token[0]);
      m=Integer.parseInt(token[1]);
      l=Integer.parseInt(token[2]);

      from=new int[m];
      to=new int[m];
      costOfPath=new HashMap<>();
      timesRefilled=new int[n];
      fuelLeft=new int[n];
      visited=new HashMap<>();
      parent=new int[n];
      queue=new int[n];
      totalRefills=new HashMap<>();

      for(i = 0; i < m; i++) {
        str = in.readLine().trim();
        token = str.split(" ");
        int u = Integer.parseInt(token[0]) - 1;
        int v = Integer.parseInt(token[1]) - 1;
        int cost = Integer.parseInt(token[2]);
        from[i] = u;
        to[i] = v;
        costOfPath.put(getEdgeKey(u, v), cost);
        costOfPath.put(getEdgeKey(v, u), cost);
      }

      adj=generateAdjList(n, from, to, m);

      for(i = 0; i < n; i++) {
        Arrays.fill(parent, 0);
        parent[i]=-1;

        visited.clear();

        fuelLeft[i]=l;

        Arrays.fill(timesRefilled, Integer.MAX_VALUE);
        timesRefilled[i]=0;

        bfs(i);

        for(j=0;j<n;j++) {
          totalRefills.put(getEdgeKey(i,j), timesRefilled[j]);
          totalRefills.put(getEdgeKey(j,i), timesRefilled[j]);
        }
      }

      str=in.readLine().trim();
      token=str.split(" ");
      q=Integer.parseInt(token[0]);

      for(i=0;i<q;i++) {
        str=in.readLine().trim();
        token=str.split(" ");
        s=Integer.parseInt(token[0])-1;
        t=Integer.parseInt(token[1])-1;

        if(totalRefills.get(getEdgeKey(s,t))==Integer.MAX_VALUE) {
          out.println(-1);
        }
        else {
          out.println(totalRefills.get(getEdgeKey(s,t)));
        }
      }

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
