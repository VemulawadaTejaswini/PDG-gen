import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRecording solver = new DRecording();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRecording {
        public void solve(int testNumber, Scanner in, PrintWriter out) {


            // つまり[l,r]で録画機を占有するが、同じチャンネルに関して言えば
            // [l,r] , [r ,rr]も録画が可能になる
            // 各チャンネルについて、O(NC)であるかどうかを確認する
            // 累積和に落とし込む
            // まず各チャンネルについての累積和を組む
            // そしたら最後のカウントに関しては累積和じゃなくてシミュレートをしていけばいい。

            // 累積和について、まず
            // (s,t,c) について, s->+1, t+1 -> -1する

            int n = in.nextInt();
            int c = in.nextInt();
            int[][] accChan = new int[c][100001];
            int[] cnt = new int[100001];
            int max = 0;
            for (int i = 0; i < n; i++) {
                int s = in.nextInt();
                int t = in.nextInt();
                int chan = in.nextInt() - 1;
                accChan[chan][s]++;
                accChan[chan][t + 1]--;
            }


            for (int i = 0; i < c; i++) {
                for (int j = 0; j <= 100000; j++) {
                    if (j > 0) {
                        accChan[i][j] = accChan[i][j - 1] + accChan[i][j];
                    }
                }
            }

            for (int i = 0; i < c; i++) {
                for (int j = 0; j <= 100000; j++) {
                    if (j < n && accChan[i][j] == 0 && accChan[i][j + 1] == 1) {
                        cnt[j]++;
                    }
                    if (accChan[i][j] == 1) {
                        cnt[j]++;
                    }
                }
            }


            for (int i = 0; i <= 100000; i++) {
                max = Math.max(max, cnt[i]);
            }

            out.println(max);

        }

    }
}

