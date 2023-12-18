import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> q=new ArrayList<>();
        for(int i=0;i<n;i++){
            p.add(fsc.nextInt());
        }
        for(int i=0;i<n;i++){
            q.add(fsc.nextInt());
        }
        fsc.close();
        ArrayList<Integer> rest1=new ArrayList<>();
        for(int i=1;i<=n;i++){
            rest1.add(i);
        }
        ArrayList<Integer> rest2=new ArrayList<>();
        for(int i=1;i<=n;i++){
            rest2.add(i);
        }
        int pnum=order(p, rest1);
        int qnum=order(q, rest2);
        System.out.println(Math.abs(qnum-pnum));
    }
    static int order(ArrayList<Integer> a, ArrayList<Integer> rest){
        if(a.isEmpty()){
            return 0;
        }
        int n=a.size();
        int p=a.get(0);
        int i=rest.indexOf(p);
        a.remove(Integer.valueOf(p));
        rest.remove(Integer.valueOf(p));
        return fact(n-1)*i+order(a, rest);
    }
    static int fact(int k){
        int ret=1;
        for(int i=2;i<=k;i++){
            ret*=i;
        }
        return ret;
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
