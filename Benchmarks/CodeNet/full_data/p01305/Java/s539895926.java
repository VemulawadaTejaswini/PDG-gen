import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numD = sc.nextInt();
        int[] gates = new int[9];
        int[] jacky = new int[9];

        while (numD-- > 0) {
            int gatesWins = 0;
            int jackyWins = 0;
            int buttles = 0;
            for (int i = 0; i < 9; i++) {
                gates[i] = sc.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                jacky[i] = sc.nextInt();
            }

            Permutation p = new Permutation(9);

            do {
                int gatesScore = 0;
                int jackyScore = 0;
                for (int i = 0; i < 9; i++) {
                    if (gates[i] > jacky[p.perm[i]]) gatesScore += gates[i]
                            + jacky[p.perm[i]];
                    else jackyScore += gates[i] + jacky[p.perm[i]];
                }
                // System.out.println("score:" + gatesScore + ", " + jackyScore);
                if (gatesScore > jackyScore) gatesWins++;
                else if (gatesScore < jackyScore) jackyWins++;
                buttles++;
            } while (p.nextPermutaion());
//            System.out.println("b" + buttles);
            System.out.println((double)Math.round((double) gatesWins / buttles * 100000) / 100000);
            System.out.println((double)Math.round((double) jackyWins / buttles * 100000) / 100000);


        }
    }

    static class Permutation {
        final int[] perm;
        final TreeSet<Integer> temp = new TreeSet<Integer>();

        public Permutation(int size) {
            perm = new int[size];
            for (int i = 0; i < size; i++) {
                perm[i] = i;
            }
        }
        
        boolean nextPermutaion() {
            int i = perm.length - 1;
            temp.clear();
            temp.add(perm[i--]);
            while (i >= 0) {
                Integer minGreater = temp.higher(perm[i]);
                if(minGreater == null) {
                    temp.add(perm[i--]);
                }
                else {
                    temp.add(perm[i]);
                    temp.remove(minGreater);
                    perm[i++] = minGreater;
                    for (; i < perm.length; i++) {
                        perm[i] = temp.pollFirst();
                    }
                    return true;
                }
            }
            return false;
        }
    }
}