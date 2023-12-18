import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long can(long X , long A[] ){
		int N = A.length;
		long S = 0;
		for(int i = 0 ; i < N ; ++i){
			long Y = X - A[i];
			int idx = Arrays.binarySearch(A, Y);
			if(idx < 0){
				idx = - idx - 1;
			}
			S += N - idx;
		}
		return S;
	}
	static long solve(long X , long A[]){
		int N = A.length;
		long S[] = new long[N + 1];
		for(int i = 0 ; i < N ; ++i){
			S[i + 1] = S[i] + A[i];
		}
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			long Y = X - A[i];
			int idx = Arrays.binarySearch(A, Y);
			if(idx < 0){
				idx = - idx - 1;
			}
			ret += S[N] - S[idx] + (N - idx) * A[i];
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		long A[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		long low = 0;
		long high = A[N - 1] * 2 + 1;
		while(low < high){
			long mid = (low + high) / 2;
			long c = can(mid , A);
			if(c <= M){
				high = mid;
			}else{
				low = mid + 1;
			}
		}
		long c = can(high, A);
		if(c == M){
			System.out.println(solve(high, A));			
		}else{
			long S = solve(high, A);
//			System.out.println(S+" "+c+" "+high);
			S += (high - 1) * (M - c);
			System.out.println(S);
		}
	}
}
