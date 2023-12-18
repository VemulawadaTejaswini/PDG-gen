import java.util.*;
import java.io.*;

class Main{
    static int n, q;
    static long[][] stx;
    static long[] d;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        n=fsc.nextInt(); q=fsc.nextInt();
        long[][] stx=new long[2*n][3];
        for(int i=0;i<n;i++){
            long s=fsc.nextLong(); long t=fsc.nextLong(); long x=fsc.nextLong();
            stx[i][0]=s-x; stx[i][1]=1; stx[i][2]=x;
            stx[i+n][0]=t-x; stx[i+n][1]=-1; stx[i+n][2]=x;
        }
        Arrays.sort(stx,(u,v)->u[0]>v[0]?1:u[0]<v[0]?-1:u[1]>v[1]?1:u[1]<v[1]?-1:0);
        d=new long[q];
        for(int j=0;j<q;j++) d[j]=fsc.nextLong();
        fsc.close();
        TreeSet<Long> set=new TreeSet<>();
        long[] dist=new long[q];
        for(int j=0;j<q;j++) dist[j]=-1;
        int index=0;
        for(int i=0;i<2*n;i++){
            if(stx[i][1]>0) set.add(stx[i][2]);
            else set.remove(stx[i][2]);

            while(stx[i][0]<=d[index] && (i==2*n-1 || d[index]<stx[i+1][0])){
                if(set.size()>0) dist[index]=set.first();
                index++;
                if(index>=q) break;
            }
            if(index>=q) break;
        }
        StringBuilder sb=new StringBuilder();
        for(long l:dist) sb.append(l+"\n");
        System.out.print(sb);
    }
    public static int bs(long key, boolean b){
        int left=-1;
        int right=q;
        while(right-left>1){
            int mid=left+(right-left)/2;
            if(d[mid]<key) left=mid;
            else right=mid;
        }
        return b?right:left;
    }
    public static int bsl(ArrayList<Integer> lst, int key){
        int left=-1;
        int right=lst.size();
        while(right-left>1){
            int mid=left+(right-left)/2;
            if(lst.get(mid)<key) left=mid;
            else right=mid;
        }
        return right;
    }
    public static int bsu(ArrayList<Integer> lst, int key){
        int left=-1;
        int right=lst.size();
        while(right-left>1){
            int mid=left+(right-left)/2;
            if(lst.get(mid)<=key) left=mid;
            else right=mid;
        }
        return left;
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