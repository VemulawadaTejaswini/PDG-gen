import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        String[] S = new String[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                S[i] = sc.next();
        }

        final Solver solver = new Solver();
        solver.solve(N, S);
    }
}

class Solver {
    public void solve(long N, String[] S) {

        int max = 0;
        TreeMap<String, Integer> dict = new TreeMap<>();
        for (String s : S) {
            if (dict.containsKey(s)) {
                dict.put(s, dict.get(s) + 1);
            }
            else {
                dict.put(s, 1);
            }

            if (max < dict.get(s)) {
                max = dict.get(s);
            }
        }

        for (final String key : dict.navigableKeySet()) {
            final int v = dict.get(key);
            if (v == max) {
                System.out.println(key);
            }
        }
    }
}

