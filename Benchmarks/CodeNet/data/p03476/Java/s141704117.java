import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_2020_0217_002();
	}



	public static void solve_2020_0217_002(){


		int max = 101010;

		//prime number
		boolean[] isPrime = new boolean[max];
		for(int i=2;i<max;i++) isPrime[i] = true;
		for(int i=2; i<max; i++){
			if(!isPrime[i]) continue;
			for(int j=2;j*i<max;j++){
				isPrime[j*i] = false;
			}
		}

		//2017-like number
		int[] isLikeNum = new int[max];
		for(int i=3; i<max; i=i+2){
			if(isPrime[i] && isPrime[(i+1)/2]){
				isLikeNum[i] = 1;
			}
		}

		//cumulative sum
		int[] cs = new int[max];
		for(int i=1;i<max;i++){
			cs[i] = cs[i-1] + isLikeNum[i];
		}

		int Q =sc.nextInt();
		int[] numLikeNumber = new int[Q];

		for(int i=0;i<Q;i++){

			int l = sc.nextInt();
			int r = sc.nextInt();
			numLikeNumber[i] = cs[r]-cs[l-1];
		}

		for(int nLN: numLikeNumber) System.out.println(nLN);
	}
}