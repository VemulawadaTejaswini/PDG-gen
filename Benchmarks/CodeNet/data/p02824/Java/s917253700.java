import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		int P = sc.nextInt();
		List<Long> A = new ArrayList<>();
		for(int i = 0; i < N; i++)
			A.add(sc.nextLong());
		Collections.sort(A, Collections.reverseOrder());
		int ans = P;
		if(P >= V) {
			for(int i = P; i < N; i++) {
				if(A.get(i)+M < A.get(P-1))
					break;
				ans++;
			}
		}
		else {
			//P番目以降の累積和
			long[] sum = new long[N];
			for(int i = P-1; i < N; i++) {
				sum[i] = sum[i-1];
				sum[i] += A.get(i);
			}
			for(int i = P; i < N; i++) {
				if((i-(P-1))*(A.get(i)+M)-sum[i-1] < M*(V-(P-1+N-i)))
					break;
				ans++;
			}
		}
		System.out.println(ans);

	}

}
