import java.util.Scanner;

public class Main {
	static long solve(long A0 , long A1, long A2){
		for(long i = 0 ; i < A0 ; ++i){
			long a0 = A0 - i;
			long a1 = A1 + i;
			if((a0 ^ a1) == A2){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
		}
		if(N >= 3){
			long xor = A[2];
			for(int i = 3 ; i < N ; ++i){
				xor ^= A[i];
			}
			System.out.println(solve(A[0] , A[1] , xor));
		}else{
			System.out.println(solve(A[0] , A[1] , 0));			
		}
	}
}
