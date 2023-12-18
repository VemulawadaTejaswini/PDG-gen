import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int h = scan.nextInt();
            Pair p = new Pair(i, h);
            list.add(p);
        }
        TreeSet<Integer>[] edges = new TreeSet[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new TreeSet<>();
        }
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            edges[a].add(list.get(b).height);
            edges[b].add(list.get(a).height);
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            Pair p = list.get(i);
            TreeSet<Integer> neibors = edges[p.id];
            if (neibors.size() == 0) {
                ans += 1;
                continue;
            }
            if (neibors.ceiling(p.height) == null) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
    class Pair {
        int id;
        int height;
        Pair(int id, int height) {
            this.id = id;
            this.height = height;
        }
    }
    class PairComaprator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.height != o2.height) {
                return Integer.compare(o1.height, o2.height);
            }
            return Integer.compare(o1.id, o2.id);
        }
    }
}
