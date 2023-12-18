import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int h=fsc.nextInt();
        int w=fsc.nextInt();
        char[][] s=new char[h][w];
        int[][] wf=new int[h*w][h*w];
        int max=100000;
        for(int i=0;i<h;i++){
            s[i]=fsc.next().toCharArray();
        }
        for(int i=0;i<h*w;i++){
            for(int j=0;j<h*w;j++){
                if(i!=j){
                    wf[i][j]=max;
                } else{
                    wf[i][j]=0;
                }
            }
        }
        fsc.close();
        int[] dy={0, -1, 0, 1};
        int[] dx={-1, 0, 1, 0};
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(s[i][j]=='.'){
                    for(int d=0;d<4;d++){
                        int y=dy[d];
                        int x=dx[d];
                        if(0<=i+y && i+y<h && 0<=j+x && j+x<w && s[i+y][j+x]=='.'){
                            wf[i*w+j][(i+y)*w+(j+x)]=1;
                            wf[(i+y)*w+(j+x)][i*w+j]=1;
                        }
                    }
                }
            }
        }
        int n=h*w;
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(wf[i][k]+wf[k][j]<wf[i][j]){
                        wf[i][j]=wf[i][k]+wf[k][j];
                    }
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(wf[i][j]<max && wf[i][j]>ans){
                    ans=wf[i][j];
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
