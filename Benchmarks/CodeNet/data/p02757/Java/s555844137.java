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
    public Map<String, Boolean> dividable = new HashMap<>();

    public void solve(long N, String Pstr, String S) {
        BigInteger P = new BigInteger(Pstr);

        long ans = 0;
        for (int i = 0; i < N; i++) {
            StringBuilder s = new StringBuilder();
            s.append(S.charAt(i));
            if (isDividable(s.toString(), P)) ans++;

            for (int j = i + 1; j < N; j++) {
                s.append(S.charAt(j));
                if (isDividable(s.toString(), P)) ans++;
            }
        }
        System.out.println(ans);
    }

    public boolean isDividable(String d, BigInteger P) {
        if (!dividable.containsKey(d)) {
            BigInteger b = new BigInteger(d);
            dividable.put(d, b.remainder(P).equals(BigInteger.ZERO));
        }

        return dividable.get(d);
    }
}
