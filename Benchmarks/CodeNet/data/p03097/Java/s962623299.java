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
        boolean[] vis = new boolean[maxn];
        vis[A] = true;
        LinkedList<Integer> que = new LinkedList<>();
        que.add(A);
        while(que.size()>0&&!vis[0]){
            int cur = que.poll();
            for(int w:graph[cur]){
                if(vis[w]) continue;
                que.add(w);
                vis[w] = true;
                prev[w] = cur;
            }
        }
        if(!vis[0]){
            System.out.println("NO");
            return;
        }
        HashSet<Integer> used = new  HashSet<>();
        LinkedList<Integer> res = new LinkedList<>();
        int head = prev[0]; res.add(0);
        used.add(0);
        while(head!=maxn){
            res.addFirst(head);
            used.add(head);
            head = prev[head];
        }
        if(B==0){
            if(res.size()!=maxn){
                System.out.println("NO");
                return;
            }
            System.out.println("YES");
            for(int w:res) System.out.print(String.format("%d ",w));
            return;
        }
        Arrays.fill(prev,maxn);
        que.clear();
        que.add(0);
        while(que.size()>0){
            int cur = que.poll();
            for(int w:graph[cur]){
                if(!used.add(w)) continue;
                que.add(w);
                prev[w] = cur;
            }
        }
        LinkedList<Integer> res2 = new LinkedList<>();
        if(!used.contains(B)){
            System.out.println("NO");
            return;
        }
        res2.add(B);
        head = prev[B];
        while(head!=0){
            res2.addFirst(head);
            head = prev[head];
        }
        if(res.size()+res2.size()!=maxn){
            System.out.println("NO");
            return;
        }else{
            System.out.println("YES");
            for(int w:res) System.out.print(String.format("%d ",w));
            for(int w:res2) System.out.print(String.format("%d ",w));
        }
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