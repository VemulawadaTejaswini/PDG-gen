import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Objects;
import java.util.AbstractCollection;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int k = s.nextInt();
            String str = s.nextString();
            int i = 0;
            StringBuilder ans = new StringBuilder();
            int m = 0;
            ArrayList<Integer> list = new ArrayList<>();
            while (i < n) {
                int j = i;
                ans.append(str.charAt(i));
                int count = 0;
                while (j < n && str.charAt(i) == str.charAt(j)) {
                    j++;
                    count++;
                }
                list.add(count);
                m++;
                i = j;
            }
            n = ans.length();

//        out.println(list);
//        out.println(ans);

            str = ans.toString();
            PriorityQueue<DHandstand.pair> pq = new PriorityQueue<>(Collections.reverseOrder());
            int count = 0;
            TreeSet<Integer> set = new TreeSet<>();
            HashMap<Integer, ArrayList<Integer>> set1 = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (str.charAt(j) == '0') {
                    if (j - 1 >= 0 && j + 1 < n) {
                        DHandstand.pair p = new DHandstand.pair(j, list.get(j - 1), list.get(j + 1), list.get(j));
                        pq.add(p);
                        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(p.lFreq);
                        list1.add(p.rFreq);
                        list1.add(p.curr);
                        set1.put(p.val, list1);
                        set.add(j);
                    } else if (j - 1 >= 0) {
                        DHandstand.pair p = new DHandstand.pair(j, list.get(j - 1), 0, list.get(j));
                        pq.add(p);
                        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(p.lFreq);
                        list1.add(p.rFreq);
                        list1.add(p.curr);
                        set1.put(p.val, list1);
                        set.add(j);
                    } else {
                        DHandstand.pair p = new DHandstand.pair(j, 0, list.get(j + 1), list.get(j));
                        pq.add(p);
                        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(p.lFreq);
                        list1.add(p.rFreq);
                        list1.add(p.curr);
                        set1.put(p.val, list1);
                        set.add(j);
                    }
                }
            }
            count = 0;
            char[] arr = str.toCharArray();
            while (count < k && !pq.isEmpty()) {
//            out.println(pq);
                DHandstand.pair p = pq.poll();
                arr[p.val] = '1';
                Integer next = set.higher(p.val);
                if (next != null) {
                    ArrayList<Integer> list1 = set1.get(next);
                    DHandstand.pair p1 = new DHandstand.pair(next, list1.get(0), list1.get(1), list1.get(2));
                    pq.remove(p1);
                    p1.lFreq = p.rFreq + p.lFreq + p.curr;
                    pq.add(p1);
                }

                Integer prev = set.lower(p.val);
                if (prev != null) {
                    ArrayList<Integer> list1 = set1.get(prev);
                    DHandstand.pair p1 = new DHandstand.pair(prev, list1.get(0), list1.get(1), list1.get(2));
                    pq.remove(p1);
                    p1.rFreq = p.rFreq + p.lFreq + p.curr;
                    pq.add(p1);
                }
                set.remove(p.val);
                set1.remove(p.val);
                count++;
            }

            i = 0;
            int ans1 = Integer.MIN_VALUE;
            while (i < n) {
                int j = i;
                int length = 0;
                while (j < n && arr[j] == '1') {
                    length += list.get(j);
                    j++;
                }
                ans1 = Math.max(ans1, length);

                if (j == i) {
                    i++;
                } else {
                    i = j;
                }
            }

            out.println(ans1);

        }

        private static class pair implements Comparable<DHandstand.pair> {
            int val;
            int lFreq;
            int rFreq;
            int curr;

            public pair(int val, int lFreq, int rFreq, int curr) {
                this.val = val;
                this.lFreq = lFreq;
                this.rFreq = rFreq;
                this.curr = curr;
            }

            public String toString() {
                final StringBuilder sb = new StringBuilder("pair{");
                sb.append("val=").append(val);
                sb.append(", lFreq=").append(lFreq);
                sb.append(", rFreq=").append(rFreq);
                sb.append(", curr=").append(curr);
                sb.append('}');
                return sb.toString();
            }

            public int compareTo(DHandstand.pair o) {
                return Integer.compare(this.lFreq + this.rFreq + this.curr, o.lFreq + o.rFreq + o.curr);
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                DHandstand.pair pair = (DHandstand.pair) o;
                return val == pair.val &&
                        lFreq == pair.lFreq &&
                        rFreq == pair.rFreq &&
                        curr == pair.curr;
            }

            public int hashCode() {
                return Objects.hash(val, lFreq, rFreq, curr);
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

