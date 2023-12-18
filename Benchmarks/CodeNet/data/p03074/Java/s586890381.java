import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Closeable;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            String S = in.next();
            List<Integer> nums = new ArrayList<>();
            int now = 1;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == (char) ('0' + now)) cnt++;
                else {
                    nums.add(cnt);
                    now = 1 - now;
                    cnt = 1; // Flipした時点で1つカウントできる
                }
            }
            if (cnt != 0) nums.add(cnt);
            if (nums.size() % 2 == 0) nums.add(0); // 末尾が1の数を表すようにする

            // numsのサイズはNとは限らない
            int[] sums = new int[nums.size() + 1]; // 累積和
            for (int i = 0; i < nums.size(); i++) {
                sums[i + 1] = sums[i] + nums.get(i);
            }

            int ans = 0;
            int add = 2 * K + 1; // K = 2 なら 1 0 1 0 1 の塊を見る
            for (int i = 0; i < nums.size(); i += 2) { // 0番目の1から始めて偶数
                int left = i;
                int right = Math.min(i + add, nums.size());
                ans = Math.max(sums[right] - sums[left], ans);
            }
            out.println(ans);
        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

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

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

