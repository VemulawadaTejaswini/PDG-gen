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
        int M = in.nextInt();
        int ans = 0;
        int x[] = new int[M];
        for (int i=0; i<=M-1; i++) {
            x[i] = in.nextInt();
        }
        Arrays.sort(x);
        int xs[] = new int[M-1];
        for (int i=0; i<=M-2; i++) {
            xs[i] = x[M-1-i] - x[M-2-i];
        }
        Arrays.sort(xs);
        for (int i=0; i<=M-2-(N-1); i++) {
                ans+=xs[i];
        }
        out.println(ans);
    }

}
}

