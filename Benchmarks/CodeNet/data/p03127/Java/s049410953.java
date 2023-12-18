import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import jdk.nashorn.api.tree.ForInLoopTree;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        Set<Integer> aSet = new HashSet<>(n);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            min = Math.min(min, a);
            aSet.add(a);
        }

        while (aSet.size() > 1) {
            Set<Integer> nextSet = new HashSet<>(n);
            nextSet.add(min);
            int nextMin = min;
            for (Integer a : aSet) {
                if (min != a) {
                    Integer tmp = a % min;
                    if (tmp != 0) {
                        nextSet.add(tmp);
                        nextMin = Math.min(nextMin, tmp);
                    }
                }
            }

            aSet = nextSet;
            min = nextMin;
        }
        System.out.println(min);
    }
}
