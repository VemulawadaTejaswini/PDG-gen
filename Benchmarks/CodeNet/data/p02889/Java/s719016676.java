import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), m=fsc.nextInt();
        long l=fsc.nextLong();
        long[][] wf=new long[n][n];
        int[][] next=new int[n][n];
        final long MAX=1_000_000_000_000_000l;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) wf[i][j]=0;
                else wf[i][j]=MAX;
                next[i][j]=j;
            }
        }
        for(int i=0;i<m;i++){
            int a=fsc.nextInt()-1;
            int b=fsc.nextInt()-1;
            long c=fsc.nextLong();
            if(c>l) continue;
            wf[a][b]=Math.min(wf[a][b], c);
            wf[b][a]=Math.min(wf[b][a], c);
        }
        int q=fsc.nextInt();
        int[][] st=new int[q][2];
        for(int i=0;i<q;i++){
            for(int j=0;j<2;j++){
                st[i][j]=fsc.nextInt()-1;
            }
        }
        fsc.close();
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(wf[i][j]>wf[i][k]+wf[k][j]){
                        wf[i][j]=wf[i][k]+wf[k][j];
                        next[i][j]=next[i][k];
                    }
                }
            }
        }
        long[][] ans=new long[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(wf[i][j]>=MAX){
                    ans[i][j]=-1;
                    continue;
                }
                long gas=l;
                long stop=0;
                for(int k=i;k!=j;k=next[k][j]){
                    if(gas<wf[k][next[k][j]]){
                        stop++;
                        gas=l-wf[k][next[k][j]];
                    }
                    else gas-=wf[k][next[k][j]];
                }
                ans[i][j]=stop;
            }
        }
        for(int i=0;i<q;i++){
            System.out.println(ans[st[i][0]][st[i][1]]);
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
        int id;
        long cost;
        public Edge(int id, long cost){
            this.id=id;
            this.cost=cost;
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
