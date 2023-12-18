import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N+1];
		long sum = 0;
		for(int i = 0;i <= N;i++) {
			A[i] = scn.nextLong();
			sum += A[i];
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

		ArrayList<Long> ans = new ArrayList<Long>();

		for(int i = 0;i < P.size();i++) {
			long p = P.get(i);
			boolean ok = true;
			for(int j = 0;j < N;j++) {
				ok &= (A[j+1] % p == 0);
			}

			if(ok) {
				ans.add(p);
				continue;
			}else {
				if(p == 2 && sum %2 == 0)ans.add(p);
			}
		}
		for(int i = 0;i < ans.size();i++) {
			System.out.println(ans.get(i));
		}
	}

}
