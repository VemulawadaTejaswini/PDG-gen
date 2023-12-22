import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        long[] A = new long[N];
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            map.merge(A[i], 1L, Long::sum);
        }
        long sum = Arrays.stream(A).sum();
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            long B = scan.nextLong();
            long C = scan.nextLong();
            if (map.containsKey(B)) {
                long count = map.get(B);
                sum += (C - B) * count;
                map.remove(B);
                if (!map.containsKey(C)) {
                    map.put(C, 0L);
                }
                long t = map.get(C);
                map.put(C, t + count);
            }
            System.out.println(sum);
        }
    }
}
