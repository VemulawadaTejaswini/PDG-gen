
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * Created by jaga on 9/22/16.
 */
public class Main {
    public static void solve(PrintWriter out, FastScanner in){
        String s = in.next();
        int K = in.nextInt();
        char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a' , 0);
        map.put('b' , 25);
        map.put('c' , 24);
        map.put('d' , 23);
        map.put('e' , 22);
        map.put('f' , 21);
        map.put('g' , 20);
        map.put('h' , 19);
        map.put('i' , 18);
        map.put('j' , 17);
        map.put('k' , 16);
        map.put('l', 15);
        map.put('m' , 14);
        map.put('n' , 13);
        map.put('o' , 12);
        map.put('p' , 11);
        map.put('q' , 10);
        map.put('r' , 9);
        map.put('s' , 8);
        map.put('t' , 7);
        map.put('u' , 6);
        map.put('v' , 5);
        map.put('w' , 4);
        map.put('x' , 3);
        map.put('y' , 2);
        map.put('z' , 1);


        int count = K;
        char c = 'a';
        int dps;
        String ans = "";
        int i;
        boolean flg =false;

        //iは今見ている文字列のidx:
        for( i = 0 ;i < s.length() && count >0;i++){
            c = s.charAt(i);
            dps = map.get(c);
            if(dps > count){
                ans += c;
                flg = true;
                continue;
            }
            count -= dps;
            ans += "a";
        }
        i--;
        if(count > 0){
            ans = ans.substring(0, i);
           int idx = 0;
            while(alpha[idx] < c){
                idx++;
            }
            idx += count;
            idx %= 27;
            ans += alpha[idx];
            i++;
        }
        if(i < s.length()- 1){
            ans += s.substring(i,s.length() );
        }

        System.out.println(ans);
        //
        //aaaafeaaivap
        //aaaafeaaivap
    }

    /*以下はテンプレ*/
    public static void main(String args[]) {
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        FastScanner in = new FastScanner();
        solve(out, in);
        out.close();
    }

    public static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufferLength = 0;

        private boolean hasNextByte() {
            if (ptr < bufferLength) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufferLength = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bufferLength <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
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
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextDouble();
            }
            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][];
            for (int i = 0; i < n; i++) {
                map[i] = nextDoubleArray(m);
            }
            return map;
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) array[i] = nextInt();
            return array;
        }

        public long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++) array[i] = nextLong();
            return array;
        }

        public String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++) array[i] = next();
            return array;
        }

        public char[][] nextCharMap(int n) {
            char[][] array = new char[n][];
            for (int i = 0; i < n; i++) array[i] = next().toCharArray();
            return array;
        }

        public int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][];
            for (int i = 0; i < n; i++) {
                map[i] = nextIntArray(m);
            }
            return map;
        }
    }
}

