import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long[][] xy=new long[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                xy[i][j]=fsc.nextLong();
            }
            xy[i][2]=i;
        }
        fsc.close();
        Arrays.sort(xy, (u,v)->u[0]>v[0]?1:u[0]<v[0]?-1:0);
        PriorityQueue<Edge> pq=new PriorityQueue<>(2*(n-1), (u, v)->u.cost>v.cost?1:u.cost<v.cost?-1:0);
        for(int i=0;i<n-1;i++){
            pq.add(new Edge((int) xy[i][2], (int) xy[i+1][2], xy[i+1][0]-xy[i][0]));
        }
        Arrays.sort(xy, (u,v)->u[1]>v[1]?1:u[1]<v[1]?-1:0);
        for(int i=0;i<n-1;i++){
            pq.add(new Edge((int) xy[i][2], (int) xy[i+1][2], xy[i+1][1]-xy[i][1]));
        }
        long ans=kruskal(n, pq);
        System.out.println(ans);
    }

    public static long kruskal(int n, PriorityQueue<Edge> pq){
        UnionFindTree uft=new UnionFindTree(n);
        long ret=0;
        int index=0;
        while(pq.size()>0 && index<n){
            Edge e=pq.poll();
            if(uft.unite(e.u, e.v)){
                ret+=e.cost;
                index++;
            }
        }
        return ret;
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

    static class UnionFindTree{
        private int[] parent, rank;
        UnionFindTree(int n){
            parent=new int[n];
            rank=new int[n];
            for(int i=0;i<n;i++) parent[i]=i;
        }
        int root(int x){
            if(parent[x]==x) return x;
            parent[x]=root(parent[x]);
            return parent[x];
        }
        boolean unite(int x, int y){
            int xr=root(x);
            int yr=root(y);
            if(xr==yr) return false;
            if(rank[xr]<rank[yr]) parent[xr]=yr;
            else{
                parent[yr]=xr;
                if(rank[xr]==rank[yr]) rank[xr]++;
            }
            return true;
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
