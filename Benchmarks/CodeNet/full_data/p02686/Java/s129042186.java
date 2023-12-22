    import java.util.*;
    import java.io.*;
    import java.math.*;
     
    public class Main {
        static PrintWriter out = new PrintWriter(System.out);
        static Reader in = new Reader();
        public static void main(String[] args) throws IOException {
            Main solver = new Main();
            solver.solve();
            out.flush();
            out.close();
     
        }
     
        static int INF = (int)1e9;
        static int maxn = (int)1e5+5;
        static int mod  = 998244353;
        static int n,m,q,k,t;
        
        void solve() throws IOException{
            n = in.nextInt();
            
            String[] s = new String[n];
            for (int i = 0; i < n; i++) s[i] = in.next();
            
            ArrayList<Node> arr = new ArrayList<Node>();
            int[] a = new int[n], b = new int[n];
            int left=0, cnt = 0, cur = 0;
            for (int i = 0; i < n; i++) {
                left = 0; cnt = 0; cur = 0;
                
                for (int j = 0; j < s[i].length(); j++) {
                    if (s[i].charAt(j) == '(') {
                        cur++;
                    } else {
                        if (cur != 0) {
                            cur--;
                        } else {
                            left++;
                        }
                    }
                }
                a[i] = cur;
                b[i] = left;
                arr.add(new Node(a[i], b[i]));
            }
            Collections.sort(arr);
            
            cur = 0;
            int l = -1, r = -1, lval = -1, rval = -1;
            for (int i = 0; i < n; i++) {
                if (arr.get(i).x == 0) {
                    if (rval < arr.get(i).y) {
                        rval = arr.get(i).y;
                        r = i;
                    }
                }
                if (arr.get(i).y == 0) {
                    if (lval < arr.get(i).x) {
                        lval = arr.get(i).x;
                        l = i;
                    } else if (lval == arr.get(i).x && l == -1) {
                        lval = arr.get(i).x;
                        l = i;
                    }
                }
            }
            if(l == -1 || r == -1) {
                out.println("No");
                return;
            }
            
            int end = arr.get(r).y;
            cur += arr.get(l).x;
            arr.get(r).y = -1;
            arr.get(l).y = -1;
            for (int i = 0; i < n ; i++) {
                if (i == l || i == r) continue;
                if (arr.get(i).val >= 0) {
                    if (arr.get(i).y > cur) {
                        out.println("No");
                        return;
                    } else {
                        cur += arr.get(i).val;
                        arr.get(i).y = -1;
                    }
                }
                arr.get(i).x = arr.get(i).y;
            }
            Collections.sort(arr);
            for (int i = 0; i < n; i++) {
                if (arr.get(i).y == -1) continue;
                if (cur < arr.get(i).x) {
                    out.println("No");
                    return;
                }
                cur += arr.get(i).val;
            }
            
            if (cur == end) out.println("Yes");
            else out.println("No");
            
        }
        
        //<>
        
        static class Node implements Comparable<Node>{
            int x, y, val;
            Node (int x, int y) {
                this.x = x;
                this.y = y;
                this.val = x-y;
            }
            
            public int compareTo(Node o) {
                if (this.y != o.y) return this.y - o.y;
                return o.val - this.val;
            }
        }
        
        static class Reader {
     
        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
     
        public Reader() {
            this(System.in);
        }
     
        public Reader(InputStream is) {
            mIs = is;
        }
     
        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
     
        }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }
     
        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }
     
        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
     
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
     
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
     
        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
     
        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
     
        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
     
        }
    }