import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        Node[] nodes=new Node[n];
        for(int i=0;i<n;i++) nodes[i]=new Node(i);
        for(int i=0;i<n-1;i++){
            int u=fsc.nextInt()-1, v=fsc.nextInt()-1;
            long w=fsc.nextLong();
            nodes[u].edges.add(new Edge(v,w));
            nodes[v].edges.add(new Edge(u,w));
        }
        fsc.close();
        long[] dist=solve(nodes, 0);
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<n;i++) sb.append((dist[i]%2==0?"0":"1")+"\n");
        System.out.print(sb);
    }

    public static long[] solve(Node nodes[], int st){
        int length=nodes.length;
        long[] dist=new long[length];
        for(int i=0;i<length;i++) dist[i]=Long.MAX_VALUE;
        return solve(nodes, dist, 0, st, -1, -1);
    }
    public static long[] solve(Node nodes[], int st, int ed){
        int length=nodes.length;
        long[] dist=new long[length];
        for(int i=0;i<length;i++) dist[i]=Long.MAX_VALUE;
        return solve(nodes, dist, 0, st, -1, ed);
    }
    public static long[] solve(Node nodes[], long dist[], long stCost, int st, int prev, int ed){
        dist[st]=stCost;
        for(Edge e:nodes[st].edges){
            if(e.id!=prev){
                nodes[e.id].prev=nodes[st];
                dist[e.id]=dist[st]+e.cost;
                if(e.id==ed) return dist;
                dist=solve(nodes, dist, dist[e.id], e.id, st, ed);
            }
        }
        return dist;
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
        int id;
        long cost;
        public Edge(int id, long cost){
            this.id=id;
            this.cost=cost;
        }
    }
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
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
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}