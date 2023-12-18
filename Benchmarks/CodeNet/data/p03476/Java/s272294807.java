import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Set<Integer> P = makePrimes(100000);
        int[] S = new int[100001];
        int c = 0;
        for (int n = 1; n < 100001; n++) {
            if (P.contains(n) && P.contains((n + 1) / 2)) {
                c++;
            }
            S[n] = c;
        }

        int Q = in.nextInt();
        for (int q = 0; q < Q; q++) {
            int L = in.nextInt();
            int R = in.nextInt();
            System.out.println(S[R] - S[L - 1]);
        }
    }

    static HashSet<Integer> makePrimes(int n) {
        HashSet<Integer> P = new HashSet<>();
        boolean[] F = new boolean[n + 1];
        Arrays.fill(F, true);
        for (int i = 2; i < n + 1; i++) {
            if (!F[i]) {
                continue;
            }

            P.add(i);
            for (int j = i; j < n + 1; j += i) {
                F[j] = false;
            }
        }

        return P;
    }
}

