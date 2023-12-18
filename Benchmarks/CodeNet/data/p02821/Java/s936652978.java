import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	// 幸福度X以上の握手の数
	static long numberOfHandshake(long X , long A[] ){
		int N = A.length;
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			long Y = X - A[i];
			if(A[N - 1] < Y){
				continue;
			}
			if(A[0] >= Y){
				ret += N;
				continue;
			}
			int low = 0; // false
			int high = N - 1; // true
			while(low < high - 1){
				int mid = (low + high) / 2;
				if(A[mid] >= Y){
					high = mid;
				}else{
					low =  mid;
				}
			}
			ret += N - high;
		}
		return ret;
	}
	static long numberOfHandshake2(long X , long A[] ){
		int N = A.length;
		long S = 0;
		for(int i = 0 ; i < N ; ++i){
			long Y = X - A[i];
			for(int j = 0 ; j < N ; ++j){
				if(A[j] >= Y){
					++S;
				}
			}
		}
		return S;
	}

	static long totalHappiness(long X , long A[]){
		int N = A.length;
		long S[] = new long[N + 1];
		for(int i = 0 ; i < N ; ++i){
			S[i + 1] = S[i] + A[i];
		}
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			long Y = X - A[i];
			if(A[N - 1] < Y){
				continue;
			}
			if(A[0] >= Y){
				ret += S[N] + N * A[i];
				continue;
			}
			int low = 0; // false
			int high = N - 1; // true
			while(low < high - 1){
				int mid = (low + high) / 2;
				if(A[mid] >= Y){
					high = mid;
				}else{
					low =  mid;
				}
			}
			ret += S[N] - S[high] + (N - high) * A[i];
		}
		return ret;
	}
	
	static long totalHappiness2(long X , long A[]){
		int N = A.length;
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			long Y = X - A[i];
			for(int j = 0 ; j < N ; ++j){
				if(A[j] >= Y){
					ret += A[i] + A[j];
				}
			}
		}
		return ret;
	}

	static void test(){
		Random rand = new Random();
		for(int rep = 0 ; rep < 1000 ; ++rep){
			int N = rand.nextInt(5) + 1;
			long M = rand.nextInt(N * N) + 1;
			long A[] = new long[N];
			for(int i = 0 ; i < N ; ++i){
				A[i] = rand.nextInt(10) + 1;
			}
			Arrays.sort(A);
			long low = 0;
			long high = A[N -1] * 2 + 1; 
			for(long i = low ; i < high ; i++){
				long n = totalHappiness(i, A);
				long n2 = totalHappiness2(i, A);
				if(n != n2){
					System.out.println(n+" "+n2+" "+i+" "+Arrays.toString(A));
				}
			}
		}
	}
	public static void main(String[] args) {
//		test();
//		System.exit(0);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		long A[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		long low = 0; // true
		long high = A[N - 1] * 2 + 1; // false
		while(low < high){
			long mid = (low + high) / 2;
			long c = numberOfHandshake(mid , A);
			if(c <= M){
				high = mid;
			}else{
				low = mid + 1;
			}
		}
		long c = numberOfHandshake(high, A);
		long h = totalHappiness(high, A);
		if(c != M){
			h += (high - 1) * (M - c);
		}
		System.out.println(h);
	}
}
