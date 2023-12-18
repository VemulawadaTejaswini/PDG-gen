import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();

        int match[] = {-100, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        int[] use = new int[10];
        Arrays.fill(use, 1<<29);
        for (int i=0; i<M; i++) {
            int cu = in.nextInt();
            use[cu] = match[cu];
        }

        int[] dp = new int[N+100];
        Arrays.fill(dp, -1<<29);
        dp[0] = 0;

        for (int i = 0; i < N; i++) {
            for (int k = 1; k <= 9; k++) {
                if(use[k] != 1<<29) dp[i + use[k]] = Math.max(dp[i + use[k]], dp[i] + 1);
            }
        }

        StringBuilder ans = new StringBuilder();
        while(N > 0){
            for (int i=9; i>0; i--) {
                if(N - use[i] >= 0){
                    if(dp[N] == dp[N - use[i]] + 1){
                        ans.append(i);
                        N -= use[i];
                        break;
                    }
                }
            }
        }
        out.println(ans);
    }

}
}

