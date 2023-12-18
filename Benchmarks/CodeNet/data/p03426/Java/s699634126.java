import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int h=fsc.nextInt(), w=fsc.nextInt(), d=fsc.nextInt();
        int len=(int) Math.ceil((double)h*(double)w/(double)d);
        int[][][] group=new int[d][len][2];
        int aij, modD, div;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                aij=fsc.nextInt()-1;
                modD=aij%d;
                div=aij/d;
                group[modD][div][0]=i;
                group[modD][div][1]=j;
            }
        }
        int[][] accumPower=new int[d][len];
        int dist;
        for(int divGroup=0;divGroup<d;divGroup++){
            for(int q=0;q<len;q++){
                if(q*d+divGroup<h*w){
                    if(q==0) accumPower[divGroup][q]=0;
                    else{
                        dist=Math.abs(group[divGroup][q][0]-group[divGroup][q-1][0])+Math.abs(group[divGroup][q][1]-group[divGroup][q-1][1]);
                        accumPower[divGroup][q]=accumPower[divGroup][q-1]+dist;
                    }
                }
            }
        }
        int q=fsc.nextInt();
        int l,r,g,quoL,quoR;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<q;i++){
            l=fsc.nextInt()-1;
            r=fsc.nextInt()-1;
            g=l%d;
            quoL=l/d;
            quoR=r/d;
            if(quoL>=1) sb.append((accumPower[g][quoR]-accumPower[g][quoL])+"\n");
            else sb.append(accumPower[g][quoR]+"\n");
        }
        fsc.close();
        System.out.print(sb);
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