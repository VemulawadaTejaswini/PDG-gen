

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<edge> edges;
    ArrayList<ArrayList<Integer>>g_old;
    ArrayList<ArrayList<Integer>>g;
    int[] value;
    int[] map;
    int[] map2;
    public D(int n){
        edges=new ArrayList<>();
        g_old=new ArrayList<>();
        g=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> v1=new ArrayList<>();
            ArrayList<Integer> v2=new ArrayList<>();
            g.add(v1);
            g_old.add(v2);
        }
        value=new int[n];
        map=new int[n];
        map2=new int[n];
    }
    class edge{
        int from;
        int to;
        public edge(int from,int to){
            this.from=from;
            this.to=to;
        }
    }

    void addEdge(int v1,int v2){
        edge e1=new edge(v1,v2);
        edge e2=new edge(v2,v1);
        edges.add(e1);
        edges.add(e2);
        int m=edges.size();
        g_old.get(v1).add(m-2);
        g_old.get(v2).add(m-1);
    }
    void dfs(int cur){
        map2[cur]=1;
        for(int i=0;i<g_old.get(cur).size();i++){
            edge e=edges.get(g_old.get(cur).get(i));
            if(map2[e.to]==0){
                g.get(cur).add(e.to);
                dfs(e.to);
            }
        }
    }







    void op(int v,int value){
        map[v]=1;
        this.value[v]+=value;
        for(int i=0;i<g.get(v).size();i++){
            int e= g.get(v).get(i);
            if(map[e]==0){
                op(e,value);
            }
        }
        map[v]=0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,q;
        n=sc.nextInt();
        q=sc.nextInt();

        Main d=new Main(n);
        for(int i=0;i<n-1;i++){
            int a,b;
            a=sc.nextInt()-1;
            b=sc.nextInt()-1;
            d.addEdge(a,b);
        }
        d.dfs(0);
        for(int i=0;i<q;i++){
            int v,val;
            v=sc.nextInt()-1;
            val=sc.nextInt();
            d.op(v,val);
        }
        for(int i=0;i<n;i++){
            System.out.println(d.value[i]);
        }
    }
}
