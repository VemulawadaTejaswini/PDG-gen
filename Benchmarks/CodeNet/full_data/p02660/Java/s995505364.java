import java.util.*;

public class Main {

    private static final int MAX = 1000000;
    private static final long[] lp = new long[MAX + 1];
    private static final List<Integer> pr = new ArrayList<>();

    static  {
        for (int i = 2; i <= MAX; ++i) {
            if (lp[i] == 0) {
                lp[i] = i;
                pr.add(i);
            }
            for (int j = 0; j < pr.size() && pr.get(j) <= lp[i] && i*pr.get(j) <= MAX; ++j) {
                lp[i * pr.get(j)] = pr.get(j);
            }
        }
    }

    public static void main (String[] args) throws Exception {

        final Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        final long NN = N;

        int count = 0;

        for (int prime = 2; prime*prime <= NN; ++prime) {
            if (lp[prime] == prime && (N % prime == 0)) {
                int cnt = 0;
                while (N % prime == 0) {
                    cnt++;
                    N = N/prime;
                }
                int k = 0;
                int term = 1;

                while (cnt >= 0) {
                    if (cnt >= term) {
                        k++;
                        cnt -= term;
                        term++;
                    } else {
                        break;
                    }
                }

                count += k;
            }
        }

        System.out.println(count);

    }
}