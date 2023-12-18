import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> tree;
    static boolean[] use;
    static int[] color;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        tree = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        use = new boolean[n];
        color = new int[n];
        
        color[0] = 1;
        use[0] = true;
        dfs(0, 2);

        int mn1 = 0;
        int mn2 = 0;
        for (int i = 0; i < n; i++) {
            if(color[i] == 1) mn1++;
            else mn2++;
        }

        if(mn1 < mn2){
            for (int i = 0; i < n; i++) {
                if(color[i] == 1){
                    color[i] = 2;
                }else{
                    color[i] = 1;
                }
            }
            int tmp = mn1;
            mn1 = mn2;
            mn2 = tmp;
        }

        int[] ans = new int[n];

        int n1 = n / 3;
        if( n % 3 != 0) n1++;
        int n2 = n / 3;
        if(n % 3 == 2) n2++;
        int n3 = n / 3;
        int n1c = 0, n2c = 0, n3c = 1;

        if(mn2 <= n3){
            for (int i = 0; i < n; i++) {
                if(color[i] == 1){
                    if(n1c < n1){
                        ans[i] = n1c;
                        n1c++;
                    }else if( n2c < n2){
                        ans[i] = n2c * 3 + 2;
                        n2c++;
                    }else{
                        ans[i] = n3c * 3;
                        n3c++;
                    }
                }else{
                    ans[i] = n3c * 3;
                    n3c++;
                }
            }
        }else{
            for (int i = 0; i < n; i++) {
                if(color[i] == 1){
                    if(n1c < n1){
                        ans[i] = n1c * 3 + 1;
                        n1c++;
                    }else{
                        ans[i] = n3c * 3;
                        n3c++;
                    }
                }else{
                    if(n2c < n2){
                        ans[i] = n2c * 3 + 2;
                        n2c++;
                    }else{
                        ans[i] = n3c * 3;
                        n3c++;
                    }
                }
                if(n3c > n3 + 1){
                    System.out.println(-1);
                    return;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static void dfs(int pos, int c){
        int nextc = c == 1 ? 2 : 1;
        for (int next : tree.get(pos)) {
            if(use[next]) continue;
            color[next] = c;
            use[next] = true;
            dfs(next, nextc);
        }
    }



    private static class FastScanner {
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
    }
}
