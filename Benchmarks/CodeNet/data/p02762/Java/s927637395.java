import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] follow = new int[n];
        for (int i = 0; i < n; i++) {
            follow[i] = i;
        }
        boolean[][] block = new boolean[n][n];

        // 友達リスト
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            union(follow, a, b);
            block[a][b] = true;
            block[b][a] = true;
        }

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            block[a][b] = true;
            block[b][a] = true;
        }

        int[] ansL = new int[n];

        // 始点
        for (int i = 0; i < n; i++) {
            int v = find(follow, i);
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (v == find(follow, j) && !block[i][j]) {
                    ansL[i]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ansL[i] + " ");
        }
    }

    //return root node idx O(a(N)) ( O(1)<O(a(N))<O(logN) )
    public static int find(int[] tree,int idx) {
        if(tree[idx]==idx) return idx;
        else return tree[idx] = find(tree,tree[idx]);
    }

    //union idx2 tree to idx1 tree O(a(N))
    public static void union(int[] tree,int idx1,int idx2) {
        int root1 = find(tree,idx1);
        int root2 = find(tree,idx2);
        tree[root2] = root1;
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
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
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
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
    }
}