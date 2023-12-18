import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int k=fsc.nextInt();
        long x[]=new long[n];
        long y[]=new long[n];
        //long summary[][]=new long[n][3];
        ArrayList<Integer> v=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            x[i]=fsc.nextLong();
            y[i]=fsc.nextLong();
            v.add(i);
        }
        fsc.close();
        long ans=Long.MAX_VALUE;
        long[] xy=new long[4];
        for(int i=0;i<n;i++){
            xy[0]=x[i];
            xy[1]=x[i];
            xy[2]=y[i];
            xy[3]=y[i];
            v.remove(Integer.valueOf(i));
            ans=Math.min(ans, solve(v, xy, x, y, 1, k));
        }
        System.out.println(ans);
    }

    public static long solve(ArrayList<Integer> v, long[] xy, long[] x, long[] y, int points, int k){
        int cand, add=-1;
        long xmax, xmin, ymax, ymin ,best=Long.MAX_VALUE, area;
        for(int i=0;i<v.size();i++){
            cand=v.remove(0);
            xmax=Math.max(xy[0], x[add]);
            xmin=Math.min(xy[1], x[add]);
            ymax=Math.max(xy[2], y[add]);
            ymin=Math.min(xy[3], y[add]);
            area=(xmax-xmin)*(ymax-ymin);
            if(area<best){
                add=cand;
                best=area;
            }
            v.add(cand);
        }
        xy[0]=Math.max(xy[0], x[add]);
        xy[1]=Math.min(xy[1], x[add]);
        xy[2]=Math.max(xy[2], y[add]);
        xy[3]=Math.min(xy[3], y[add]);
        v.remove(Integer.valueOf(add));
        points++;
        if(points==k) return best;
        return solve(v, xy, x, y, points, k);
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