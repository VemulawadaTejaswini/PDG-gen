import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int N=fsc.nextInt(), k=fsc.nextInt();
        ArrayList<Integer> in=new ArrayList<>();
        for(int i=0;i<N;i++){
            long ai=fsc.nextLong();
            if(ai<k) in.add((int) ai);
        }
        fsc.close();
        int[] a=new int[in.size()];
        int n=a.length;
        for(int i=0;i<n;i++){
            a[i]=in.get(i);
        }
        boolean[][] dpf=new boolean[n][2*k];
        dpf[0][0]=true;
        dpf[0][a[0]]=true;
        for(int i=1;i<n;i++){
            for(int l=0;l<2*k;l++){
                if(dpf[i-1][l] && l+a[i]<2*k) dpf[i][l+a[i]]=true;
            }
        }
        boolean[][] dpb=new boolean[n][2*k];
        dpb[n-1][0]=true;
        dpb[n-1][a[n-1]]=true;
        for(int i=n-2;i>=0;i--){
            for(int l=0;l<2*k;l++){
                if(dpb[i+1][l] && l+a[i]<2*k) dpb[i][l+a[i]]=true;
            }
        }

        int ans=n;
        Out:for(int i=0;i<n;i++){
            In:for(int s=k-a[i];s<k;s++){
                for(int f=0;f<=s;f++){
                    if(i==0){
                        if(dpb[i+1][s]){
                            ans--;
                            continue Out;
                        }
                        continue In;
                    }
                    else if(i==n-1){
                        if(dpf[i-1][s]){
                            ans--;
                            continue Out;
                        }
                        continue In;
                    }
                    else if(dpf[i-1][f] && dpb[i+1][s-f]){
                        ans--;
                        continue Out;
                    }
                }
            }
        }
        System.out.println(ans);
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
