import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		PriorityQueue<Long> v = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<N;i++) {
			v.add(Long.parseLong(sc.next()));
		}
		double dp[] = new double[N+1];
		dp[0] = 0;
		int counter = 1, counter_= 1;
		long s=0,f=0,ins=0;
		s = v.peek();
		for(int i=1;i<A+1;i++) {
			f = v.poll();
			dp[i] = (dp[i-1]*(i-1)+f) / i;
			if(f == v.peek() && i!=A) {
				counter_ ++;
				counter ++;
			}
			else if(i!=A){
				counter = 1;
				counter_ = 1;
			}
		}
		long ln = A;
		for(int i=(int)(A+1);i<N+1;i++) {
			ins = v.poll();
			if(f == ins) {
				counter_++;
				ln++;
			}
			dp[i] = ((dp[(i-1)]*(i-1))+ins)/i;
		}

		Combination C = new Combination(counter_);
		long result = 0;
		//counter expresses the number of the replacible elements.
		if(counter_>=A && s==f) {
			for(int i=(int)A;i<=ln;i++) {
				result += Combination.combine(counter_,i);
			}
		}
		else {
			result += Combination.combine(counter_,counter);
		}

		out.println(dp[(int)A]);
		out.println(result);

		out.flush();
	}
}

class Combination {

	int N;
	static long[][] dp;

	Combination(int N) {
		this.N = N;
		this.dp = new long[N + 1][N + 1];
		createPascalsTriangle();
	}

	static long combine(int n, int k) {
		return dp[n][k];
	}

	void createPascalsTriangle() {

		dp[0][0] = 1;

		for (int n = 1; n <= N; n++) {
			for (int k = 0; k <= n; k++) {
				if (k - 1 >= 0) {
					dp[n][k] = dp[n-1][k-1] + dp[n-1][k];
				} else {
					dp[n][k] = dp[n-1][k];
				}
			}
		}
	}

	void printTriangle() {
		for (int n = 0; n <= N; n++) {
			System.out.print(n + "| ");
			for (int k = 0; k <= n; k++) {
				System.out.print(dp[n][k] + " ");
			}
			System.out.println();
		}
	}
}