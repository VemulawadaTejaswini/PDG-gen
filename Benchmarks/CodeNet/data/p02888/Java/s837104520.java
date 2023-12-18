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
        List<Long> l = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            l.add(scan.nextLong());
        }
        l.sort(Comparator.naturalOrder());
        long ans = 0;
        for (int i = 0; i < N; i++) {
            long l_i = l.get(i);
            for (int j = i+1; j < N; j++) {
                long l_j = l.get(j);
                long seek = l_i + l_j;
                int key = ~Collections.binarySearch(l, seek, new LowerBoundComparator<>());
                ans += Math.max(0, key - 1 - j);
            }
        }
        System.out.println(ans);
    }
    class LowerBoundComparator<T extends Comparable<? super T>> implements Comparator<T> {
        public int compare(T x, T y) {
            return (x.compareTo(y) >= 0) ? 1 : -1;
        }
    }
}
