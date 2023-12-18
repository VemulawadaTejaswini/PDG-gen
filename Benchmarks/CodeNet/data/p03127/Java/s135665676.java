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
        int N = in.nextInt();
        int A[] = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = in.nextInt();
        }
        int a = A[0];
        for (int i=1; i<=N-1; i++) {
            a = gcd(a, A[i]);
        }
        out.println(a);

    }

public   static int gcd(int num1, int num2) {
        if(num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }

}
}

