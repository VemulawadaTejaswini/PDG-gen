import java.util.Scanner;

public class Main {
	static long solve(long X , long K , long D){
		if(X >= 0){
			long ret = X;
			if(X / D >= K){
				return ret - K * D;
			}
			// X < K * D
			long k = X / D;
			ret = X - k * D;
			K -= k;
			if(k % 2 == 0){
				return ret;
			}else{
				return Math.abs(ret - D);
			}
		}else{
			return solve(- X , K , D);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		System.out.println(solve(X , K , D));
	}

}
