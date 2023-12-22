import java.util.*;
import java.io.*;
public class Main {
    
    static ArrayList<Integer> al[];
    static boolean vis[];
    static int max;
    
    static void DFS(int node)
    {
        vis[node] = true;
        max++;
        for(int i : al[node])
        {
            if(vis[i] == false)
            {
                DFS(i);
            }
        }
    }
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      al = new ArrayList[n];
      Arrays.setAll(al, e->new ArrayList());
      vis = new boolean[n];
      for(int i = 0; i < m; i++)
      {
          int temp1 = sc.nextInt() - 1;
          int temp2 = sc.nextInt() - 1;
          al[temp1].add(temp2);
          al[temp2].add(temp1);
      }
      int fin_max = 0;
      for(int i = 0; i < n; i++)
      {
          if(vis[i] == false)
          {
              max = 0;
              DFS(i);
              fin_max = Math.max(fin_max, max);
          }
      }
      w.println(fin_max);
      w.close();
    }
}