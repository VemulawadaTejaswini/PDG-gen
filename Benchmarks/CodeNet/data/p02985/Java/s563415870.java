import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] e = new int[n-1][2];

        Tree tree = new Tree(n);

        for(int i=0; i<n-1; i++){
            e[i][0] = sc.nextInt() - 1;
            e[i][1] = sc.nextInt() - 1;
            tree.connect(e[i][0], e[i][1]);
        }

        final long DIV = 1000000007;
        long ans = 1;
        int index = 0;
        while(true){
            int[] ret = tree.remove(index);
            if(ret[0] == 0){
                ans *= k;
                ans %= DIV;
                break;
            }else if(ret[0] > 0){
                if(ret[0] >= k){
                    System.out.println(0);
                    return;
                }else{
                    ans *= k - ret[0];
                    ans %= DIV;
                }
                index = ret[1] - 1;
            }

            index++;
            index %= n;
        }

        System.out.println(ans);
        
        
    }

    class Tree{
        Edge[] t;
        boolean[] v;
        public Tree(int size){
            t = new Edge[size];
            v = new boolean[size];
            for(int i=0; i<size; i++){
                t[i] = new Edge(i);
            }
            Arrays.fill(v, true);
        }

        public void connect(int i, int j){
            t[i].con(j);
            t[j].con(i);
        }

        public int[] remove(int i){
            int[] ret = new int[2];
            if(v[i] == false){
                ret[0] = -1;
                return ret;
            }
            if(t[i].getSize() == 0){
                ret[0] = 0;
                return ret;
            }else if(t[i].getSize() != 1){
                ret[0] = -1;
                return ret;
            }else{
                int next = t[i].getNext0();
                ret[0] = t[next].getSize();
                ret[1] = next;
                v[i] = false;
                t[next].remove(i);
                return ret;
            }
        }
    }


    private class Edge{
        int id;
        ArrayList<Integer> next;

        public Edge(int id){
            this.id = id;
            next = new ArrayList<Integer>();
        }

        public void con(int next){
            this.next.add(next);
        }

        public int getSize(){
            return next.size();
        }

        public void remove(Integer i){
            next.remove(i);
        }

        public int getNext0(){
            return next.get(0);
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
            } else {
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

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
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

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
