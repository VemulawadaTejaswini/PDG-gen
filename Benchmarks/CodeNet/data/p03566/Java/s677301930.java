import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int t[]=new int[n];
        int v[]=new int[n];
        int tsum[]=new int[n];
        for(int i=0;i<n;i++){
            t[i]=fsc.nextInt();
            if(i>=1) tsum[i]=tsum[i-1]+t[i];
            else tsum[i]=t[i];
        }
        for(int i=0;i<n;i++) v[i]=fsc.nextInt();
        fsc.close();
        int speed[]=new int[tsum[n-1]+1];
        speed[0]=0;
        speed[tsum[n-1]]=0;
        int range=0;
        double distance=0;
        for(int time=1;time<tsum[n-1];time++){
            for(int i=0;i<n;i++){
                if(i==0) speed[time]=time;
                else{
                    if(time<tsum[i-1]) speed[time]=Math.min(speed[time], v[i]+tsum[i-1]-time);
                    else if(time>tsum[i]) speed[time]=Math.min(speed[time], v[i]+time-tsum[i]);
                    else speed[time]=Math.min(speed[time], speed[time-1]+1);
                }
                if(i==n-1) speed[time]=Math.min(speed[time], tsum[n-1]-time);
            }
            speed[time]=Math.min(v[range], speed[time]);
            if(speed[time]==speed[time-1]&&speed[time]!=v[range]) distance+=0.25;
            if(time==tsum[range]){
                range++;
                speed[time]=Math.min(v[range], speed[time]);
            }
            distance+=((double) speed[time]+ (double) speed[time-1])/2.;
        }
        distance+=((double) speed[tsum[n-1]]+(double) speed[tsum[n-1]-1])/2.;
        if(speed[tsum[n-1]]==speed[tsum[n-1]-1]&&speed[tsum[n-1]]!=v[n-1]) distance+=0.25;
        System.out.println(distance);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
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
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
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