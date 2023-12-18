import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();

        HashMap<Integer, Integer> roadMap = new HashMap<>();
        HashMap<Integer, Integer> railMap = new HashMap<>();

        for (int i = 0; i < k; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            int leftIndex = roadMap.computeIfAbsent(left, s -> left);
            int rightIndex = roadMap.computeIfAbsent(right, s -> right);
            int mapLeft = roadMap.computeIfAbsent(leftIndex, s -> leftIndex);
            int mapRight = roadMap.computeIfAbsent(rightIndex, s -> rightIndex);
            if (mapRight != mapLeft) {
                roadMap.put(mapLeft, right);
            }
        }
        for (int i = 0; i < l; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            int leftIndex = railMap.computeIfAbsent(left, s -> left);
            int rightIndex = railMap.computeIfAbsent(right, s -> right);
            int mapLeft = railMap.computeIfAbsent(leftIndex, s -> leftIndex);
            int mapRight = railMap.computeIfAbsent(rightIndex, s -> rightIndex);
            if (mapRight != mapLeft) {
                railMap.put(mapLeft, right);
            }
        }
        int[][] ansMap = new int[n + 1][n + 1];
        for (Integer key: roadMap.keySet()
             ) {
            ansMap[root(roadMap, key)][root(railMap, key)]++;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int ans = 0;
            if (roadMap.containsKey(i)) {
                ans += ansMap[roadMap.get(i)][railMap.get(i)];
            }
            builder.append(Math.max(1, ans)).append(" ");
        }

        System.out.println(builder.deleteCharAt(builder.length() - 1));
    }

    private static int root(HashMap<Integer, Integer> list, int x) {
        int v = list.computeIfAbsent(x, s -> x);
        if (v == x) {
            return x;
        } else {
            int t = root(list, v);
            list.put(x, t);
            return t;
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