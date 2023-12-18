import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();
        long[] s = new long[a + 2];
        long[] t = new long[b + 2];
        for (int i = 0; i < a; i++) {
            s[i] = sc.nextLong();
        }
        s[a] = (long) Math.pow(10, 18) * -1;
        s[a + 1] = (long) Math.pow(10, 18);
        for (int i = 0; i < b; i++) {
            t[i] = sc.nextLong();
        }
        t[b] = (long) Math.pow(10, 18) * -1;
        t[b + 1] = (long) Math.pow(10, 18);
        Arrays.sort(s);
        Arrays.sort(t);
        for (int i = 0; i < q; i++) {
            long x = sc.nextLong();
            int smax = BS.solve(s, x);
            int tmax = BS.solve(t, x);
            int smin = smax - 1;
            int tmin = tmax - 1;
            long ans = solveMin(s[smin], s[smax], t[tmin], t[tmax], x);
            System.out.println(ans);
        }
        sc.close();
    }

    static long solveMin(long a, long b, long c, long d, long x) {
        long ans[] = new long[8];
        long bsa = b - x;
        long asa = x - a;
        long tmp = Math.abs(b - c);
        ans[0] = bsa + tmp; // b > c
        tmp = Math.abs(b - d);
        ans[1] = bsa + tmp; // b > d
        tmp = Math.abs(a - c);
        ans[2] = asa + tmp; // a > c
        tmp = Math.abs(a - d);
        ans[3] = asa + tmp; // a > d
        long csa = x - c;
        long dsa = d - x;
        tmp = Math.abs(c - a);
        ans[4] = csa + tmp; // c > a
        tmp = Math.abs(c - b);
        ans[5] = csa + tmp; // c > b
        tmp = Math.abs(d - a);
        ans[6] = dsa + tmp; // d > a
        tmp = Math.abs(d - b);
        ans[7] = dsa + tmp; // d > b
        Arrays.sort(ans);
        return ans[0];
    }
}

class BS {
    static int solve(long[] ar, long key) {
        // keyより大きいあたいのindexを返す
        int left = 0;
        int right = ar.length - 1;
        int mid;
        while (true) {
            mid = (left + right) / 2;
            // 一致することはない
            if (ar[mid] < key) {
                left = mid;
            } else if (ar[mid] > key) {
                right = mid;
            }
            if (left + 1 == right) {
                return right;
            }
        }
    }
}
