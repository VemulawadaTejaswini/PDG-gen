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
        int K = scan.nextInt();
        List<Pair> list = new ArrayList<>();
        HashMap<Integer, Pair> map = new HashMap<>();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            if (!map.containsKey(A[i])) {
                Pair p = new Pair();
                p.x = A[i];
                p.count = 1;
                map.put(A[i],p);
                list.add(p);
            } else {
                Pair p = map.get(A[i]);
                p.count += 1;
            }
        }
        if (map.size() <= K) {
            System.out.println(0);
            return;
        }
        list.sort(new PairComparator());
        int remain = map.size() - K;
        long answer = 0;
        for (int i = 0; i < remain; i++) {
            answer += list.get(i).count;
        }
        System.out.println(answer);
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
            return Integer.compare(o1.count, o2.count);
        }
    }
}
