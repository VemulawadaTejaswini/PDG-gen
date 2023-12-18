import java.util.Arrays;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();

		int[] X = new int[N];


		for(int i = 0;i < N;i++){
			X[i] = sc.nextInt();
		}

		Arrays.sort(X);
		int max = X[N-1];		//最大値

		int key = (max+1)/2;
		int ans = 0;
		for(int i = 0;i < N-1 ;i++){
			if(Math.abs(key-ans) > Math.abs(key-X[i])){
				ans =X[i];
			}

		}
		System.out.println(max+" "+ans);



	}

	static long comb(int n,int r){
		long ue = 1;
		for(int i = 0;i < r;i++){
			ue *= n-i;
		}
		long sita = 1;
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



