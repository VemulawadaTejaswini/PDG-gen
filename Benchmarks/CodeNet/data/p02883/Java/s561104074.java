import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static boolean can(long A[] , long F[] , long val , long K){
		int N = A.length;
		long req[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			req[N - 1 - i] = val / F[i];
		}
		long r = 0;
		for(int i = 0 ; i < N ; ++i){
			if(req[i] >= A[i]){
			}else{
				r += A[i] - req[i];
			}
		}
		return r <= K;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long A[] = new long[N];
		long F[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
		}
		for(int i = 0 ; i < N ; ++i){
			F[i] = sc.nextLong();
		}
		Arrays.sort(A);
		Arrays.sort(F);
		long high = A[N - 1] * F[N - 1];
		long low = 0;
		if(can(A, F , low , K)){
			System.out.println(low);
		}else{
			while(low < high){
				long mid = low + (high - low) / 2;
				if(can(A, F , mid , K)){
					high = mid;
				}else{
					low = mid + 1;
				}
			}
			System.out.println(low);
		}
	}
}
