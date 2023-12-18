import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
        }
        int res = vacation(N, a, b, c);
        System.out.println(res);
    }

    private static int vacation(int n, int[] a, int[] b, int[] c) {
        // subproblem:
        // s1(k) = max points of first k days ending with a
        // s2(k) = max points of first k days ending with b
        // s3(k) = max points of first k days ending with c
        // max{ s1(n), s2(n), s3(n) }

        // s*(0) = 0
        // s*(1) = a/b/c[0]
        // s1(k) = max{ s2(k-1), s3(k-1) } + a[k-1]
        // s2(k) = max{ s1(k-1), s3(k-1) } + b[k-1]
        // s3(k) = max{ s1(k-1), s2(k-1) } + c[k-1]
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        for (int i = 0; i < n; i++) {
            int t1 = a[i] + Math.max(s2, s3);
            int t2 = b[i] + Math.max(s1, s3);
            int t3 = c[i] + Math.max(s1, s2);
            s1 = t1;
            s2 = t2;
            s3 = t3;
        }
        return Math.max(s1, Math.max(s2, s3));
    }
}
