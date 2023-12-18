import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
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
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scan.nextInt();
        }
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Pair p = new Pair();
            p.A = A[i];
            p.B = B[i];
            list.add(p);
        }
        list.sort(new PairComparator());
        long diff = 0;
        long count = 0;
        for (int i = 0; i < N; i++) {
            Pair p = list.get(i);
            if (0 <= p.diff()) {
                break;
            }
            diff += p.diff();
            if (p.diff() < 0) {
                count += 1;
            }
        }
        for (int i = N-1; 0 <= i; i--) {
            Pair p = list.get(i);
            if (p.diff() <= 0) {
                break;
            }
            if (0 <= diff) {
                break;
            }
            count += 1;
            diff += p.diff();
        }
        if (diff < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
    class Pair {
        int A;
        int B;
        public int diff() {
            return A - B;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.diff() == o2.diff()) {
                return Integer.compare(o1.B, o2.B);
            }
            return Integer.compare(o1.diff(), o2.diff());
        }
    }
}
