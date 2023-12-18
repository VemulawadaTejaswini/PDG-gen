import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int k=fsc.nextInt();
        long x[]=new long[n];
        long y[]=new long[n];
        long summary[][]=new long[n][3];
        for(int i=0;i<n;i++){
            x[i]=fsc.nextInt();
            y[i]=fsc.nextInt();
        }
        fsc.close();
        long cx,cy;
        long ans=Long.MAX_VALUE;
        long xmax=Long.MIN_VALUE;
        long ymax=Long.MIN_VALUE;
        long xmin=Long.MAX_VALUE;
        long ymin=Long.MAX_VALUE;

        for(int i=0;i<n;i++){
            cx=x[i];
            cy=y[i];
            for(int j=0;j<n;j++){
                summary[j][0]=x[j];
                summary[j][1]=y[j];
                summary[j][2]=Math.abs((x[j]-cx)*(y[j]-cy));
            }          
            Arrays.sort(summary,new MyComparator());
            for(int l=0;l<k;l++){
                xmax=Math.max(xmax,summary[l][0]);
                xmin=Math.min(xmin,summary[l][0]);  
                ymax=Math.max(ymax,summary[l][1]);
                ymin=Math.min(ymin,summary[l][1]); 
            }
            ans=Math.min(ans, (xmax-xmin)*(ymax-ymin));
            xmax=Long.MIN_VALUE;
            ymax=Long.MIN_VALUE;
            xmin=Long.MAX_VALUE;
            ymin=Long.MAX_VALUE;
        }
        System.out.println(ans);
    }

    static class MyComparator implements Comparator<long[]>{
        @Override public int compare(long[] l1, long[] l2){
            if(l1[2]>l2[2]) return 1;
            else if(l1[2]<l2[2]) return -1;
            else return 0;
        }
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