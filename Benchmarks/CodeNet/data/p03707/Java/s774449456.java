import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static class Question {
        int x1;
        int y1;
        int x2;
        int y2;
    }
    private void solve(BufferedReader in) throws IOException {
        String[] tokens;
        tokens = in.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);
        int Q = Integer.parseInt(tokens[2]);
        boolean[][] S = new boolean[N][M];
        for (int i = 0; i < N; ++i) {
            String s = in.readLine();
            for (int j = 0; j < M; ++j) {
                S[i][j] = (s.charAt(j) == '1');
            }
        }
        List<Question> list = new ArrayList<>();
        for (int i = 0; i < Q; ++i) {
            tokens = in.readLine().split(" ");

            Question q = new Question();
            q.x1 = Integer.parseInt(tokens[0]) - 1;
            q.y1 = Integer.parseInt(tokens[1]) - 1;
            q.x2 = Integer.parseInt(tokens[2]) - 1;
            q.y2 = Integer.parseInt(tokens[3]) - 1;
            list.add(q);
        }

        for (Question q : list) {
            int gridCnt = 0;
            int edgeCnt = 0;
            for (int i = q.x1; i <= q.x2; ++i) {
                for (int j = q.y1; j <= q.y2; ++j) {
                    if (S[i][j]) {
                        ++gridCnt;
                        if (i + 1 <= q.x2 && S[i + 1][j]) {
                            ++edgeCnt;
                        }
                        if (j + 1 <= q.y2 && S[i][j + 1]) {
                            ++edgeCnt;
                        }
                    }
                }
            }
            _out.println(gridCnt - edgeCnt);
        }
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) throws IOException {
        long S = System.currentTimeMillis();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        new Main().solve(in);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}