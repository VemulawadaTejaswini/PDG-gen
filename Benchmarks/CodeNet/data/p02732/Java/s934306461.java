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
        int[] A = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            int x = map.getOrDefault(A[i], 0);
            map.put(A[i], x+1);
        }
        long max = 0;
        for (int x : map.keySet()) {
            if (map.get(x) <= 1) {
                continue;
            }
            long cnt = map.get(x);
            max += cnt * (cnt - 1)/2;
        }
        for (int i = 0; i < N; i++) {
            int cnt = map.get(A[i]);
            if (cnt <= 1) {
                System.out.println(max);
                continue;
            }
            System.out.println(max - (cnt - 1));
        }
    }
}
