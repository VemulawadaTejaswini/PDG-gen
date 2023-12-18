import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }

            int totalReward = 0;
            int maxReward = -1;
            int maxRewardIndex = 0;
            List<Integer> tabuList = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                for (int j = 0; j < n; j++) {
                    // i日以下のものの中でmaxのもの 同じものがあればa[j]が大きいもの
                    if (a[j] <= i && (maxReward < b[j] || maxReward == b[j] && a[j] > a[maxRewardIndex]) && !tabuList.contains(j)) {
                        maxReward = b[j];
                        maxRewardIndex = j;
                    }
                }
                if (maxReward > 0) {
                    totalReward += maxReward;
                    tabuList.add(maxRewardIndex);
                }
                maxReward = -1;
            }

            out.println(totalReward);
        }

    }
}

