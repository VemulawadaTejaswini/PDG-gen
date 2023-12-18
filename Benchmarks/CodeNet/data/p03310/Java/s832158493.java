import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long[] ac=new long[n];
        for(int i=0;i<n;i++) ac[i]=fsc.nextLong()+(i>0?ac[i-1]:0);
        fsc.close();
        long sum=ac[n-1];
        long pass,fail;
        pass=0; fail=sum/4+1;
        while(fail-pass>1){
            long mid=pass+(fail-pass)/2;
            if(isOK(ac, mid)) pass=mid;
            else fail=mid;
        }
        long min=pass;
        fail=sum/4-1; pass=sum;
        while(pass-fail>1){
            long mid=fail+(pass-fail)/2;
            if(isOK2(ac, mid)) pass=mid;
            else fail=mid;
        }
        long max=pass;
        System.out.println(max-min);
        //System.out.println(min);
        // for(int i=1;i<=20;i++){
        //     System.out.println("i="+i+" isOK?:"+isOK2(ac, i));
        // }
    }
    static boolean isOK(long[] ac, long m){
        int[] cut=new int[3];
        int fail=-1;
        int pass=ac.length;
        for(int i=0;i<3;i++){
            while(pass-fail>1){
                int mid=fail+(pass-fail)/2;
                if(ac[mid]-(i>0?ac[cut[i-1]]:0)>=m) pass=mid;
                else fail=mid;
            }
            cut[i]=pass;
            if(cut[i]==ac.length) return false;
            fail=pass;
            pass=ac.length;
        }
        if(ac[ac.length-1]-ac[cut[2]]>=m) return true;
        return false;
    }
    static boolean isOK2(long[] ac, long m){
        int[] cut=new int[3];
        int pass=-1;
        int fail=ac.length;
        for(int i=0;i<3;i++){
            while(fail-pass>1){
                int mid=pass+(fail-pass)/2;
                if(ac[mid]-(i>0?ac[cut[i-1]]:0)<=m) pass=mid;
                else fail=mid;
            }
            cut[i]=pass;
            if(cut[i]==-1) return false;
            if(i>0 && cut[i]!=ac.length-1 && cut[i]==cut[i-1]) return false;
            fail=ac.length;
        }
        if(ac[ac.length-1]-ac[cut[2]]<=m) return true;
        return false;
    }
    static class FastScanner {
        private final InputStream in =System.in;
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
