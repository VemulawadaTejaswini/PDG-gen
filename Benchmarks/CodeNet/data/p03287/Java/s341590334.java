import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        long[] s = new long[N+1];
        for (int i = 0; i < N; i++) {
            s[i+1] = s[i] + A[i];
        }
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i <= N; i++) {
            int remain = (int) (s[i] % M);
            if (!map.containsKey(remain)) {
                map.put(remain, 0L);
            }
            long cnt = map.get(remain);
            map.put(remain, cnt+1);
        }
        long ans = 0;
        for(int x : map.keySet()) {
            long cnt = map.get(x);
            if (cnt <= 1) {
                continue;
            }
            ans += cnt * (cnt - 1) / 2;
        }
        System.out.println(ans);
    }
}
