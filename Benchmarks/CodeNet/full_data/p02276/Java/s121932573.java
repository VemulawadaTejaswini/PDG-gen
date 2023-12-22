import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int tmp = partition(a, 0, n-1);
        for (int i = 0; i < n; i++) {
            if (i != 0)
                System.out.print(" ");
            if (i == tmp)
                System.out.print("[" + a[i] + "]");
            else
                System.out.print(a[i]);
        }
        System.out.println();
    }

    static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p-1;

        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i = i+1;
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
            }
        }
        int tmp = A[r];
        A[r] = A[i+1];
        A[i+1] = tmp;

        return i+1;
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
