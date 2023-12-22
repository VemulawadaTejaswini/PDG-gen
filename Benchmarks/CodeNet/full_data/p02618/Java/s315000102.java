package jp.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().proc();
    }

    long LIMIT = 1800;
    long startAt;
    int d;
    List<Integer> cs;
    List<List<Integer>> sm;

    int totalSatisfaction(List<Integer> ts, int d) {
        List<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 26; i++) {
            ls.add(0);
        }

        int s = 0;
        for (int i = 0; i < d; i++) {
            int t = ts.get(i);
            t--;

            s += sm.get(i).get(t);
            ls.set(t, i + 1);

            int dis = 0;
            for (int j = 0; j < 26; j++) {
                dis += cs.get(j) * ((i + 1) - ls.get(j));
            }

            s -= dis;
        }

        return s;
    }

    void proc() {
        startAt = System.currentTimeMillis();
        try (Scanner stdin = new Scanner(System.in)) {

            d = stdin.nextInt();
            cs = new ArrayList<>();
            sm = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                cs.add(stdin.nextInt());
            }
            for (int i = 0; i < d; i++) {
                sm.add(new ArrayList<>());
                for (int j = 0; j < 26; j++) {
                    sm.get(i).add(stdin.nextInt());
                }
            }

            // greedy
            List<Integer> ts = new ArrayList<>();
            for (int i = 0; i < d; i++) {
                int mx = Integer.MIN_VALUE;
                int mxt = -1;

                for (int t = 1; t <= 26; t++) {
                    ts.add(t);
                    int s = totalSatisfaction((List<Integer>) ts, i + 1);
                    if (s > mx) {
                        mx = s;
                        mxt = t;
                    }
                    ts.remove(ts.size() - 1);
                }

                ts.add(mxt);
                //System.out.println(mxt);
            }

            // random
            int mxsc = totalSatisfaction(ts, d);
            int mxbk = mxsc;
            Random random = new Random();
            while (true) {
                long curr = System.currentTimeMillis();
                if (curr - startAt >= LIMIT) {
                    break;
                }

                int di = random.nextInt(d);
                int qi = random.nextInt(26) + 1;

                int bk = ts.get(di);
                ts.set(di, qi);

                int sc = totalSatisfaction(ts, d);
                if (sc > mxsc) {
                    //System.out.println("update " + mxsc + " -> " + sc);
                    mxsc = sc;
                } else {
                    ts.set(di, bk);
                }
            }

            for (Integer t : ts) {
                System.out.println(t);
            }
            //System.out.println(mxbk + " -> " + mxsc);
        }
    }
}
