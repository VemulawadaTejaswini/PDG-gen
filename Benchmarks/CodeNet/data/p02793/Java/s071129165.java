import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long[] a=new long[n];
        BigInteger[] arr = new BigInteger[10000];
        BigInteger LCM = BigInteger.ZERO, ans = BigInteger.ZERO, MOD = BigInteger.valueOf(1000000007);
        for (int i = 0; i < n; i++) {
            a[i]=fsc.nextLong();
            arr[i] = new BigInteger(Long.toString(a[i]));
            if (i == 0) {
                LCM = arr[i];
            } else {
                LCM = lcm(LCM, arr[i]);
            }
        }
        fsc.close();
        for (int i = 0; i < n; i++) {
            //System.out.println("sum is : "+ans);
            ans = ans.add(LCM.divide(arr[i]));
            ans = ans.mod(MOD);
        }

        System.out.print(ans);
    }

    static BigInteger gcd(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }

    static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(gcd(a, b));
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
