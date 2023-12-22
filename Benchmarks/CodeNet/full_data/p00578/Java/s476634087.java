import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static class Pair implements Comparable<Pair> {
        int first, second;
        private Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair p) {
            if (first == p.first) {
                return second - p.second;
            } else {
                return first - p.first;
            }
        }
    }

    private final static int MAXN = 100000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Pair> pairs = new ArrayList<>();
        boolean[] flag = new boolean[n + 2];

        flag[0] = flag[n + 1] = false;
        for (int i = 1; i <= n; ++i) {
            flag[i] = true;
        }

        boolean zero = true;
        for (int i = 0; i < n; ++i) {
            int a = scanner.nextInt();
            pairs.add(new Pair(a, i + 1));
            if (a != 0) {
                zero = false;
            }
        }

        if (zero) {
            System.out.println(0);
            return;
        }

        Collections.sort(pairs);

        int max = 1, count = 1, iter = 0;
        for (Pair p: pairs) {
            if (p.first != iter) {
                max = Math.max(max, count);
                iter = p.first;
            }

            flag[p.second] = false;
            if (flag[p.second - 1] && flag[p.second + 1]) {
                ++count;
            } else if (!flag[p.second - 1] && !flag[p.second + 1]) {
                --count;
            }
        }
        max = Math.max(max, count);

        System.out.println(max);
    }
}

