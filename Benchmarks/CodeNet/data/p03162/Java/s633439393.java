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
        int[] f1 = new int[n+1];
        int[] f2 = new int[n+1];
        int[] f3 = new int[n+1];
      	f1[0] = 0;
      	f2[0] = 0;
      	f3[0] = 0;
        for (int k = 1; k <= n; k++) {
            f1[k] = a[k-1] + Math.max(f2[k-1], f3[k-1]);
            f2[k] = b[k-1] + Math.max(f1[k-1], f3[k-1]);
            f3[k] = c[k-1] + Math.max(f1[k-1], f2[k-1]);
        }
        return Math.max(f1[n], Math.max(f2[n], f3[n]));
    }
}