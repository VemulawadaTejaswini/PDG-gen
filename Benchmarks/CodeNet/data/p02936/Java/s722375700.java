import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), q=fsc.nextInt();
        Node[] nodes=new Node[n];
        for(int i=0;i<n;i++) nodes[i]=new Node(i);
        for(int i=0;i<n-1;i++){
            int a=fsc.nextInt()-1, b=fsc.nextInt()-1;
            nodes[a].edges.add(b);
            nodes[b].edges.add(a);
        }
        for(int i=0;i<q;i++) nodes[fsc.nextInt()-1].c+=fsc.nextInt();
        fsc.close();
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.addLast(0);
        while(dq.size()>0){
            int k=dq.removeFirst();
            for(int el:nodes[k].edges){
                if(el==nodes[k].p) continue;
                nodes[el].p=k;
                nodes[el].c+=nodes[k].c;
                dq.addLast(el);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Node node:nodes) sb.append(node.c+" ");
        System.out.println(sb);
    }
    static class Node{
        int id;
        int p;
        long c;
        ArrayList<Integer> edges;
        public Node(int id){
            this.p=-1;
            this.id=id;
            this.c=0;
            edges=new ArrayList<>();
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