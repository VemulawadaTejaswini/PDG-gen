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
		long counter = 1, counter_= 1;
		long s=0,f=0,ins=0;
		s = v.peek();
		for(int i=1;i<A+1;i++) {
			f = v.poll();
			dp[i] = (dp[i-1]*(i-1)+f) / i;
			if(dp[i]==dp[i-1]) {
				counter_ ++;
				counter ++;
			}
			else {
				counter = 1;
				counter_ = 1;
			}
		}
		for(int i=(int)(A+1);i<N+1;i++) {
			ins = v.poll();
			if(f == ins) {
				counter_++;
			}
			dp[i] = ((dp[(i-1)]*(i-1))+ins)/i;
		}
		long result = 0;
		//counter expresses the number of the replacible elements.
		if(s==f) {
			for(int i=(int)A;i<=B;i++) {
				result += combination(counter_,i);
			}
		}
		else {
			result += combination(counter_,counter);
		}

		out.println(dp[(int)A]);
		out.println(result);

		out.flush();
	}

	public static long combination(long n,long k) {
		if(n < k) {
			return 1;
		}
		else if(k==0) {
			return 1;
		}
		else {
			long numerator = n,denominator = 1;
			double result = 1;
			for(int i=1;i<k;i++) {
				numerator = numerator * (n-i);
				denominator = denominator * i;
				result = result*numerator/denominator;
			}
			
			return (long)result;
		}
	}
}