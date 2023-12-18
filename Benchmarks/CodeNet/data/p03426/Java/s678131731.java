import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int D = scan.nextInt();
        int[][] original = new int[H*W+1][2];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int A = scan.nextInt();
                original[A][0] = i;
                original[A][1] = j;
            }
        }
        int[] s = new int[H*W+1];
        for (int i = 1; i <= H * W - D; i++) {
            int[] o1 = original[i+D];
            int[] o2 = original[i];
            s[i+D] = s[i]
                    + Math.abs(o1[0]-o2[0])
                    + Math.abs(o1[1]-o2[1]);
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int L = scan.nextInt();
            int R = scan.nextInt();
            System.out.println(s[R]-s[L]);
        }
    }
}
