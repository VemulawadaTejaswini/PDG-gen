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
        int A[] = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = in.nextInt();
        }

        while(true){
            Arrays.sort(A);
            if(A[N-2] == 0){
                break;
            }
            int idx = 0;
            while(A[idx] == 0){
                idx++;
            }
            for (int i=idx+1; i<=N-1; i++) {
                A[i] = A[i] % A[idx];
            }
        }
        out.println(A[N-1]);
    }

}
}

