import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<Node> nodes=new ArrayList<Node>();
        FastScanner fsc=new FastScanner();
        //Scanner sc=new Scanner(System.in);
        //int n=Integer.parseInt(sc.next());
        int n=fsc.nextInt();
        int a,b;
        long c;
        for(int i=0;i<n;i++) nodes.add(new Node(i));
        for(int i=0;i<n-1;i++){
            //a=Integer.parseInt(sc.next())-1;
            //b=Integer.parseInt(sc.next())-1;
            //c=Long.parseLong(sc.next());
            a=fsc.nextInt()-1;
            b=fsc.nextInt()-1;
            c=fsc.nextLong();
            nodes.get(a).edges.add(new Edge(b,c));
            nodes.get(b).edges.add(new Edge(a,c));
        }
        // int q=Integer.parseInt(sc.next());
        // int k=Integer.parseInt(sc.next())-1;
        int q=fsc.nextInt();
        int k=fsc.nextInt()-1;
        long afterK[]=Dijkstra.dijkstra(nodes, k);
        for(Node node:nodes) node.reset();
        int x,y;
        StringBuilder sb=new StringBuilder("");
        for(int j=0;j<q;j++){
            // x=Integer.parseInt(sc.next())-1;
            // y=Integer.parseInt(sc.next())-1;
            x=fsc.nextInt()-1;
            y=fsc.nextInt()-1;
            sb.append(Dijkstra.dijkstra(nodes, x)[k]+afterK[y]+"\n");
            for(Node node:nodes) node.reset();
        }
        //sc.close();
        System.out.print(sb);
    }
    static class Dijkstra{
        public static long[] dijkstra(ArrayList<Node> nodes, int st){
            return dijkstra(nodes, st, -1);
        }   
        public static long[] dijkstra(ArrayList<Node> nodes, int st, int ed){
            long[] res=new long[nodes.size()];
            Node stNode=nodes.get(st);
            PriorityQueue<Node> pq=new PriorityQueue<Node>(new DistanceComparator());
            for(Node n:nodes){
                pq.add(n);
                res[n.id]=Long.MAX_VALUE;
            }
            pq.remove(stNode);
            stNode.value=0;
            res[st]=0;
            pq.add(stNode);
            Node seeing, next;
            long newValue;
            while(pq.size()>0){
                seeing=pq.poll();           
                if(seeing.value==Long.MAX_VALUE) return res;
                if(seeing.id==ed) return res;               
                for(Edge e:seeing.edges){
                    newValue=seeing.value+e.cost;
                    next=nodes.get(e.id);
                    if(newValue<next.value){
                        res[e.id]=newValue;
                        if(pq.remove(next)){
                            next.value=newValue;
                            next.prev=seeing;
                            pq.add(next);
                        }
                    }
                }
            }
            return res;
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
        public void reset(){
            this.value=Long.MAX_VALUE;
            this.prev=null;
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
        int id;;
        long cost;
        public Edge(int id, long cost){
            this.id=id;
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

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
    }
}