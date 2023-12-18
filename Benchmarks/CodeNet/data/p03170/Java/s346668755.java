import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int[][] dp;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int k =sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int[] dp = new int[k+1];				//dp[i] = kがiの時の勝者
		for(int  i = 0;i <= k;i++){
			if(i < a[0]){
				dp[i] = 2;
			}else{
				int sub = 0;
				for(int j = 0;j < N;j++){
					if(i - a[j] >= 0){
						if(dp[i-a[j]] == 2){
							sub = 1;
							break;
						}
					}
				}
				if(sub == 1){
					dp[i] = 1;
				}else{
					dp[i] = 2;
				}

			}
		}
		if(dp[k] == 1){
			System.out.println("First");
		}else{
			System.out.println("Second");

		}


	}


}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

