import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    void solve() {
        // Input
        int n = sc.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] T = new int[q];
        for (int i = 0; i < q; i++) {
            T[i] = sc.nextInt();
        }
        // Solve
        Set<Integer> set = new HashSet<>();
        for (int s : S) {
            set.add(s);
        }
        int cnt = 0;
        for (int t : T) {
            if (set.contains(t)) {
                cnt++;
            }
        }
        // Output
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}

