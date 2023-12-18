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
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        int[] keys = {1,2};
        int[] diffs = {-1,0,1};
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        for (int diff: diffs) {
            int k = (A[0] + diff) % 2 == 0 ? 2 : 1;
            map.put(k, map.get(k) + 1);
        }

        for (int i = 1; i < N; i++) {
            int current = A[i];
            Map<Integer, Integer> next_map = new HashMap<>();
            next_map.put(1, 0);
            next_map.put(2, 0);
            for (int key : keys) {
                int count = map.get(key);
                for (long diff : diffs) {
                    int next_key = (key * (current + diff)) % 2 == 0 ? 2 : 1;
                    int next_count = next_map.get(next_key);
                    next_map.put(next_key, next_count + count);
                }
            }
            map = next_map;
        }
        System.out.println(map.get(2));
    }
}
