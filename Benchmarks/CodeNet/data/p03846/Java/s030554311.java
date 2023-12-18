import java.util.Arrays;
import java.util.Scanner;

class Main{
	static long mod=1000000007; // 10e9 + 7
	static long pow(long a, long x){
		if(x == 1) return a % mod;
		else if(x % 2 == 0) return pow((a * a) % mod, x / 2) % mod;
		else return (a * pow((a * a) % mod, x / 2)) % mod;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		if(N % 2 == 0) {
			for(int i = 0; i + 1 < N; i += 2) {
				B[i] = i + 1; B[i + 1] = i + 1;
			}
		}else {
			B[0] = 0;
			for(int i = 1; i + 1 < N; i += 2) {
				B[i] = i + 1; B[i + 1] = i + 1;
			}
		}
		Arrays.sort(A);
		boolean check = true;
		long ans = pow(2, (long)(N / 2), mod);
		for(int i = 0; i < N; i++) if(B[i] != A[i]) check = false;

		System.out.println(check ? ans : 0);

	}
}