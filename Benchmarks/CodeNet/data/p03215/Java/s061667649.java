import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
        }
        long[] sum = new long[N+1];
        for (int i = 0; i < N; i++) {
            sum[i+1] = sum[i] + a[i];
        }
        List<Long> list = new ArrayList<>();
        long max = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                long x = sum[j]-sum[i-1];
                list.add(x);
                max = Math.max(max, Long.highestOneBit(x));
            }
        }
        long ans = 0;
        for (long current = max; 0 < current; current /= 2) {
            int count = 0;
            List<Long> newlist = new ArrayList<>();
            int listsize = list.size();
            for (int i = 0; i < listsize; i++) {
                long target = list.get(i);
                if (0 < (target & current)) {
                    count+=1;
                    newlist.add(target);
                }
            }
            if (K <= count) {
                list = newlist;
                ans += current;
            }
        }
        System.out.println(ans);
    }
}
