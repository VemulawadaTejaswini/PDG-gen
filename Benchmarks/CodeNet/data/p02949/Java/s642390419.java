import java.io.*;
import java.util.*;


class Next{
    int id;
    int score;
    public Next(int id, int score){
        this.id = id;
        this.score = score;
    }
}

public class Main {
    
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[][] e =new int[m][3];
        int[] d = new int[n];
        
        ArrayList<Next>[] next = new ArrayList[n];
        for(int i=0; i<n; i++) next[i] = new ArrayList<Next>();
        for(int i=0; i<m; i++){
            e[i][0] = sc.nextInt() - 1;
            e[i][1] = sc.nextInt() - 1;
            e[i][2] = (sc.nextInt() - p);
            next[e[i][0]].add(new Next(e[i][1], e[i][2]));
        }

        boolean[][] ra = new boolean[n][n];

        for(int i=0; i<n; i++){
            boolean[] use = new boolean[n];
            use[i] = true;
            Queue<Integer> que = new ArrayDeque<Integer>();
            que.add(i);
            while(!que.isEmpty()){
                int cur = que.poll();
                for (Next mmnext : next[cur]) {
                    int mnext = mmnext.id;
                    ra[i][mnext] = true;
                    if(!use[mnext]){
                        que.add(mnext);
                        use[mnext] = true;
                    }
                }
            }
        }

        if(!ra[0][n-1]){
            System.out.println(-1);
            return;
        }

        ArrayList<Integer> mloop = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            if(ra[i][i] && ra[0][i] && ra[i][n-1]) mloop.add(i);
        }

        out: for(int i: mloop){
            int count = 0;
            int[] ss = new int[n];
            Arrays.fill(ss, Integer.MIN_VALUE);
            ss[i] = 0;
            Queue<Integer> que = new ArrayDeque<Integer>();
            que.add(i);
            while(!que.isEmpty()){
                int cur = que.poll();
                for(Next mmnext : next[cur]){
                    int mnext = mmnext.id;
                    int mscore = mmnext.score;
                    if(ss[cur] + mscore > ss[mnext]){
                        ss[mnext] = ss[cur]+mscore;
                        que.add(mnext);
                        if(mnext == i){
                            System.out.println(-1);
                            return;
                        }
                        count++;
                    }
                }
                if(count > 40000) continue out;
            }   
        }

        int[] ss = new int[n];
        Arrays.fill(ss, Integer.MIN_VALUE);
        ss[0] = 0;
        Queue<Integer> que = new ArrayDeque<Integer>();
        que.add(0);
        while(!que.isEmpty()){
            int cur = que.poll();
            for(Next mmnext : next[cur]){
                int mnext = mmnext.id;
                int mscore = mmnext.score;
                if(ss[cur] + mscore > ss[mnext] && ra[mnext][n-1]){
                    ss[mnext] = ss[cur]+mscore;
                    que.add(mnext);
                }
            }
        }  

        System.out.println(Math.max(ss[n-1], 0));

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
