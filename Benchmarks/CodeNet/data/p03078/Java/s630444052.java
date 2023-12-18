import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.PriorityQueue;
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
        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();
        int K = in.nextInt();
        long A[] = new long[X];
        long B[] = new long[Y];
        long C[] = new long[Z];
        for (int i=0; i<X; i++) {
            A[i] = in.nextLong();
        }
        for (int i=0; i<Y; i++) {
            B[i] = in.nextLong();
        }
        for (int i=0; i<Z; i++) {
            C[i] = in.nextLong();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        PriorityQueue<long[]> Q = new PriorityQueue<>((array1, array2)->(int)((-array1[0]+array2[0])%1_000_000_000_000L));
        HashSet<Long> inQ = new HashSet<>();

        long temp[] = {A[X-1]+B[Y-1]+C[Z-1], X-1, Y-1, Z-1};
        Q.add(temp);
        inQ.add(hl(X-1, Y-1, Z-1));

        for (int i=0; i<K; i++) {
            temp = Q.poll();
            out.println(temp[0]);
            if(temp[1] > 0 && !inQ.contains(hl(temp[1]-1, temp[2], temp[3]))){
                long temp1[] = {A[(int)temp[1]-1]+B[(int)temp[2]]+C[(int)temp[3]], temp[1]-1, temp[2], temp[3]};
                Q.add(temp1);
                inQ.add(hl(temp[1]-1, temp[2], temp[3]));
            }
            if(temp[2] > 0 && !inQ.contains(hl(temp[1], temp[2]-1, temp[3]))){
                long temp2[] = {A[(int)temp[1]]+B[(int)temp[2]-1]+C[(int)temp[3]], temp[1], temp[2]-1, temp[3]};
                Q.add(temp2);
                inQ.add(hl(temp[1], temp[2]-1, temp[3]));
            }
            if(temp[3] > 0 && !inQ.contains(hl(temp[1], temp[2], temp[3]-1))){
                long temp3[] = {A[(int)temp[1]]+B[(int)temp[2]]+C[(int)temp[3]-1], temp[1], temp[2], temp[3]-1};
                Q.add(temp3);
                inQ.add(hl(temp[1], temp[2], temp[3]-1));
            }
        }
    }

long hl(long x, long y, long z) {
        return x * 10000 * 10000 + y * 10000 + z;
    }

}
}


