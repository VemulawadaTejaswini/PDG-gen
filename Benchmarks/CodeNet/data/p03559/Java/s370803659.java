import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    int n;
    long[] as, bs, cs;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        as = new long[n];
        bs = new long[n];
        cs = new long[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextLong();
        for (int i = 0; i < n; i++)
            bs[i] = sc.nextLong();
        for (int i = 0; i < n; i++)
            cs[i] = sc.nextLong();
    }

    private void solve() {
        Arrays.sort(as);
        Arrays.sort(bs);
        Arrays.sort(cs);
        int[] cntB = new int[n];
        long[] cntA = new long[n];
        int j = n - 1;
        for (int i = n-1; i >= 0; i--) {
            if (i != n-1)
                cntB[i] = cntB[i+1];
            for (; j >= 0; j--) {
                if (bs[i] >= cs[j])
                    break;
                cntB[i]++;
            }
        }
        j = n - 1;
//        Arrays.fill(cntA, 1);
        for (int i = n-1; i >= 0; i--) {
            if (i != n-1)
                cntA[i] = cntA[i+1];
            for (; j >= 0; j--) {
                if (as[i] >= bs[j])
                    break;
                cntA[i] += cntB[j];
            }
        }
        long ans = 0L;
        for (long c: cntA)
            ans += c;
        System.out.println(ans);
    }
}
