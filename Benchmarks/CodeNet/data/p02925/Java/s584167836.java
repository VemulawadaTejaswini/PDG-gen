
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        ArrayList<ArrayDeque<Integer>> qul = new ArrayList<ArrayDeque<Integer>>(N);

        for (int i = 0; i < N; i++) {
            ArrayDeque<Integer> q = new ArrayDeque<Integer>();
            for (int j = 1; j < N; j++) {
                q.add(sc.nextInt() - 1);
            }
            qul.add(q);
        }

        // ArrayDeque<Integer>[] qul;
        // qull.toArray(qul);

        int ans = 0;
        int cnt = 0;
        while (true) {
            int cp = 0;
            HashSet<Integer> con = new HashSet<Integer>();
            for (int i = 0; i < N; i++) {
                ArrayDeque<Integer> q = qul.get(i);
                if (q.isEmpty()) {
                    continue;
                }
                int tar = q.peek();

                if (con.contains(i))
                    continue;
                if (con.contains(tar))
                    continue;

                ArrayDeque<Integer> t = qul.get(tar);
                if (t.isEmpty()) {
                    System.out.println(-1);
                    return;
                }
                int pme = t.peek();

                if (i == pme && i < tar) {
                    // System.out.println(ans + " " + i + " " + tar);
                    q.poll();
                    qul.get(tar).poll();
                    con.add(i);
                    con.add(tar);
                    cp++;
                }
            }
            if (cp == 0) {
                System.out.println(-1);
                return;
            }
            cnt += cp;
            ans++;
            if (cnt == N * (N - 1) / 2) {
                System.out.println(ans);
                return;
            }
        }
    }
}