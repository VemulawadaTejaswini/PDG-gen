import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int ans = 0;

		if(K == 0){
			System.out.println(N*N);
		}else{

			for(long b = K+1;b <= N;b++){


				long p = N /b;
				long r = N - p*b;
				ans += p * Math.max(0, b-K);
				ans += Math.max(0, r-K+1);




			}
			System.out.println(ans);


		}
	}






}
