import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Pair {
        int ai;
        int aj;
        int comb;
        public Pair(int ai, int aj) {
            this.ai = ai;
            this.aj = aj;
            this.comb = comb(ai, aj);
        }

        private int comb(int n, int r) {
            // combination formula
            // n! / (r! (n-r)!)
            //(n - r)
            int numerand = 1;
            int divident = 1;
            for (int i = 0; i < r; ++i) {
                numerand *= (n - i);
                divident *= (r - i);
            }
            return numerand / divident;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        List<Integer> input = new ArrayList<Integer>();
        for (int i = 0; i < size; ++i) {
           input.add(sc.nextInt());
        }

        List<Pair> pairs = new ArrayList<Pair>();
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (i == j) continue;
                int ai = input.get(i);
                int aj = input.get(j);
                if (ai > aj) {
                    pairs.add(new Pair(ai, aj));
                }
            }
        }

        int maxComb = Integer.MIN_VALUE;
        int ai = 0;
        int aj= 0;
        for (Pair p: pairs) {
            if (p.comb > maxComb) {
                maxComb = p.comb;
                ai = p.ai;
                aj = p.aj;
            }
        }
        System.out.print(ai + " " + aj);
    }
}