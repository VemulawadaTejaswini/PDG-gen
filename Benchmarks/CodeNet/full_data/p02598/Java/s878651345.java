import java.util.Scanner;

public class Main {
	static long solve(long K , long A[]){
		long low = 0;
		long high = 0;
		for(long a : A)high = Math.max(a, high);
		while(high - low > 1){
			long mid = (high + low) / 2;
			long X = 0;
			for(long a : A){
				long n = ((a + mid - 1) / mid);
				X += n - 1;
			}
			if(X > K){
				low = mid;
			}else{
				high = mid;
			}
		}
		if(low % 2 == 1){
			return high / 2;
		}else{
			boolean f = false;
//			System.out.println(low+" "+high);
			for(long a : A){
				if(a >= high && a % high == 0){
					f = true;
				}
			}
			if(f){
				return high / 2 + 1;
			}else{
				return high / 2;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong() * 2;			
		}
		System.out.println(solve(K , A));
	}
}
