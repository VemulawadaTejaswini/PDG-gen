import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        final Solver solver = new Solver();
        solver.solve(N, S);
    }
}

class Solver {
    public void solve(int N, String S) {
        int ans = 0;
        int cur = 'A';
        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (cur == c) {
                cur++;
                if (cur > 'C') {
                    ans++;
                    cur = 'A';
                }
            }
            else {
                cur = (c == 'A') ? 'B' : 'A';
            }
        }
        System.out.println(ans);
    }
}

