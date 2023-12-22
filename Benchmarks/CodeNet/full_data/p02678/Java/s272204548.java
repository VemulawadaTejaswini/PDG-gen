import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        LinkedList<Integer>[] edges = new LinkedList[n+1];
        for(int i = 0; i < n+1; i++) edges[i] = new LinkedList<Integer>();
        for(int i = 0; i < k; i++){
            st = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edges[a].add(b);
            edges[b].add(a);
        }
        boolean[] seen = new boolean[n+1];
        int[] dists = new int[n+1];
        int[] par = new int[n+1];
        LinkedList<State> q = new LinkedList<State>();
        q.add(new State(1,  -1, 0));
        while(!q.isEmpty()){
            State s = q.poll();
            if(seen[s.node]) continue;
            seen[s.node] = true;
            dists[s.node] = s.dist;
            par[s.node] = s.par;
            for(int e: edges[s.node]) q.add(new State(e, s.node, s.dist+1));
        }
        out.println("Yes");
        for(int i = 2; i <= n; i++){
            out.println(par[i]);
        }




        out.close();
    }
    static class State{
        public int node;
        public int dist;
        public int par;
        public State(int n, int p, int d){
            node=n;
            dist=d;
            par=p;
        }
    }
}
