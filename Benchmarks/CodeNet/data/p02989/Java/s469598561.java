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
        int[] d = new int[N];
        HashMap<Integer, Pair> map = new HashMap<>();
        List<Pair> pairlist = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            d[i] = scan.nextInt();
            if (!map.containsKey(d[i])) {
                Pair p = new Pair();
                p.d = d[i];
                p.count = 0;
                map.put(d[i], p);
                pairlist.add(p);
            }
            Pair p = map.get(d[i]);
            p.count += 1;
        }
        pairlist.sort(new PairComparator());
        int half = N / 2;
        int sum = 0;
        int length = pairlist.size();
        int point = 0;
        for (int i = 0;i < length; i++) {
            Pair p = pairlist.get(i);
            if (sum + p.count < half) {
                sum += p.count;
                continue;
            } else {
                sum += p.count;
                point = i;
                break;
            }
        }
        Pair target = pairlist.get(point);
        int current = sum;
        if (current == half) {
            Pair n = pairlist.get(point + 1);
            System.out.println(n.d - target.d);
        } else if (half < current) {
            System.out.println(0);
        }
    }
    class Pair {
        int d;
        int count;
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.d == o2.d) {
                return Integer.compare(o1.count, o2.count);
            }
            return Integer.compare(o1.d, o2.d);
        }
    }
}
