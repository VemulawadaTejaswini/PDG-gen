import java.util.Scanner;

public class Main {
	static long solve(long A , long B , long N){
		long ret = 0;
		long N2 = Math.min(5000000, N);
		for(long x = 0 ; x <= N2 ; ++x){
			long Ax = A * x;
			long r = Ax / B;
			long Ax2 = A * (x / B);
			long res = r - Ax2;
			ret = Math.max(ret, res);
//			System.out.println(x+" "+r+" "+Ax2+" "+(r - Ax2));
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		System.out.println(solve(A, B , N));
	}
}
