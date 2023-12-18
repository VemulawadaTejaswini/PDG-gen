import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static class Data {
        int num;
        int total;
        public Data(int n, int t) {
            num = n;
            total = t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        Data[] r = new Data[n+1];

        for (int i = 1; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        for (int i = n; i >= 1; --i) {
            if (i * 2 <= n) {
                Data d = r[i * 2];
                if (d.total % 2 == a[i]) {
                    r[i] = new Data(0, d.total);
                } else {
                    r[i] = new Data(1, d.total + 1);
                }
            } else {
                r[i] = new Data(a[i], a[i]);
            }
        }

        int cnt = 0;
        for (int i = 1; i <= n; ++i) {
            if (r[i].num > 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; ++i) {
            if (r[i].num > 0) {
                sb.append(r[i].num);
                cnt--;
                if (cnt > 0) {
                    sb.append(" ");
                }
            }
        }
        System.out.println(sb.toString());

    }
}
