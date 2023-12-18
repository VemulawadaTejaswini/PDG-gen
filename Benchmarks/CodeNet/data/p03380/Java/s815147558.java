import java.util.Scanner;

public class Main {
    static int comb(int n, int r) {
        if ( r == 0 || n == r) {
            return 1;
        } else {
            return comb(n-1, r) + comb(n-1,r-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] input = new int[size];
        for (int i = 0; i < size; ++i) {
            input[i] = sc.nextInt();
        }

        int maxComb = Integer.MIN_VALUE;
        int maxAi = 0;
        int maxAj = 0;
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (i == j) continue;
                int ai = input[i];
                int aj = input[j];
                if (ai > aj) {
                    int c = comb(ai, aj);
                    if (maxComb < c) {
                        maxComb = c;
                        maxAi = ai;
                        maxAj = aj;
                    }
                }
            }
        }
        System.out.print(maxAi + " " + maxAj);
    }
}