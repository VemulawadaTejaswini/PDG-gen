import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	//	static int N;
	//	static int M;
	static boolean flag;
	//static int ans;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();

		int[] X = new int[N];


		for(int i = 0;i < N;i++){
			X[i] = sc.nextInt();
		}



		Arrays.sort(X);
		int max = X[N-1];		//最大値
		int ans =0;


		int num = 0;
		for(int i = 0;i < N-1 ;i++){
			if(X[i] == 0){
				continue;
			}

			//			if(X[i] >= max/2){
			//				System.out.println(i);
			//
			//				break;
			//			}
			int sub = ans;
			ans = Math.max(ans, comb(max,X[i]));
			if(sub != ans){
				num  = X[i];
			}

		}
		System.out.println(max+" "+num);



	}

	static int comb(int n,int r){
		int ue = 1;
		for(int i = 0;i < r;i++){
			ue *= n-i;
		}
		int sita = 1;
		for(int i = 1;i <= r;i++){
			sita *= i;
		}
		return ue/sita;


	}





}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



