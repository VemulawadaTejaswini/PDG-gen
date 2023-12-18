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
        int[] v = new int[N];
        int[] odd_count = new int[100001];
        int[] even_count = new int[100001];
        for (int i = 0; i < N; i++) {
            v[i] = scan.nextInt();
            if (i % 2 == 0) {
                even_count[v[i]] += 1;
            } else {
                odd_count[v[i]] += 1;
            }
        }
        List<Pair> even_list = new ArrayList<>();
        List<Pair> odd_list = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            if (0 < even_count[i]) {
                Pair p = new Pair();
                p.x = i;
                p.count = even_count[i];
                even_list.add(p);
            }
            if (0 < odd_count[i]) {
                Pair p = new Pair();
                p.x = i;
                p.count = odd_count[i];
                odd_list.add(p);
            }
        }
        int[] etop2 = top2(even_list);
        int[] otop2 = top2(odd_list);
        long answer = 0;
        if (etop2[0] != otop2[0]) {
            int a = even_count[etop2[0]];
            int b = odd_count[otop2[0]];
            long t= Math.abs(a-N/2) + Math.abs(b-N/2);
            answer = t;
        } else {
            int a1 = even_count[etop2[0]];
            int b1 = odd_count[otop2[0]];
            int a2 = even_count[etop2[1]];
            int b2 = odd_count[otop2[1]];
            long t1= Math.abs(a1-N/2) + Math.abs(b2-N/2);
            long t2= Math.abs(a2-N/2) + Math.abs(b1-N/2);
            answer = Math.min(t1, t2);
        }
        System.out.println(answer);
    }
    public int[] top2(List<Pair> list) {
        list.sort(new PairComparator());
        int[] top2 = new int[2];
        while(!list.isEmpty()) {
            Pair p = list.remove(0);
            if (top2[0] == 0) {
                top2[0] = p.x;
                continue;
            }
            if (top2[1] == 0) {
                top2[1] = p.x;
                break;
            }
        }
        return top2;
    }
    class Pair {
        int x;
        int count;
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.count == o2.count) {
                return Integer.compare(o1.x, o2.x);
            }
            return -Integer.compare(o1.count, o2.count);
        }
    }
}
