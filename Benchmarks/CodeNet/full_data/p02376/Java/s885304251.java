import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.*;

import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;

class Edge{
    int to,cap,rindex;
    public Edge(int to,int cap,int rindex){
        this.to = to;
        this.cap = cap;
        this.rindex = rindex;
    }
}

class MaxFlow{

    private int N;
    private List<Edge>[] G;
    private int[] bfsLevel;
    private int[] dfsItr;


    public MaxFlow(int N){
        this.N = N;
        G = new ArrayList[N];
        bfsLevel = new int[N];
        dfsItr = new int[N];
        for(int i=0;i<N;++i){
            G[i] = new ArrayList<>();
        }
    }

    public void setEdge(int from,int to,int cap){
        G[from].add(new Edge(to,cap,G[to].size()));
        G[to].add(new Edge(from,0,G[from].size()-1));
    }

    private boolean bfs(int s, int t){
        Arrays.fill(bfsLevel, -1);
        bfsLevel[s] = 0;
        Deque<Integer> que = new ArrayDeque<>();
        que.add(s);
        while(! que.isEmpty()){
            int v = que.poll();
for(Edge e : G[v]){
if(bfsLevel[e.to]<0 && e.cap >0){
bfsLevel[e.to] = bfsLevel[v] + 1;
que.add(e.to);
}
}
        }
        return bfsLevel[t] >= 0;
    }

    private int dfs(int s, int t, int f){
        if(s == t)return f;
        while(dfsItr[s] < G[s].size()){
            Edge e = G[s].get(dfsItr[s]);
            if(bfsLevel[e.to] > bfsLevel[s] && e.cap >0){
            int d = dfs(e.to, t, Math.min(f,e.cap));
            if(d > 0){
                e.cap -= d;
                G[e.to].get(e.rindex).cap +=d;
                return d;
            }
            }
            ++dfsItr[s];
        }
        return 0;
    }

    public int getMaxFlow(int s,int t){
        int res = 0;
        while(true){
            if(!bfs(s,t))break;
            int d = 1;
            Arrays.fill(dfsItr,0);
            while(d > 0){
                d = dfs(s,t,Integer.MAX_VALUE/2);
                res += d;
            }
        }

        return res;
    }
}

class h{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // int Q = scan.nextInt();
        // MaxFlow flow = new MaxFlow(301);
        // int ans = 0;
        // while(Q-- > 0){
        //     int m = scan.nextInt();
        //     int x = scan.nextInt();
        //     if(x>0){
        //         ans += x;
        //         flow.setEdge(0, m, x);
        //         flow.setEdge(m, 1, 0);
        //     }else{
        //         flow.setEdge(0, m, 0);
        //         flow.setEdge(m, 1, -x);
        //     }
        // }

        // for(int m=2;m<=300;++m){
        //     for(int k=2;k<m;++k){
        //         if(m%k == 0){
        //             flow.setEdge(m, k, Integer.MAX_VALUE/2);
        //         }
        //     }
        // }

        // System.out.println(ans - flow.getMaxFlow(0, 1));

        int V = scan.nextInt();
        MaxFlow flow = new MaxFlow(V);
        int E = scan.nextInt();
        while(E-- > 0){
            int u = scan.nextInt();
            int v = scan.nextInt();
            int c = scan.nextInt();
            flow.setEdge(u, v, c);
        }
        System.out.println(flow.getMaxFlow(0, V-1));



    }
}