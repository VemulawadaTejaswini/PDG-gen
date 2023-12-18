import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
        int be[][] = new int[100000+1][2];
        int bo[][] = new int[100000+1][2];
        for (int i=0; i<N/2; i++) {
            int e = in.nextInt();
            int o = in.nextInt();
            be[e][0] = e;
            bo[o][0] = o;
            be[e][1]++;
            bo[o][1]++;
        }
        Arrays.sort(be, Comparator.comparing((int[] a) -> a[1]).reversed());
        Arrays.sort(bo, Comparator.comparing((int[] a) -> a[1]).reversed());
        if(be[0][0] != bo[0][0]) out.println(N-be[0][1]-bo[0][1]);
        else out.println(Math.min(N-be[0][1]-bo[1][1], N-be[1][1]-bo[0][1]));
    }

}
}

