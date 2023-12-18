import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Node> nodes=new ArrayList<Node>();
        int n=Integer.parseInt(sc.next());
        int m=Integer.parseInt(sc.next());
        int a,b;
        long c;
        for(int i=0;i<n;i++){
            nodes.add(new Node(i));
        }
        for(int i=0;i<m;i++){
            a=Integer.parseInt(sc.next())-1;
            b=Integer.parseInt(sc.next())-1;
            c=-Long.parseLong(sc.next());
            nodes.get(a).edges.add(new Edge(a,b,c));
        }
        sc.close();
        long ans=BellmanFord.bellmanFord(nodes, 0)[n-1];
        if(ans==Long.MIN_VALUE) System.out.println("inf");
        else System.out.println(-ans);
    }

    static class BellmanFord{
        public static long[] bellmanFord(ArrayList<Node> nodes, int st){
            nodes.get(st).value=0;
            int b;
            long c;
            int size=nodes.size();
            Node fr,to;
            boolean negativeLoop[]=new boolean[size];
            long distance[]=new long[size];
            for(int i=0;i<size;i++) distance[i]=Long.MAX_VALUE;
            distance[st]=0;
            for(int i=0;i<size;i++){
                negativeLoop[i]=false;
                for(int j=0;j<size;j++){
                    for(Edge edge:nodes.get(j).edges){
                        if(nodes.get(j).value==Long.MAX_VALUE) continue;
                        b=edge.to;
                        c=edge.cost;
                        fr=nodes.get(j);
                        to=nodes.get(b);
                        if(to.value>fr.value+c){
                            to.value=fr.value+c;
                            distance[b]=to.value;
                        }
                    }
                }
            }           
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    for(Edge edge:nodes.get(j).edges){
                        if(nodes.get(j).value==Long.MAX_VALUE) continue;
                        b=edge.to;
                        c=edge.cost;
                        fr=nodes.get(j);
                        to=nodes.get(b);
                        if(to.value>fr.value+c){
                            to.value=fr.value+c;
                            negativeLoop[b]=true;
                            distance[b]=Long.MIN_VALUE;
                        }
                        if(negativeLoop[j]){
                            negativeLoop[b]=true;
                            distance[b]=Long.MIN_VALUE;
                        }
                    }
                }
            }
            return distance;
        }
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
        @Override public int hashCode(){
            return id;
        }
    }

    static class Edge{
        int from;
        int to;
        long cost;
        public Edge(int from, int to, long cost){
            this.from=from;
            this.to=to;
            this.cost=cost;
        }
    }

    static class Pair{
        int id1;
        int id2;
        public Pair(int id1, int id2){
            this.id1=id1;
            this.id2=id2;
        }
        @Override public boolean equals(Object o){
            if(! (o instanceof Pair)) return false;
            Pair p=(Pair) o;
            if((p.id1==id1 && p.id2==id2) || (p.id1==id2 && p.id2==id1)) return true;
            else return false;
        }
        @Override public int hashCode(){
            int res=17;
            res=((res*31+id1)*31+id2)+((res*31+id2)*31+id1);
            return 0;
        }
    }

    static class DistanceComparator implements Comparator<Node>{
        @Override public int compare(Node a, Node b){
            if(a.value<b.value) return -1;
            else if(a.value>b.value) return 1;
            else return 0;
        }
    }
}