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
        int M = scan.nextInt();
        Condition[] condition_list = new Condition[M];
        for (int i = 0; i < M; i++) {
            int k = scan.nextInt();
            Condition condition = new Condition();
            for (int j = 0; j < k; j++) {
                condition.add(scan.nextInt());
            }
            condition_list[i] = condition;
        }
        for (int i = 0; i < M; i++) {
            condition_list[i].setP(scan.nextInt());
        }
        int max = (int) Math.pow(2, N);
        int answer = 0;
        for (int i = 0; i < max; i++) {
            HashSet<Integer> on_switches = this.on_switches(i);
            boolean all_ok = true;
            for (int j = 0; j < M; j++) {
                if (!condition_list[j].is_on(on_switches)) {
                    all_ok = false;
                    break;
                }
            }
            if (all_ok) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
    private HashSet<Integer> on_switches(int current) {
        int index = 1;
        HashSet<Integer> on_switches = new HashSet<>();
        while(0 < current) {
            if (current % 2 == 1) {
                on_switches.add(index);
            }
            current /= 2;
            index += 1;
        }
        return on_switches;
    }
    class Condition {
        int p;
        HashSet<Integer> target_switches = new HashSet<>();
        void add(int target) {
            target_switches.add(target);
        }
        void setP(int p) {
            this.p = p;
        }
        boolean is_on(HashSet<Integer> on_switches) {
            int count = 0;
            for(int i : on_switches) {
                if (target_switches.contains(i)) {
                    count += 1;
                }
            }
            return this.p == count % 2;
        }
    }
}
