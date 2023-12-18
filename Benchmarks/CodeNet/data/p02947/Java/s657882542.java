import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        HashMap<String, Long> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            char[] d = s.toCharArray();
            Arrays.sort(d);
            String sorted = new String(d);
            if (!map.containsKey(sorted)) {
                map.put(sorted, 0L);
            }
            long count = map.get(sorted);
            map.put(sorted, count + 1);
        }
        long answer = 0;
        for (String x : map.keySet()) {
            long count = map.get(x);
            if (count == 1) {
                continue;
            }
            answer += count * (count - 1) / 2;
        }
        System.out.println(answer);
    }
}
