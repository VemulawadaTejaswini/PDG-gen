import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        String Pstr;
        Pstr = sc.next();
        String S;
        S = sc.next();

        final Solver solver = new Solver();
        solver.solve(N, Pstr, S);
    }
}

class Solver {
    public void solve(long N, String Pstr, String S) {
        BigInteger P = new BigInteger(Pstr);

        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                String sub = S.substring(i, j);
                BigInteger b = new BigInteger(sub);

                if (b.remainder(P).equals(BigInteger.ZERO)) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

