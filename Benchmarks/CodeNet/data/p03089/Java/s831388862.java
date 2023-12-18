import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Problem {
    private int N;
    private ArrayList<Integer> b;

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        b = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            b.add(sc.nextInt());
        }
    }

    void solve() {
        ArrayList<Integer> a = new ArrayList<>(N);

        for(int i = 0; i < N; i++) {
            if (b.get(i) > (i+1)) {
                System.out.println(-1);
                return;
            }
        }

        while (!b.isEmpty()) {
            int maxIndex = -1;
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i) == (i+1) && i > maxIndex) {
                    maxIndex = i;
                }
            }
            if (maxIndex < 0) {
                System.out.println(-1);
                return;
            }
            a.add(0, b.remove(maxIndex));
        }
        for (Integer n: a) {
            System.out.println(n);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new Problem().solve();
    }
}
