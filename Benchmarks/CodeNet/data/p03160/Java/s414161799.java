
import java.util.Scanner;


public class Main {
	static int N,ans;
	static int[] S;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 N = sc.nextInt();
			 S = new int[N];

			 for(int i = 0 ; i < N ; i++){
				 S[i] = sc.nextInt();
			 }
		sc.close();

		System.out.println(dp(S,N));


	}

	static int dp(int[] S,int N){
		if(N==2){
			return Math.abs(S[1] - S[0]);
		}
		if(N==1){
			return 0;
		}
		else{
			ans = Math.min(Math.abs(S[N-1]-S[N-2]) +dp(S,N-1),Math.abs(S[N-1]-S[N-3])+dp(S,N-2));
		return ans;
		}
	}

}


