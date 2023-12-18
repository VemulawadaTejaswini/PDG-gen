import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), m=fsc.nextInt();
        HashSet<Integer> dists[]=new HashSet[n];
        HashSet<Integer> edges[]=new HashSet[n];
        HashSet<Integer> mods[]=new HashSet[n];
        for(int i=0;i<n;i++){
            dists[i]=new HashSet();
            edges[i]=new HashSet();
            mods[i]=new HashSet();
        }
        for(int j=0;j<m;j++) edges[fsc.nextInt()-1].add(fsc.nextInt()-1);
        int s=fsc.nextInt()-1, t=fsc.nextInt()-1;
        fsc.close();
        dists[s].add(0);
        mods[s].add(0);
        IntQueue q=new IntQueue(10*n);
        for(int i=0;i<n;i++){
            q.init();
            q.add(s);
            while(q.size()>0){
                int now=q.poll();
                for(int v:edges[now]){
                    boolean b=false;
                    for(int dist:dists[now]){
                        if(!mods[v].contains((dist+1)%3)){
                            mods[v].add((dist+1)%3);
                            dists[v].add(dist+1);
                            b=true;
                        }
                    }
                    if(b) q.add(v);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int dist: dists[t]) if(dist%3==0) min=Math.min(min, dist/3);
        if(min==Integer.MAX_VALUE) min=-1;
        System.out.println(min);
    }
    static class IntQueue{
        int[] a;
        private int max;
        int head=0, tail=0;
        private int size=0;
        public IntQueue(int max){
            this.max=max;
            a=new int[max];
        }
        public IntQueue(){
            this.max=Integer.MAX_VALUE;
            a=new int[max];
        }
        public void add(int x){
            a[tail++]=x;
            size++;
        }
        public int poll(){
            if(size==0) System.exit(1);
            size--;
            return a[head++];
        }
        public void init(){
            tail=0; head=0; size=0;
        }
        public int size(){
            return size;
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