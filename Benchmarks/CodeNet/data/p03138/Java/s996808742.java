import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		Arrays.setAll(A, i -> sc.nextLong());
		long x = 0, ans = 0;
		for(int i = 39; i >= 0; i--) {
			int c = 0;
			for(int j = 0; j < N; j++)
				c += (1 & (i >> A[j]));
			if(c <= N/2)
				if((x| 1l << i) <= K)
					x = x| 1l << i;
		}
		for(long i : A)
			ans += x^i;
		System.out.println(ans);

	}

}