import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();// sc.nextInt();
        ArrayDeque<?>[] qul = new ArrayDeque<?>[N];

        for (int i = 0; i < N; i++) {
            ArrayDeque<Integer> q = new ArrayDeque<Integer>();
            for (int j = 1; j < N; j++) {
                q.add(sc.nextInt() - 1);
            }
            qul[i] = q;
        }

        int ans = 0;
        int cnt = 0;
        while (true) {
            int cp = 0;
            HashSet<SimpleEntry> pair = new HashSet<SimpleEntry>();
            for (int i = 0; i < N; i++) {
                ArrayDeque<?> q = qul[i];
                if (q.isEmpty()) {
                    continue;
                }
                int tar = (Integer) q.peek();
                ArrayDeque<?> t = qul[tar];
                if (t.isEmpty()) {
                    System.out.println(-1);
                    return;
                }
                int pme = (Integer) t.peek();

                if (i == pme && i < tar) {
                    int o1 = (Integer) q.poll();
                    int o2 = (Integer) t.poll();
                    System.out.println(cp + " " + o1 + " " + o2);
                    pair.add(new SimpleEntry<>(Math.min(o1, o2), Math.max(o1, o2)));
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
                System.out.println(ans+1);
                return;
            }
        }
    }
}