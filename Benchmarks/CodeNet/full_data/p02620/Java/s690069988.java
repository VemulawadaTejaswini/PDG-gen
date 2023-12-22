package jp.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().proc();

    }

    int d;
    List<Integer> cs;
    List<List<Integer>> sm;
    List<Integer> ts;
    int m;
    List<List<Integer>> dq;

    int totalSatisfaction() {
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
        try (Scanner stdin = new Scanner(System.in)) {

            d = stdin.nextInt();
            cs = new ArrayList<>();
            sm = new ArrayList<>();
            ts = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                cs.add(stdin.nextInt());
            }
            for (int i = 0; i < d; i++) {
                sm.add(new ArrayList<>());
                for (int j = 0; j < 26; j++) {
                    sm.get(i).add(stdin.nextInt());
                }
            }
            for (int i = 0; i < d; i++) {
                ts.add(stdin.nextInt());
            }

            m = stdin.nextInt();
            dq = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                dq.add(new ArrayList<>());
                for (int j = 0; j < 2; j++) {
                    dq.get(i).add(stdin.nextInt());
                }
            }

            for (int i = 0; i < m; i++) {
                int di = dq.get(i).get(0);
                int qi = dq.get(i).get(1);

                ts.set(di - 1, qi);
                int s = totalSatisfaction();
                System.out.println(s);
            }
        }
    }
}
