import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int Z = scan.nextInt();
        int K = scan.nextInt();
        Long[] x = new Long[X];
        Long[] y = new Long[Y];
        Long[] z = new Long[Z];
        for (int i = 0; i < X; i++) {
            x[i] = scan.nextLong();
        }
        for (int i = 0; i < Y; i++) {
            y[i] = scan.nextLong();
        }
        for (int i = 0; i < Z; i++) {
            z[i] = scan.nextLong();
        }
        Arrays.sort(x, Comparator.reverseOrder());
        Arrays.sort(y, Comparator.reverseOrder());
        Arrays.sort(z, Comparator.reverseOrder());
        PriorityQueue<Long> queue = new PriorityQueue<>();
        int count = 0;
        for (int i = 0; i < Math.min(X, K); i++) {
            for (int j = 0; j < Math.min(Y, K); j++) {
                for (int k = 0; k < Math.min(Z, K); k++) {
                    queue.add(-x[i] - y[j] - z[k]);
                    count += 1;
                    //if (3 * K <= count) {
                    //    break;
                    //}
                }
                //if (3 * K <= count) {
                //    break;
                //}
            }
            //if (3 * K <= count) {
            //    break;
            //}
        }
        for (int i = 0; i < K; i++) {
            System.out.println(-queue.poll());
        }
    }
}
