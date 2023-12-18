import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    int getMax(int x, int y) {
        return (x + y) / (y + 1);
    }

    int getSize(int x, int y) {
        return Math.max(getMax(x, y), getMax(y, x));
    }

    void check(String s, int a, int b) {
        System.err.println(s);
        int cntA = 0, cntB = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                cntA++;
            }
            if (c == 'B') {
                cntB++;
            }
        }
        if (cntA != a) {
            throw new AssertionError();
        }
        if (cntB != b) {
            throw new AssertionError();
        }
        int size = getSize(a, b);
        for (int i = 0; i < s.length(); ) {
            int j = i;
            while (j != s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            if (j - i > size) {
                throw new AssertionError();
            }
            i = j;
        }
    }

    boolean canWin(int moreA, int moreB, int size) {
        return moreA * 1L * size >= moreB;
    }

    String solve(int a, int b, int c, int d) {
//        System.err.println(a + " " + b);
        int size = getSize(a, b);
//        System.err.println("size = " + size);
        char[] res = new char[a + b];
        int moreA = a, moreB = b;
        int curCnt = 0;
        for (int i = 0; i < res.length; i++) {
            if (curCnt == size) {
                res[i] = (char) ('A' + 'B' - res[i- 1]);
            } else {
                if (canWin(moreA, moreB, size)) {
                    res[i] = 'A';
                } else {
                    res[i] = 'B';
                }
            }
            if (res[i] == 'A') {
                moreA --;
            } else {
                moreB--;
            }
            if (i == 0 || (res[i] != res[i - 1])) {
                curCnt = 1;
            } else {
                curCnt++;
            }
        }
//        check(new String(res), a, b);
        char[] ans = new char[d - c + 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = res[c + i];
        }
        return new String(ans);
    }

    String solve333(int a, int b, int c, int d) {
        System.err.println(a + " " + b);
        int size = getSize(a, b);
        System.err.println("size = " + size);
        char[] res = new char[a + b];
        int minA = 1 + (a - 1) / size;
        int minB = 1 + (b - 1) / size;
        int groupsA, groupsB;
        int as = 0;
        if (a < minB) {
            // start with B
            groupsA = Math.max(minA, minB - 1);
            groupsB = Math.max(minB, minA);
            as = 1;
        } else {
            // start with A
            groupsA = Math.max(minA, minB);
            groupsB = Math.max(minB, minA - 1);

        }
        System.err.println("groups = " + groupsA + " " + groupsB);
        int totalGroups = groupsA + groupsB;
        int it = 0;
        int moreA = a, moreB = b;
        for (int group = 0; group < totalGroups; group++) {
            if (group % 2 == as) {
                // As
                int cur = Math.min(size, moreA - (groupsA - 1));
                for (int z = 0; z < cur; z++) {
                    res[it++] = 'A';
                    moreA--;
                }
                groupsA--;
            } else {
                int maxMoreB = (groupsB - 1) * size;
                int cur = Math.min(size, Math.max(1, moreB - maxMoreB));
                for (int z = 0; z < cur; z++) {
                    res[it++] = 'B';
                    moreB--;
                }
                groupsB--;
            }
        }
        if (it != res.length) {
            throw new AssertionError();
        }
        if (moreA != 0) {
            throw new AssertionError();
        }
        if (moreB != 0) {
            throw new AssertionError();
        }
        check(new String(res), a, b);
        char[] ans = new char[d - c + 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = res[c + i];
        }
        return new String(ans);
    }

    void solve() {
        int q = in.nextInt();
        for (int z = 0; z < q; z++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt() - 1;
            int d = in.nextInt() - 1;
            String ans = solve(a, b, c, d);
//            System.err.println("!!" + ans);
            out.println(ans);
//            out.println(solve(a, b, c, d));
        }
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}