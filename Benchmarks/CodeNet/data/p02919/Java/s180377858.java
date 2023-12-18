import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int[] a=new int[n+1];
        int[] rev=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=fsc.nextInt();
            rev[a[i]]=i;
        }
        fsc.close();
        ArrayList<Integer> saw=new ArrayList<>();
        saw.add(0);
        saw.add(rev[n]);
        saw.add(n+1);
        long ans=0;
        for(int v=n-1;v>=1;v--){
            int index=frontBS(saw, rev[v]);
            long p,q,r,s;
            if(index==0){
                r=rev[v];
                s=saw.get(index+1);
                p=0;
                q=saw.get(index+2);
                ans+=v*(r-p)*(q-s);
                //System.out.println("p,r,s,q="+p+","+r+","+s+","+q);
            }
            else if(index==saw.size()-2){
                s=rev[v];
                r=saw.get(index);
                q=n+1;
                p=saw.get(index-1);
                ans+=v*(r-p)*(q-s);
                //System.out.println("p,r,s,q="+p+","+r+","+s+","+q);
            }
            else{
                p=saw.get(index-1);
                q=saw.get(index+1);
                r=saw.get(index);
                s=rev[v];
                ans+=v*(r-p)*(q-s);
                //System.out.println("1:p,r,s,q="+p+","+r+","+s+","+q);
                p=saw.get(index);
                q=saw.get(index+2);
                r=rev[v];
                s=saw.get(index+1);
                ans+=v*(r-p)*(q-s);
                //System.out.println("2:p,r,s,q="+p+","+r+","+s+","+q);
            }
            //System.out.println("ans:"+ans+", index:"+index);
            saw.add(index+1, rev[v]);
        }
        System.out.println(ans);
    }
    public static int frontBS(ArrayList<Integer> array, int key){
        int left=-1;
        int right=array.size();
        while(right-left>1){
            int mid=left+(right-left)/2;
            if(array.get(mid)<=key) left=mid;
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