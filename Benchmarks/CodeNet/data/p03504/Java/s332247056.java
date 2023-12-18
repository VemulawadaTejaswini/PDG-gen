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
        int C = scan.nextInt();
        List<Program>[] programs = new List[C];
        for (int i = 0; i < C; i++) {
            programs[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            int s = scan.nextInt();
            int t = scan.nextInt();
            int c = scan.nextInt()-1;
            Program p = new Program(s, t);
            programs[c].add(p);
        }
        for (int i = 0; i < C; i++) {
            programs[i].sort(new ProgramComparator());
        }
        for (int i = 0; i < C; i++) {
            int len = programs[i].size();
            for (int j = len-1; 1 <= j; j--) {
                Program prev = programs[i].get(j-1);
                Program current = programs[i].get(j);
                if (prev.end != current.start) {
                    continue;
                }
                prev.end = current.end;
                programs[i].remove(j);
            }
        }
        int[] dp = new int[200002];
        for (int i = 0; i < C; i++) {
            int len = programs[i].size();
            for (int j = 0; j < len; j++) {
                Program p = programs[i].get(j);
                dp[p.start * 2 - 1] += 1;
                dp[p.end * 2] -= 1;
            }
        }
        for (int i = 1; i < 200002; i++) {
            dp[i] += dp[i - 1];
        }
        int ans = 0;
        for (int i = 0; i <= 200001; i++) {
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
    class Program {
        int start;
        int end;
        Program(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    class ProgramComparator implements Comparator<Program> {
        @Override
        public int compare(Program o1, Program o2) {
            return Integer.compare(o1.start, o2.start);
        }
    }
}
