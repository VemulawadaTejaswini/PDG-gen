import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        if(n==2){
            System.out.println(-1);
            return;
        }
        int[] ng=new int[n+1];
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=1;i<=n;i++){
            ng[i]=fsc.nextInt();
            set.add(i);
        }
        fsc.close();
        int[] ans=new int[n];
        int ngl=0;
        if(n>4){
            ans[0]=set.pollFirst();
            for(int i=1;i<n-4;i++){
                int f=set.pollFirst();
                if(f!=ng[ans[i-1]]){
                    ans[i]=f;
                } else{
                    ans[i]=set.pollFirst();
                    set.add(f);
                }
            }
            ngl=ng[ans[n-5]];
        }
        int size=set.size();
        int[] rest=new int[size];
        for(int r=0;r<size;r++){
            rest[r]=set.pollFirst();
        }
        W:while(true){
            for(int i=0;i<size;i++){
                if((i>0?ng[rest[i-1]]:ngl)==rest[i]){
                    if(Objects.isNull(nextPermutation(rest))){
                        System.out.println(-1);
                        return;
                    }
                    continue W;
                }
            }
            for(int i=0;i<size;i++){
                ans[n-size+i]=rest[i];
            }
            break;
        }
        for(int a:ans){
            System.out.print(a+" ");
        }
        System.out.print("\n");
    }

    static int[] nextPermutation(int[] a){
        int n=a.length;
        for(int i=n-1;i>=1;i--){
            if(a[i]>a[i-1]){
                int fail=n, pass=i;
                while(fail-pass>1){
                    int mid=pass+(fail-pass)/2;
                    if(a[mid]>a[i-1]) pass=mid;
                    else fail=mid;
                }
                int tmp=a[pass];
                a[pass]=a[i-1];
                a[i-1]=tmp;
                reverse(a, i, n);
                return a;
            }
        }
        return null;
    }

    static void reverse(int[] a, int begin, int end){
        for(int i=begin;i<begin+(end-begin)/2;i++){
            int tmp=a[i];
            a[i]=a[begin+end-i-1];
            a[begin+end-i-1]=tmp;
        }
    }
    static void reverse(int[] a){
        reverse(a, 0, a.length);
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
