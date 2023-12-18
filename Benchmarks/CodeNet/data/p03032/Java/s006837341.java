import java.util.*;
import java.util.function.BiFunction;
import java.io.*;

public  class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), k=fsc.nextInt();
        long[] v=new long[n];
        for(int i=0;i<n;i++) v[i]=fsc.nextLong();
        fsc.close();
        SegmentTree sgt=new SegmentTree(v, 0, (a,b)->a+b);
        long sum=sgt.query(0, n);
        long ans=Long.MIN_VALUE;
        for(int i=Math.max(0,n-k);i<=n;i++){
            for(int ai=Math.max(1,(n+i-k+1)/2);ai<=n;ai++){
                for(int t=0;t+ai<=n;t++){
                    long segSum=sgt.query(t, t+ai);
                    PriorityQueue<Long> min=new PriorityQueue<Long>((a,b)->a<b?1:a>b?-1:0);
                    int size=0;
                    long restSum=0;
                    for(int j=0;j<n;j=((j!=t-1)?j+1:t+ai)){
                        if(t<=j&&j<t+ai) j=t+ai;
                        else if(ai+size<i){
                            if(j<0) System.out.println("t:"+t+", ai:"+ai);
                            if(v[j]<0){
                                min.add(v[j]);
                                size++;
                                restSum+=v[j];
                            }
                        }
                        else if(ai+size==i){
                            if(v[j]<0){
                                min.add(v[j]);
                                restSum+=v[j];
                                restSum-=min.poll();
                            }
                        }
                        else break;
                    }
                    //if(ai==3&&t==3&&i==4) System.out.println("ai:"+ai+", t:"+t+", r:"+restSum+", s:"+segSum);
                    ans=Math.max(sum-(segSum+restSum), ans);
                }
            }
        }
        System.out.println(ans);
    }
    static class SegmentTree{
        long[] st;
        int length;
        int level;
        
        private long id;
        private BiFunction<Long, Long, Long> pre;
        private boolean[] inited;

        public SegmentTree(long[] array, long id, BiFunction<Long, Long, Long> pre){
            this.id=id;
            this.pre=pre;
            int n=array.length;
            int l=0, r=31, m=(l+r)/2;
            while(r-l>1){
                if(n<=1l<<m) r=m;
                else l=m;
                m=l+(r-l)/2;
            }
            level=r;
            int size=1<<level;
            length=2*size-1;
            long[] ret=new long[length];
            inited=new boolean[length];
            for(int i=0;i<size;i++){
                ret[i+size-1]=i<n?array[i]:id;
                inited[i+size-1]=true;
            }
            st=ret;
            init(0);
        }
        public void update(int i, long v){
            int index=i-1+(length+1)/2;
            int parent=(index-1)/2;
            st[index]=v;
            while(index>0){
                st[parent]=pre.apply(st[parent], st[index]);
                index=parent;
                parent=(index-1)/2;
            }
        }
        private long subQuery(int a, int b, int k, int l, int r){
            if(r<=a||b<=l) return id;
            if(a<=l&&r<=b) return st[k];
            else{
                long u=subQuery(a, b, 2*k+1, l, (l+r)/2);
                long v=subQuery(a, b, 2*k+2, (l+r)/2, r);
                return pre.apply(u,v);
            }
        }
        public long query(int a, int b){
            return subQuery(a, b, 0, 0, (length+1)/2);
        }
        private long init(int i){
            if(!inited[i]){
                long ret;
                ret=pre.apply(init(2*i+1), init(2*i+2));
                inited[i]=true;
                st[i]=ret;
            }
            return st[i];
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