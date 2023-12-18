import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        FastScan scan = new FastScan(System.in);
        int N = scan.nextInt();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        long[] sum = new long[N+1];
        for (int i = 0; i < N; i++) {
            sum[i+1] = sum[i] + a[i];
        }
        long ans = Long.MAX_VALUE;
        for (int i = 2; i <= N - 2; i++) {
            int left = 0;
            int right = i;
            while (left + 1 < right) {
                int mid = (left + right) / 2;
                if (sum[mid] < sum[i] - sum[mid]) {
                    left = mid;
                } else {
                    right = right - 1;
                }
            }
            long P1 = sum[left];
            long Q1 = sum[i] - P1;
            long P2 = sum[left+1];
            long Q2 = sum[i] - P2;
            long P = Math.abs(P2-Q2) < Math.abs(P1-Q1) ? P2 : P1;
            long Q = Math.abs(P2-Q2) < Math.abs(P1-Q1) ? Q2 : Q1;
            left = i + 1;
            right = N;
            while (left + 1 < right) {
                int mid = (left + right) / 2;
                if (sum[mid]-sum[i] < sum[N] - sum[mid]) {
                    left = mid;
                } else {
                    right = right - 1;
                }
            }
            long R1 = sum[left] - sum[i];
            long S1 = sum[N] - sum[left];
            long R2 = sum[left+1] - sum[i];
            long S2 = sum[N] - sum[left+1];
            long R = Math.abs(R2-S2) < Math.abs(R1-S1) ? R2 : R1;
            long S = Math.abs(R2-S2) < Math.abs(R1-S1) ? S2 : S1;
            long min = Math.min(P, Math.min(Q, Math.min(R, S)));
            long max = Math.max(P, Math.max(Q, Math.max(R, S)));
            ans = Math.min(ans, Math.abs(max - min));
        }
        System.out.println(ans);
    }
    class FastScan {
        BufferedReader br;
        StringTokenizer st;
        FastScan(InputStream is) {
            InputStreamReader isr = new InputStreamReader(is);
            this.br = new BufferedReader(isr);
        }
        String next() throws IOException {
            while (this.st == null || !this.st.hasMoreTokens()) {
                this.st = new StringTokenizer(br.readLine().trim());
            }
            return st.nextToken();
        }
        long nextLong() throws IOException {
            return Long.parseLong(this.next());
        }
        int nextInt() throws IOException {
            return Integer.parseInt(this.next());
        }
        double scanDouble() throws IOException {
            return Double.parseDouble(this.next());
        }
        char scanCharacter() throws IOException {
            return this.next().charAt(0);
        }
        String nextLine() throws IOException {
            return br.readLine().trim();
        }
    }
}
