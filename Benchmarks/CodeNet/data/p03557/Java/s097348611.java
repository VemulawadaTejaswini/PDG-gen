
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    void solve() {
        int N = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(C);
        long result = 0;
        for (int i = 0; i < N; i++) {
            result += findLess(A, B[i]) * findMore(C, B[i]);
        }
        out.println(result);
    }

    long findLess(int[] array, int num) {
        return binarySearchClosestFromLeft(array, num) + 1;
    }

    long findMore(int[] array, int num) {
        return array.length - binarySearchClosestFromRight(array, num);
    }

    int binarySearchClosestFromLeft(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        while (start + 1 < end) {
            int mid = start + ((end - start) >> 1);
            if (num[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        if (num[end] < target) {
            return end;
        } else if (num[start] < target) {
            return start;
        } else {
            return -1;
        }
    }

    int binarySearchClosestFromRight(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        while (start + 1 < end) {
            int mid = start + ((end - start) >> 1);
            if (num[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (num[start] > target) {
            return start;
        } else if (num[end] > target) {
            return end;
        } else {
            return -1;
        }
    }

    double getSquere(int lastV, int V, int nextV, int T) {
        double result;
        int frontT = (V > lastV) ? V - lastV : 0;
        int backT = (V > nextV) ? V - nextV : 0;
        if (frontT + backT > T) {
            double x = (double) (T + backT - frontT) / 2.0;
            double y = (double) (T + frontT - backT) / 2.0;
            double l = (double) (T + frontT + backT) / 2.0;
            result = (double) T * l - x * x / 2.0 - y * y / 2.0;
        } else {
            result = (double) (V * T) - (double) (frontT * frontT) / 2.0 - (double) (backT * backT) / 2.0;
        }

        return result;
    }


    void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

}