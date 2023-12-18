import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static long solve(int mem[] , int K) {
		long cnt = 0;
		int N = mem.length;
		for(int k = 1 ; k <= N ; ++k) {
			long S = mem[k - 1];
			if(S == k) {
				++cnt;
			}
		}
		int M[] = new int[N];
		for(int i = 0 ; i < N ; ++i) {
			M[i] = mem[i] - (i % K) + K;
			M[i] = M[i] % K;
		}
		/*
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 1 ; i < Math.min(N, K) ; ++i) {
			int mi = M[i];					
			if(map.containsKey(mi)) {
				int v = map.get(mi);
				map.put(mi, v + 1);
			}else {
				map.put(mi, 1);
			}
		}
		*/
		for(int j = 0 ; j < N ; ++j) {
			int mj = M[j];
			// i - j < K
			// i < K + j
			int R = Math.min(K + j, N);					
			for(int i = j + 1 ; i < R ; ++i) {
				if(M[i] == mj) {
					++cnt;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i) {
			A[i] = sc.nextInt() % K;			
		}
		int mem[] = new int[N];
		mem[0] = A[0] % K;
		for(int i = 1 ; i < N ; ++i) {
			mem[i] = (mem[i - 1] + A[i]) % K; 
		}
		System.out.println(solve(mem, K));
	}
}
