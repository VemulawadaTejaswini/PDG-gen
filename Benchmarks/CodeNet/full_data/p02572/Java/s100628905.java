import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			long mod = 1000000000+7;

			long goukei = 0;


			int N = scan.nextInt();
			long[]A = new long[N];
			long[]S = new long [N+1];
			long[]p = new long[N+1];
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextLong();
				S[i+1] = S[i]+A[i];
			}

			for(int i = N-1;i>0;i--) {
				p[i] = (p[i+1]+A[i])%mod;
			}


			for(int i = 0;i<N-1;i++) {
				goukei=(goukei+(A[i]*p[i+1])%mod)%mod;
			}

			System.out.println(goukei);


		}


	}


}
