import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		PriorityQueue<Long> v = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<N;i++) {
			v.add(Long.parseLong(sc.next()));
		}
		double dp[] = new double[N+1];
		dp[0] = 0;
		int counter = 1;
		long f=0,ins=0;
		for(int i=1;i<A+1;i++) {
			f = v.poll();
			dp[i] = (dp[i-1]+f) / i;
		}
		for(int i=A+1;i<N+1;i++) {
			ins = v.poll();
			if(f == ins) {
				counter ++;
			}
			dp[i] = ((dp[i-1]*(i-1))+ins)/i;
		}
		int result = 0;
		//counter expresses the number of the replacible elements.
		for(int i=A;i<=B;i++) {
			if(dp[A] == dp[i]) {
				result += combination(counter,i);
			}
		}

		out.println(dp[A]);
		out.println(result);

		out.flush();
	}

	public static long combination(int n,int k) {
		if(n < k) {
			return 0;
		}
		else {
			long numerator = 1,denominator = 1;
			for(int i=n;i>n-k;i--) {
				numerator = numerator * i;
			}
			for(int i=k;i>0;i--) {
				denominator = denominator * i;
			}
			return numerator / denominator;
		}
	}
}