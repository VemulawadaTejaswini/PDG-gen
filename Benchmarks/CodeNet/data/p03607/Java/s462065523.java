import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        int N = sc.nextInt();
        Map<Integer, Integer> dic = new HashMap<Integer, Integer>();
        int ans = N;
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(sc.next());
            if (dic.containsKey(tmp)) {
                int next = dic.get(tmp) + 1;
                dic.put(tmp, next);
                if (next % 2 == 0) {
                    ans -= 2;
                }
            } else {
                dic.put(tmp, 1);
            }
        }
        System.out.println(ans);
    }
}
