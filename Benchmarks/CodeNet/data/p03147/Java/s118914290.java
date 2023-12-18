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
        int h[] = new int[N];
        for (int i=0; i<N; i++) {
            h[i] = in.nextInt();
        }

        int ans = 0;
        int min = 1<<29;
        loop:while (true){
            int idx1 = 0;
            int idx2 = 0;
            while (h[idx1] == 0){
                if(idx1 == N-1 && h[idx1] == 0){
                    break loop;
                }
                idx1++;
                idx2++;
            }
            while (idx2 <= N-1){
                if(h[idx2] == 0){
                    break;
                }
                min = Math.min(min, h[idx2]);
                idx2++;
            }
            for(int i = idx1; i<=idx2-1; i++){
                h[i]-=min;
            }
            ans+=min;
        }
        out.println(ans);
    }

}
}

