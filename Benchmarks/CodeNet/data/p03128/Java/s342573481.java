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
int[] use = new int[10];
int[] memo;

public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        memo = new int[N+1];
        Arrays.fill(memo, -1);
        int M = in.nextInt();
        int match[] = {-100, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        Arrays.fill(use, 1<<29);
        for (int i=0; i<M; i++) {
            int cu = in.nextInt();
            use[cu] = match[cu];
        }
        StringBuilder ans = new StringBuilder();
        while(N > 0){
            for (int i=9; i>0; i--) {
                if(mdfs(N) == mdfs(N - use[i]) + 1){
                    ans.append(i);
                    N -= use[i];
                    break;
                }
            }
        }
        out.println(ans);
    }

int mdfs(int n) {
        if (n < 0) return -2; 
        if (n == 0) return 0; 
        if (memo[n] != -1) return memo[n]; 

        for (int i = 1; i < 10; i++) {
            
            memo[n] = Math.max(memo[n], mdfs(n - use[i]) + 1);
        }
        return memo[n];
    }

}
}

