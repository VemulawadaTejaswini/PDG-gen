import java.util.*;
import java.io.*;

import static java.lang.System.in;
class Main{
    static ArrayList<Edge>[] oriGraph;
    static ArrayList<Integer>[] newGraph;
    static int n;
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String temp;
        String[] buf;
        temp = reader.readLine();
        buf = temp.split(" ");

        n = Integer.parseInt(buf[0]);
        int m = Integer.parseInt(buf[1]);
        oriGraph = new ArrayList[n+1];
        for(int i=0;i<=n;i++) oriGraph[i] = new ArrayList<>();

        Edge[] save = new Edge[m];
        for(int i=0;i<m;i++){
            temp = reader.readLine();
            buf = temp.split(" ");
            int p = Integer.parseInt(buf[0]);
            int q = Integer.parseInt(buf[1]);
            int c = Integer.parseInt(buf[2]);
            oriGraph[p].add(new Edge(p,q,c,i));
            oriGraph[q].add(new Edge(q,p,c,i));
            save[i] = new Edge(p,q,c,i);
        }
        // bfs to find connected blocks and set new vertex
        newGraph = new ArrayList[n+1+m];
        for(int i=0;i<=n+m; i++) newGraph[i] = new ArrayList<>();
        HashSet<Integer> edgeRec =new HashSet<>();
        for(int i=0,k=n;i<m;i++){
            if(edgeRec.contains(i)) continue;
            k++;
            BFS_find_block(save[i],edgeRec,k);
        }
        // bfs to find shortest path in the two-part new grpah
        int ans = BFS_shortest_path();
        System.out.println(ans);
    }

    static void BFS_find_block(Edge e, HashSet<Integer> edgeRec, int k){
        int company = e.com;
        edgeRec.add(e.id);
        HashSet<Integer> curPoint = new HashSet<>();
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(e.from);
        queue.add(e.to);
        curPoint.add(e.from);
        curPoint.add(e.to);
        while(queue.size()>0){
            int now = queue.poll();
            for(Edge w:oriGraph[now]){
                if(w.com==company&&!curPoint.contains(w.to)){
                    curPoint.add(w.to);
                    queue.offer(w.to);
                    edgeRec.add(w.id);
                }
            }
        }
        for(Integer w:curPoint){
            newGraph[w].add(k);
            newGraph[k].add(w);
        }
    }

    static int BFS_shortest_path(){
        int res=0;
        HashSet<Integer> vis = new HashSet<>();
        LinkedList<Integer> cur = new LinkedList<>();
        LinkedList<Integer> next = new LinkedList<>();
        cur.offer(1);
        while(cur.size()>0){
            int now = cur.poll();
            if(now==n) return res/2;
            vis.add(now);
            for(Integer w:newGraph[now]){
                if(!vis.contains(w)) next.add(w);
            }
            if(cur.size()==0){
                res++;
                cur=next;
                next=new LinkedList<>();
            }
        }
        return -1;
    }
    static class Edge{
        int from,to,com,id;
        public Edge(int f, int t, int c, int i){
            this.to = t;
            this.com = c;
            this.from = f;
            this.id = i;
        }
    }
}
