import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().solve(new Scanner(System.in), new PrintWriter(System.out));
    }

    ArrayList<Pair<Integer, Integer>> moves;

    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        int mx = 0;
        for (int i = 1; i < n; ++i) {
            if (a[i] > a[mx]) {
                mx = i;
            }
        }
        moves = new ArrayList<>();
        for (int i = 0; i < 2; ++i) {
            op(a, mx, n - 1);
        }
        for (int i = 0; i < n - 1; ++i) {
            op(a, n - 1, i);
            op(a, n - 1, n - 1);
        }
        System.out.println(moves.size());
        for (Pair<Integer, Integer> move: moves) {
            System.out.println(++move.first + " " + ++move.second);
        }
    }

    private void op(int[] a, int x, int y) {
        a[y] += a[x];
        moves.add(new Pair<>(x, y));
    }

    private class Pair<A, B> {
        public A first;
        public B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }
}
