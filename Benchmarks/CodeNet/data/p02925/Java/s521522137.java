
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
        while (true) {
            ArrayList<SimpleEntry<Integer, Integer>> pairs = new ArrayList<SimpleEntry<Integer, Integer>>();
            int emp = 0;
            for (int i = 0; i < N; i++) {
                ArrayDeque<Integer> q = qul.get(i);
                if (q.isEmpty()) {
                    emp++;
                    continue;
                }
                int one = q.peek();
                int two = qul.get(one).peek();
                
                // System.out.println(one + "   "+two);
                if (i == two) {
                    pairs.add(new SimpleEntry<Integer, Integer>(one, two));
                }
            }
            if (emp == N) {
                System.out.println(ans);
                return;
            }
            if (pairs.isEmpty()) {
                System.out.println(-1);
                return;
            }
            // SimpleEntry<Integer, Integer>[] list = pairs.toArray(new SimpleEntry<Integer,
            // Integer>[pairs.size()]);
            for (int i = 0; i < pairs.size(); i++) {
                SimpleEntry<Integer, Integer> se = pairs.get(i);
                // System.out.println(se);
                if (qul.get(se.getKey()).peek() == se.getValue()) {
                    qul.get(se.getKey()).poll();
                    qul.get(se.getValue()).poll();
                }
            }
            ans++;
        }
    }
}