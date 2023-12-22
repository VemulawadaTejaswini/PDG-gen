import java.util.Scanner;

public class Main {
	static long[] calcLoopNum(long X , long M){
		long sum = 0;
		int vis[] = new int[(int)M + 1];
		int ln = 0;
		while(vis[(int)X] != 1){
			++ln;
			sum += X;
			vis[(int)X] = 1;
			X = (X * X) % M;
		}
		return new long[]{ln, sum};
	}
	static long solve(long N , long X , long M){
		if(N <= 2 * M){
			long ret = 0;
			for(int i = 0 ; i < N ; ++i){
				ret += X;
				X = (X * X) % M;
			}
			return ret;
		}
		long ret = 0;
		int vis[] = new int[(int)M + 1];
		long n = 0;
		while(vis[(int)X] != 1){
			++n;
			ret += X;
			vis[(int)X] = 1;
			X = (X * X) % M;
		}
		N -= n;
		long loop[] = calcLoopNum(X, M);
//		System.out.println(N+" "+ret+" "+X+" "+loop[0]+" "+loop[1]);
		ret += loop[1] * (N / loop[0]);
		N -= loop[0] * (N / loop[0]);
//		System.out.println(N+" "+ret+" "+X+" "+loop[0]+" "+loop[1]);
		ret += solve(N , X , M);
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long X = sc.nextLong();
		long M = sc.nextLong();
		long r = solve(N , X , M);
		System.out.println(r);
	}
}
