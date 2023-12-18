import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        long N = in.nextLong();
        long A[] = new long[5];
        for (int i=0; i<5; i++) {
            A[i] = in.nextLong();
        }
        long min = 1_000_000_000_000_000_001L;
        for (int i=0; i<5; i++) {
            if(min > A[i]){
                min = A[i];
            }
        }
        out.println(N/min + 5);
    }

}
}

