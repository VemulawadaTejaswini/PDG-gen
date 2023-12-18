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
        long answer = Long.MAX_VALUE;
        if (map.size() == 1) {
            answer = N /2;
        } else {
            int[] c = new int[map.size()];
            int i = 0;
            for (int x : map.keySet()) {
                c[i++] = map.get(x);
            }
            Arrays.sort(c);
            long t = Math.abs(c[c.length-1]-N/2);
            t += Math.abs(c[c.length-2]-N/2)-t;
            answer = Math.min(answer, t);
            if (N/2 < c[c.length-1]) {
                t = Math.abs(c[c.length - 1] - N / 2);
                t += Math.abs(t - N / 2);
                answer = Math.min(answer, t);
            }
        }
        System.out.println(answer);
    }
}
