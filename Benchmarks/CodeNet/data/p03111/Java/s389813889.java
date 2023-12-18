import java.util.*;
import java.io.*;

public class Main{
    static int solve(int P, int sumA, int sumB, int sumC, int cntA, int cntB, int cntC){
        if (P == n){
            if (sumA == 0 || sumB == 0 || sumC == 0) return (1 << 30);
            return (cntA - 1) * 10 + Math.abs(sumA - a) +
                   (cntB - 1) * 10 + Math.abs(sumB - b) +
                   (cntC - 1) * 10 + Math.abs(sumC - c);
        }
        return Math.min(
            Math.min(
                solve(P+1, sumA + v[P], sumB, sumC, cntA + 1, cntB, cntC),
                solve(P+1, sumA, sumB + v[P], sumC, cntA, cntB + 1, cntC)
            ),
            Math.min(
                solve(P+1, sumA, sumB, sumC + v[P], cntA, cntB, cntC + 1),
                solve(P+1, sumA, sumB, sumC, cntA, cntB, cntC)
            )
        );
    }
    static int a, b, c, n, v[] = new int[10];
    public static void main(String[] args) {
        FastReader in = new FastReader();
        n = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        for (int l = 0; l < n; ++l){
            v[l] = in.nextInt();
        }
        System.out.println(solve(0, 0, 0, 0, 0, 0, 0));
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}