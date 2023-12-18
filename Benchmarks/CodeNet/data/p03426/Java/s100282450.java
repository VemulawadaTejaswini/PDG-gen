import java.util.*;

public class Main {

    private int H;
    private int W;
    private int D;
    private int[][] A;
    private int Q;
    private int[] L;
    private int[] R;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        D = sc.nextInt();
        A = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Q = sc.nextInt();
        L = new int[Q];
        R = new int[Q];
        for (int i = 0; i < Q; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
    }

    public void printAnswer() {
        for (int k = 0; k < Q; k++) {
            int count = 0;
            int x = L[k];
            int pre_i = 0;
            int pre_j = 0;
            int post_i = 0;
            int post_j = 0;
            while (x != R[k]) {
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        if (A[i][j] == x) {
                            pre_i = i;
                            pre_j = j;
                        }
                        if (A[i][j] == x + D) {
                            post_i = i;
                            post_j = j;
                        }
                    }
                }
                count += Math.abs(pre_i - post_i) + Math.abs(pre_j - post_j);
                x += D;
            }
            System.out.println(count);
        }
    }

    public void run() {
        inputData();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
