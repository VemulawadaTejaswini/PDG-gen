import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];
        for (int i=0; i<H; i++) {
            S[i] = sc.next();
        }

        System.out.println(solve(H, W, S));
    }

    private static long solve(int H, int W, String[] S) {
        int[][] scoreH = new int[H][W];
        int[][] scoreW = new int[H][W];

        for (int i=0; i<H; i++) {
            int prev = -1;
            int next;

            while ((next = S[i].indexOf('#', prev+1)) != -1) {
                for (int k=prev+1; k<next; k++) {
                    scoreH[i][k] = next - prev - 1;
                }
                prev = next;
            }
            for (int k=prev+1; k<W; k++) {
                scoreH[i][k] = W-prev-1;
            }

            /*
            System.err.println("calc scoreH at " + i);
            for (int w=0; w<W; w++) {
                System.err.print(scoreH[i][w] + " ");
            }
            System.err.println();
             */
        }


        for (int i=0; i<W; i++) {
            int prev = -1;
            int next;

            while ((next = indexOf(H, S, i, prev+1)) != -1) {
                for (int k=prev+1; k<next; k++) {
                    scoreW[k][i] = next - prev - 1;
                }
                prev = next;
            }
            for (int k=prev+1; k<H; k++) {
                scoreW[k][i] = H-prev-1;
            }

            /*
            System.err.println("calc scoreW at " + i);
            for (int h=0; h<H; h++) {
                System.err.print(scoreW[h][i] + " ");
            }
            System.err.println();
             */
        }

        int max = 0;
        for (int h=0; h<H; h++) {
            for (int w=0; w<W; w++) {
                max = Math.max(max, scoreH[h][w] + scoreW[h][w] - 1);
            }
        }

        return max;
    }

    private static int indexOf(int H, String[] S, int w, int start) {
        for (int s = start; s<H; s++) {
            if (S[s].charAt(w) == '#') return s;
        }

        return -1;
    }
}
