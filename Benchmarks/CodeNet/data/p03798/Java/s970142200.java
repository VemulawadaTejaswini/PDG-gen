import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        char[] c=fsc.next().toCharArray();
        fsc.close();
        for(int i=-1;i<=1;i+=2){
            for(int j=-1;j<=1;j+=2){
                int[] animal=new int[n];
                animal[0]=j;
                animal[n-1]=i;
                for(int k=0;k<n-2;k++){
                    if(c[k]=='o'){
                        animal[(k+1)%n]=animal[(k+n-1)%n]*animal[k];
                    }
                    else{
                        animal[(k+1)%n]=-animal[(k+n-1)%n]*animal[k];
                    }
                }
                if(c[n-2]=='o'){
                    if(animal[n-1]!=animal[(2*n-3)%n]*animal[n-2]){
                        continue;
                    }
                }
                else{
                    if(animal[n-1]!=-animal[(2*n-3)%n]*animal[n-2]){
                        continue;
                    }
                }
                if(c[n-1]=='o'){
                    if(animal[0]!=animal[n-2]*animal[n-1]){
                        continue;
                    }
                }
                else{
                    if(animal[0]!=-animal[n-2]*animal[n-1]){
                        continue;
                    }
                }
                StringBuilder sb=new StringBuilder();
                for(int k=0;k<n;k++){
                    if(animal[k]==1) sb.append('S');
                    else sb.append('W');
                }
                System.out.println(sb);
                return;
            }
        }
        System.out.println(-1);
        return;
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
