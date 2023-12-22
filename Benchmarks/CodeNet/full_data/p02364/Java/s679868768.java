import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt(), e=sc.nextInt();
        Node[] nodes=new Node[v];
        for(int i=0;i<v;i++) nodes[i]=new Node(i);
        for(int i=0;i<e;i++){
            int v1=sc.nextInt(), v2=sc.nextInt();
            long w=sc.nextLong();
            nodes[v1].edges.add(new Edge(v1, v2, w));
            nodes[v2].edges.add(new Edge(v2, v1, w));
        }
        sc.close();
        Edge[] mst=prim(v, nodes);
        long ans=0;
        for(Edge edge:mst) ans+=edge.cost;
        System.out.println(ans); 
    }

    public static Edge[] prim(int n, Node[] nodes){
        HashSet<Integer> connected=new HashSet<>();
        connected.add(0);
        PriorityQueue<Edge> pq=new PriorityQueue<>((u, v)->u.cost>v.cost?1:u.cost<v.cost?-1:0);
        for(Edge e:nodes[0].edges) pq.add(e);
        Edge[] ret=new Edge[n-1];
        int index=0; 
        while(pq.size()>0 && connected.size()<n){
            Edge e=pq.poll();
            if(!connected.contains(e.u)){
                ret[index++]=e;
                connected.add(e.u);
                for(Edge edge:nodes[e.u].edges){
                    if(!connected.contains(edge.u) || !connected.contains(edge.v)) pq.add(edge);
                }
            }
            else if(!connected.contains(e.v)){
                ret[index++]=e;
                connected.add(e.v);
                for(Edge edge:nodes[e.v].edges){
                    if(!connected.contains(edge.u) || !connected.contains(edge.v)) pq.add(edge);
                }
            }
        }
        return ret;
    }

    static class Node{
        int id;
        long value;
        Node prev;
        ArrayList<Edge> edges;
        public Node(int id){
            this.id=id;
            this.value=Long.MAX_VALUE;
            edges=new ArrayList<Edge>();
        }
        @Override public boolean equals(Object o){
            if(! (o instanceof Node)) return false;
            Node n=(Node) o;
            if(n.id==id) return true;
            else return false;
        }
        @Override public int hashCode(){return id;}
    }

    static class Edge{
        int u, v;
        long cost;
        public Edge(int u, int v, long cost){
            this.u=u;
            this.v=v;
            this.cost=cost;
        }
    }
}


