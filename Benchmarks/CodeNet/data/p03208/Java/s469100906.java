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
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskC   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int K = in.nextInt();
        int h[] = new int[N];
        for (int i=0; i<N; i++) {
            h[i] = in.nextInt();
        }
        Arrays.sort(h);

        int idx1 = 0;
        int idx2 = K-1;
        int ans = 1<<30;
        while (idx2 != N){
            ans = Math.min(ans, h[idx2]-h[idx1]);
            idx1++;
            idx2++;
        }
        out.println(ans);
    }

}
}

