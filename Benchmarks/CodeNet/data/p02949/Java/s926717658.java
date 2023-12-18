import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), m=fsc.nextInt(), p=fsc.nextInt();
        Node[] nodes=new Node[n];
        for(int i=0;i<n;i++) nodes[i]=new Node();
        for(int j=0;j<m;j++){
            int a=fsc.nextInt()-1, b=fsc.nextInt()-1, c=fsc.nextInt();
            c-=p;
            c*=-1;
            nodes[a].edges.add(new Edge(b, c));
        }
        fsc.close();
        long ans=bellmanFord(nodes, 0, n-1);
        if(ans==Long.MIN_VALUE) System.out.println(-1);
        else if(ans>0) System.out.println(0);
        else System.out.println(-ans);
    }
    public static long[] bellmanFord(Node[] nodes, int st){
        nodes[st].value=0;
        int b;
        long c;
        int size=nodes.length;
        Node fr,to;
        boolean negativeLoop[]=new boolean[size];
        long distance[]=new long[size];
        for(int i=0;i<size;i++) distance[i]=Long.MAX_VALUE;
        distance[st]=0;
        for(int i=0;i<size;i++){
            negativeLoop[i]=false;
            for(int j=0;j<size;j++){
                for(Edge edge:nodes[j].edges){
                    if(nodes[j].value==Long.MAX_VALUE) continue;
                    b=edge.id;
                    c=edge.cost;
                    fr=nodes[j];
                    to=nodes[b];
                    if(to.value>fr.value+c){
                        to.value=fr.value+c;
                        distance[b]=to.value;
                    }
                }
            }
        }           
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                for(Edge edge:nodes[j].edges){
                    if(nodes[j].value==Long.MAX_VALUE) continue;
                    b=edge.id;
                    c=edge.cost;
                    fr=nodes[j];
                    to=nodes[b];
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
    public static long bellmanFord(Node nodes[], int st, int ed){
        return bellmanFord(nodes, st)[ed];
    }
    static class Node{
        long value;
        Node prev;
        ArrayList<Edge> edges;
        public Node(){
            this.value=Long.MAX_VALUE;
            edges=new ArrayList<Edge>();
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