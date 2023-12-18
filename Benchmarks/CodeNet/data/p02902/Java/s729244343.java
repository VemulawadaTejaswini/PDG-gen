import java.io.*;
import java.util.*;

public class Main{
    PrintWriter out = new PrintWriter(System.out);
    char[][] maze;
    ArrayList<Integer>[] graph;
    int[] depth = new int[2000];
    boolean[] visited;
    int[] prev;
    int[] dr = new int[]{1,0,-1,0}, dc = new int[]{0,1,0,-1};
    static public void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ")
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        graph = new ArrayList[n+1];
        for(int i=0;i<=n;i++) graph[i] = new ArrayList<>();
        visited = new boolean[n+1];
        prev = new int[n+1];
        for(int i=0;i<m;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            graph[a].add(b);
        }
        // use bfs to find any possible loop
        int start=0;
        for(int i=1;i<=n;i++){
            if(visited[i]) continue;
            start = bfs(i,n);
            if(start>0) break;
        }
        if(start<=0) return -1;
        HashSet<Integer> rec = new HashSet<>();
        rec.add(start);
        int cur = prev[start];
        while(cur!=start){
            rec.add(cur);
            cur = prev[cur];
        }
        int end = prev[start];
        int maxDepth = -1, newStart = -1;
        for(int w:graph[end]){
            if(rec.contains(w)){
                if(depth[w]>maxDepth){
                    maxDepth = depth[w];
                    newStart = w;
                }
            }
        }
        prev[end] = newStart;
        cur = newStart;
        Set<Integer> ans = new HashSet<>();
        while(cur!=end){
            ans.add(cur);
            for(int w:graph[cur]){
                if(rec.contains(w)) cur = w;
            }
        }
        ans.add(end);
        out.println(ans.size());
        for(int w:ans) out.println(w);
        out.flush();
        System.exit(0);
        return -1;
    }
    int bfs(int start, int n){
        // returns a start of one loop found
        Arrays.fill(depth,0);
        boolean[] inQueue = new boolean[n+1];
        int step = 0;
        LinkedList<Integer> cur = new LinkedList<>(), next = new LinkedList<>();
        cur.add(start);
        visited[start] = true;
        while(cur.size()>0){
            for(int now:cur){
//                if(visited[now]) return now;
                visited[now] =true;
                for(int to:graph[now]){
                    if(visited[to]){
                        prev[to] = now;
                        return to;
                    }
                    if(inQueue[to]) continue;
                    inQueue[to] = true;
                    prev[to] = now;
                    next.add(to);
                    depth[to] = step+1;
                }
            }
            cur = next; next = new LinkedList<>(); step++;
        }
        return 0;
    }
}

