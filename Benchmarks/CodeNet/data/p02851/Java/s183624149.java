import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0 ; i < N ; ++i) {
			A[i] = sc.nextLong() % K;			
		}
		long mem[] = new long[N];
		mem[0] = A[0] % K;
		for(int i = 1 ; i < N ; ++i) {
			mem[i] = (mem[i - 1] + A[i]) % K; 
		}
		long cnt = 0;
		for(int k = 1 ; k <= N ; ++k) {
			long S = mem[k - 1];
			if(S == k) {
				++cnt;
			}
			for(int i = k ; i < N ; ++i) {
				S = (mem[i] - mem[i - k] + K);
				if(S > K) {
					S -= K;
				}
				if(S == k) {
					++cnt;
				}
			}
		}
		System.out.println(cnt);
	}
}
