import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static int n;
    public static int[] p;
    public static long[] val;
    public static ArrayList<ArrayList<Integer>> adj;
    public static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++) adj.add(new ArrayList<Integer>());
        for(int i=0; i<n-1; i++) {
          st = new StringTokenizer(bf.readLine());
          int a = Integer.parseInt(st.nextToken())-1;
          int b = Integer.parseInt(st.nextToken())-1;
          adj.get(a).add(b);
          adj.get(b).add(a);

        }
        visited = new boolean[n];
        p = new int[n];
        dfs(0);

        val = new long[n];
        for(int i=0; i<q; i++) {
          st = new StringTokenizer(bf.readLine());
          int pp = Integer.parseInt(st.nextToken())-1;
          int x = Integer.parseInt(st.nextToken());
          val[pp] += x;
        }

        dfs2(0);
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<n; i++) ans.append(val[i]+" ");
        out.println(ans.toString());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
    public static void dfs(int v) {
      visited[v] = true;
      for(int i : adj.get(v)) {
        if(!visited[i]) {
          p[i] = v;
          dfs(i);
        }
      }
    }
    public static void dfs2(int v) {
      if(v != 0)
        val[v] += val[p[v]];
      for(int i : adj.get(v)) {
        if((p[i]==v)) {

          dfs2(i);
        }
      }
    }
}
