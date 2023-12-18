import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static int n,maxn;
    static long mod = 1000000000+7;
    static HashSet<Integer>[] graph;
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        //String[] buf = reader.readLine().split(" ");
        n = sc.nextInt();
        maxn = 1<<n;
        int A  = sc.nextInt(), B = sc.nextInt();
        int[] prev = new int[maxn];
        Arrays.fill(prev,maxn);
        graph = new HashSet[maxn];
        for(int i=0;i<maxn;i++) graph[i]=new HashSet<>();
        for(int i=0;i<maxn;i++) addEdge(i);
        LinkedList<Integer> res = solve(A,B);
        if(res.size()==0){
            System.out.println("NO");
        }else{
            PrintWriter out = new PrintWriter(System.out);
            out.println("YES");
            for(int w:res) out.print(String.format("%d ",w));
            out.flush();
        }
    }
    static LinkedList<Integer> solve(int A, int B){
        boolean flag = false;
        if(count(A)>count(B)){
            flag = true;
            int C = A;
            A = B; B = C;
        }
        int[] prev = new int[maxn];
        Arrays.fill(prev,maxn);
        boolean[] vis = new boolean[maxn];
        vis[A] = true;
        for(int i=0;A>0;i++){
            int mask = 1<<i;
            if((A&mask)==0) continue;
            int target = A^mask;
            prev[target] = A;
            vis[target] = true;
            A = target;
        }
        vis[B] = true;
        for(int i=0;B<maxn-1;i++){
            int mask = 1<<i;
            if((B&mask)>0) continue;
            int target = B|mask;
            prev[target] = B;
            vis[target] = true;
            B = target;
        }
        vis[maxn-1] = false;
        LinkedList<Integer> que = new LinkedList<>();
        que.add(0);
        while(que.size()>0){
            int cur = que.poll();
            for(int w:graph[cur]){
                if(vis[w]) continue;
                vis[w] = true;
                que.add(w);
                prev[w] = cur;
            }
        }
        int cnt = 0;
        for(int i=0;i<maxn;i++) cnt += vis[i]?1:0;
        LinkedList<Integer> res = new LinkedList<>();
        if(cnt!=maxn) return res;
        int cur = B;
        while(cur<maxn){
            res.addFirst(cur);
            cur = prev[cur];
        }
        if(res.size()!=maxn) return new LinkedList<>();
        if(!flag) return res;
        else{
            LinkedList<Integer> ans = new LinkedList<>();
            while(res.size()>0) ans.addFirst(res.pollFirst());
            return ans;
        }
    }
    static int count(int x){
        int ans = 0;
        for(int i=0;i<20;i++){
            if((x&(1<<i))>0) ans++;
        }
        return ans;
    }
    static void addEdge(int cur){
        for(int i=0;i<n;i++){
            int mask = 1<<i;
            if((cur&mask)>0){
                int target = cur^mask;
                graph[cur].add(target);
                graph[target].add(cur);
            }else{
                int target = cur|mask;
                graph[cur].add(target);
                graph[target].add(cur);
            }
        }
    }
}