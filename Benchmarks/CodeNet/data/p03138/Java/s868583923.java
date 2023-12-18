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
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        long K = in.nextLong();
        long A[] = new long[N];
        for (int i=0; i<=N-1; i++) {
            A[i] = in.nextLong();
        }

        int bA[] = new int[40];
        for (int i=0; i<=N-1; i++) {
            long ac = A[i];
            for (int j=0; ac > 0; j++) {
                bA[j] += ac % 2;
                ac /= 2;
            }
        }

        StringBuilder kA = new StringBuilder();
        long kc = K;
        while (kc > 0){
            kA.append(kc%2);
            kc /= 2;
        }
        int keta = kA.length();

        long K2 = 0;
        long pow2 = 1;
        for (int i=0; i<=keta-1; i++) {
            if(bA[i] >= N/2 + 1){
                K2 += pow2;
            }
            pow2 *= 2;
        }

        if(K2 > K){
            keta--;
        }

        long ans = 0;
        pow2 = 1;
        for (int i=0; i<=39; i++) {
            if(i<=keta-1){
                ans += pow2 * Math.max(bA[i], N-bA[i]);
            } else {
                ans += pow2 * bA[i];
            }
            pow2 *= 2;
        }
        out.println(ans);
    }

}
}

