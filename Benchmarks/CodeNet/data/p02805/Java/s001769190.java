import java.util.*;
import java.io.*;

class ABC151F{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int[][] xy=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                xy[i][j]=fsc.nextInt();
            }
        }
        fsc.close();
        double max=0;
        int d1=-1, d2=-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                double d=(xy[i][0]-xy[j][0])*(xy[i][0]-xy[j][0])+(xy[i][1]-xy[j][1])*(xy[i][1]-xy[j][1]);
                if(d>max){
                    max=d;
                    d1=i;
                    d2=j;
                }
            }
        }
        double cx=(double)(xy[d1][0]+xy[d2][0])/2.;
        double cy=(double)(xy[d1][1]+xy[d2][1])/2.;
        double a=(double)(xy[d1][0]-xy[d2][0]);
        double b=(double)(xy[d1][1]-xy[d2][1]);
        // System.out.println("ab");
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println("d1d2");
        // System.out.println(d1);
        // System.out.println(d2);
        // System.out.println("cxcy");
        // System.out.println(cx+", "+cy);

        double pass=0;
        double delta=0.0000004;
        for(int l=1;l<=3000000;l++){
            if(isOK(pass, xy, cx, cy, a, b, max)) pass-=delta;
            else pass+=delta;
        }
        //System.out.println("pass");
        //System.out.println(pass);
        double ans=Math.sqrt(max+4.*pass*pass)/2.;
        //System.out.println("ans");
        System.out.println(ans);
    }
    static boolean isOK(double r, int[][] xy, double cx, double cy, double a, double b, double max){
        double[] dx={1., -1.};
        double[] dy={-1., 1.};
        for(int i=0;i<2;i++){
            double x=cx+dx[i]*(b*r/Math.sqrt(a*a+b*b));
            double y=cy+dy[i]*(a*r/Math.sqrt(a*a+b*b));
            for(int j=0;j<xy.length;j++){
                double delx=x-xy[j][0];
                double dely=y-xy[j][1];
                if(delx*delx+dely*dely>max/4.+r*r){
                    if(i==0){
                        continue;
                    } else{
                        return false;
                    }
                }
            }
        }
        return true;
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
