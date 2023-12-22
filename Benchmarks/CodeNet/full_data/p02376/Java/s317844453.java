import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

@SuppressWarning("unchecked")
class MaxFlow{
    class Edge{
        int to,cap,revIndex;
        Edge(int to,int cap,int rev){
            this.to = to;
            this.cap = cap;
            revIndex = rev;
        }
    }

    List<Edge>[] edgeList;
    int N;
    int[] index;
    int[] level;

    MaxFlow(int N){
        this.N = N;
        edgeList = new ArrayList[N];
        index = new int[N];
        level = new int[N];
        for(int i=0;i<N;++i)edgeList[i]=new ArrayList<>();
    }

    void addEdge(int from,int to,int cap){
        edgeList[from].add(new Edge(to,cap,edgeList[to].size()));
        edgeList[to].add(new Edge(from,0,edgeList[from].size()-1));
    }

    

    
    int dfs(int v,int t,int f){
        if(v==t)return f;
        for(;index[v]<edgeList[v].size();++index[v]){
            Edge e = edgeList[v].get(index[v]);
            if(e.cap<=0 || level[e.to] <= level[v])continue;
            int u = e.to;
            int F = dfs(u,t,Math.min(f,e.cap));
            if(F>0){
                e.cap -= F;
                edgeList[u].get(e.revIndex).cap += F;
                return F;
            }
        }
        return 0;
    }

    void bfs(int s){
        Arrays.fill(level,-1);
        level[s]=0;
        Deque<Integer> que = new ArrayDeque<>();
        que.add(s);
        while(!que.isEmpty()){
            int v = que.poll();
            for(Edge e : edgeList[v]){
                if(level[e.to]<0 && e.cap>0){
                    level[e.to]=level[v]+1;
                    que.add(e.to);
                }
            }
        }
    }

    int getMaxFlow(int s,int t){
        int res = 0;
        while(true){
            Arrays.fill(index,0);
            bfs(s);
            if(level[t]<0)break;
            while(true){
                int f = dfs(s,t,Integer.MAX_VALUE);
                if(f<=0)break;
                res+=f;

            }
        }
        return res;
    }
}

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        MaxFlow mf = new MaxFlow(n);
        while(m-->0){
            int from = scan.nextInt();
            int to = scan.nextInt();
            int cap = scan.nextInt();
            mf.addEdge(from, to, cap);
        }
        System.out.println(mf.getMaxFlow(0, n-1));

    }
}


