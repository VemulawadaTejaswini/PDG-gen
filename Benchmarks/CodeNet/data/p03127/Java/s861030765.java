

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        long champion = sc.nextLong();
        for (int i = 0; i < n - 1; i++) {
            long challenger = sc.nextLong();
            Pair pair = new Pair(champion, challenger);
            long ans = pair.max % pair.min;
            if (ans == 0) {
                champion = pair.min;
            } else {
                long ans2 = pair.min;
                while (ans != ans2) {
                    Pair p = new Pair(ans, ans2);
                    ans = p.max - p.min;
                    ans2 = p.min;
                }
                champion = ans;
            }
        }
        System.out.println(champion);
    }

    static class Pair {
        long max;
        long min;

        public Pair(long a, long b) {
            this.max = a > b ? a : b;
            this.min = a > b ? b : a;
        }
    }
}
