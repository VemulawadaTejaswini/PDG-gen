import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] v = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            v[i] = scan.nextInt();
            if (!map.containsKey(v[i])) {
                map.put(v[i], 0);
            }
            int count = map.get(v[i]);
            map.put(v[i], count+1);
        }
        int[] c = new int[map.size()];
        long answer = Long.MAX_VALUE;
        for (int x : map.keySet()) {
            int a1 = map.get(x);
            for (int y : map.keySet()) {
                if (x == y) {
                    continue;
                }
                int a2 = map.get(y);
                long t = Math.abs(a1-N/2) + Math.abs(a2-N/2);
                answer = Math.min(answer, t);
            }
            long t = Math.abs(a1-N/2) + N/2;
            answer = Math.min(answer, t);
        }
        if (map.size() == 1) {
            long t = N / 2;
            answer = Math.min(answer, t);
        }
        System.out.println(answer);
    }
}
