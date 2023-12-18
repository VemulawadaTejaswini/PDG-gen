import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N+1];
		for(int i = 0;i <= N;i++) {
			A[i] = scn.nextInt();
		}
		long a0 = A[N];
		ArrayList<Long> P = new ArrayList<Long>();
		for(long i = 2;i < Math.sqrt(a0) + 1;i++) {
			boolean first = true;
			while(a0%i==0) {
				a0/=i;
				if(first)P.add(i);
				first = false;
			}
		}
		if(a0!=0)P.add(a0);

		long sum_plus = 0, sum_minus = 0;
		boolean plus = true;
		for(int i = 0;i <= N;i++) {
			sum_plus += A[i];
			sum_minus += plus?A[i]:-A[i];
			plus = !plus;
		}

		ArrayList<Long> ans = new ArrayList<Long>();
		for(int i = 0;i < P.size();i++) {
			long p = P.get(i);
			if(sum_plus%p==0 && sum_minus%p==0) {
				ans.add(p);
				System.out.println(p);
			}
		}
	}

}
