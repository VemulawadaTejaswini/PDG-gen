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
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = scan.nextInt();
        }
        int max_answer = Integer.MIN_VALUE;
        for (int i = -1; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (K < i + N - j + 1) {
                    continue;
                }
                List<Integer> data = new ArrayList<>();
                for(int k = 0; k <= i; k++) {
                    if (0 <= k) {
                        data.add(V[k]);
                    }
                }
                for(int k = j; k < N; k++) {
                    data.add(V[k]);
                }
                data.sort(Comparator.naturalOrder());
                int answer = 0;
                int length = data.size();
                for (int k = 0; k < length; k++) {
                    answer += data.get(k);
                }
                if (0 < K - i - (N - j + 1)) {
                    for (int k = 0; k < K - i - (N -j + 1) && k < length; k++) {
                        int x = data.get(k);
                        if (0 <= x) {
                            continue;
                        }
                        answer -= x;
                    }
                }
                max_answer = Math.max(max_answer, answer);
            }
        }
        System.out.println(max_answer);

    }
}

