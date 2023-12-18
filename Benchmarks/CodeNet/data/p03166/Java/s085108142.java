
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int m = in.nextInt();
        boolean[][] path = new boolean[n][n];
        int[] ins = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < m; i++) {
            int from = in.nextInt();
            int to = in.nextInt();
            path[from - 1][to - 1] = true;
            ins[to - 1]++;
        }

        while (true) {
            boolean done = true;
            for (int i = 0; i < n; i++) {
                if (ins[i] == 0) {
                    done = false;
                    ins[i] = -1;
                    for (int j = 0; j < n; j++) {
                        if (path[i][j]) {
                            r[j] = Math.max(r[j], r[i] + 1);
                            ins[j]--;
                        }
                    }
                }
            }
            if (done) {
                break;
            }
        }
        int result = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            result = Math.max(result, r[j]);
        }
        System.out.println(result);
    }
}
