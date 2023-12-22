import java.util.Scanner;

public class Main {
	static long f(long A , long B , long x){
		long Ax = A * x;
		long r = Ax / B;
		long Ax2 = A * (x / B);
		long res = r - Ax2;
		return res;
	}
	static long solve(long A , long B , long N){
		long ret = 0;
		long N2 = Math.min(3000000, N);
		for(long x = 0 ; x <= N2 ; ++x){
			long res = f(A , B , x);
			ret = Math.max(ret, res);
		}
		if(N > N2){
			long M = 1000000;
			long x = N2 - 1000000;
			while(f(A , B , x) <= f(A , B, x + M) && x + M <= N){
				ret = Math.max(ret , f(A , B , x + M));
				x += M;
			}
			for( ; x <= Math.min(N, x + M) ; ++x){
				ret = Math.max(ret, f(A , B , x));
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		/*
		for(int A = 1 ; A <= 10 ; ++A){
			for(int B = 1 ; B <= 20 ; ++B){
				solve(A, B , 1);
			}
		}
		*/
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		System.out.println(solve(A, B , N));
	}
}
