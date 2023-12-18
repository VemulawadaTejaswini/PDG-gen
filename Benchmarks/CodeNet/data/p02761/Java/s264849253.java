import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        int M = scan.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int s = scan.nextInt() - 1;
            int c = scan.nextInt();
            if (map.containsKey(s)) {
                if (c != map.get(s)) {
                    System.out.println(-1);
                    return;
                }
                continue;
            }
            map.put(s, c);
        }
        int[] digits = new int[N];
        if (1 < N && map.containsKey(0) && map.get(0) == 0) {
            System.out.println(-1);
            return;
        }
        digits[0] = map.getOrDefault(0, 1);
        for (int i = 1; i < N; i++) {
            int x = map.getOrDefault(i, 0);
            digits[i] = x;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(digits[i]);
        }
        System.out.println(sb.toString());
    }
}
