import java.io.*;
import java.util.*;

public class Main {
  static ArrayList<ArrayList<Integer>> g;
  static int[] count;
  	public static void bfs(int u, boolean[] visi)
    {
      LinkedList<Integer> q = new LinkedList<Integer>();
      
      q.add(u);
      visi[u]=true;
      
      while(!q.isEmpty())
      {
        int tmp=q.remove();
        
        for(int num: g.get(tmp))
          	if(!visi[num])
            {
              q.add(num);
              count[num]+=count[tmp];
              visi[num]=true;
            }
      }
    }
    public static void main(String[] args) throws Exception {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, c, k, j;

      StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
      	m = Integer.parseInt(st.nextToken());
     
      g = new ArrayList<ArrayList<Integer>>();
      
      for(i=0;i<=n;i++)
        g.add(new ArrayList<Integer>());
      count = new int[n+1];
		for(i=0;i<n-1;i++)
        {
         st = new StringTokenizer(br.readLine());
          int u =Integer.parseInt(st.nextToken());
          int v =Integer.parseInt(st.nextToken());
          g.get(u).add(v);
          g.get(v).add(u);
        }
      
      for(i=0;i<m;i++)
        {
         st = new StringTokenizer(br.readLine());
          int x =Integer.parseInt(st.nextToken());
          int y =Integer.parseInt(st.nextToken());
          count[x]+=y;
      }
      boolean[] visi = new boolean[n+1];
      bfs(1,visi);
      
      
      
      for(int go=1;go<count.length;go++)
        out.print(count[go]+" ");
      
	out.flush();
	out.close();
	
	}
}