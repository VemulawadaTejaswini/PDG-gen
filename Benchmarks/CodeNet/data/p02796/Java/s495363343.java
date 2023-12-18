import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int X = scan.nextInt();
            int L = scan.nextInt();
            list.add(new Pair(X, L));
        }
        list.sort(new PairComparator());
        int ans = 0;
        int right = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            Pair p = list.get(i);
            if (right <= p.X - p.L) {
                ans += 1;
                right = p.X + p.L;
            }
        }
        System.out.println(ans);
    }
    class Pair{
        int LEFT;
        int X;
        int L;
        Pair(int X, int L) {
            this.X = X;
            this.L = L;
            this.LEFT = X - L;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.LEFT != o2.LEFT){
                return Integer.compare(o1.LEFT, o2.LEFT);
            }
            return Integer.compare(o1.L, o2.L);
        }
    }
}
