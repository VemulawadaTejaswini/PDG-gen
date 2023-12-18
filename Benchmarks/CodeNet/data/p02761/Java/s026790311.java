import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();
        long[] s = new long[(int)(M)];
        long[] c = new long[(int)(M)];
        for(int i = 0 ; i < M ; i++){
                s[i] = sc.nextLong();
                c[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, M, s, c);
    }
}

class Solver {
    public void solve(long N, long M, long[] s, long[] c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append('a');
        }

        for (int i = 0; i < M; i++) {
            int index = (int) s[i] - 1;
            char num = (char) ('0' + c[i]);

            if (sb.charAt(index) == 'a' || sb.charAt(index) == num) {
                sb.setCharAt(index, num);
            }
            else {
                System.out.println(-1);
                return;
            }
        }

        if (sb.charAt(0) == 'a') {
            sb.setCharAt(0, '1');
        } else if (sb.charAt(0) == '0') {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (sb.charAt(i) == 'a') {
                sb.setCharAt(i, '0');
            }
        }

        System.out.println(sb.toString());
    }
}

