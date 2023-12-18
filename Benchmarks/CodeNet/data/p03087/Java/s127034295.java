import java.util.Scanner;

class Problem {
    private int N;
    private int Q;
    private String S;
    private int[] rs;
    private int[] ls;
    private int[] memo;
    private Scanner sc;

    Problem() {
        sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        S = sc.next();
        ls = new int[Q];
        rs = new int[Q];
        for (int i = 0; i < Q; i++) {
            ls[i] = sc.nextInt();
            rs[i] = sc.nextInt();
        }
    }

    void solve() {
        memo = new int[N];

        int c = 0;
        for (int i = 1; i < N; i++) {
            if (S.charAt(i - 1) == 'A' && S.charAt(i) == 'C') {
                c += 1;
            }
            memo[i] = c;
        }

        for (int i = 0; i < Q; i++) {
            int l = ls[i] - 1;
            int r = rs[i] - 1;

            int ans = memo[r] - memo[l];
            System.out.println(ans);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new Problem().solve();
    }
}
