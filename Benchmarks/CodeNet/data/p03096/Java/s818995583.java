
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int input[] = new int[n + 2];
		final int COLOR_MAX = 2_000_01;

		input[0] = COLOR_MAX;
		for(int i = 1; i <= n; i++){
			input[i] = sc.nextInt();
		}
		input[n + 1] = COLOR_MAX;

//		int appear[] = new int[2_00001];

//		Arrays.fill(appear, -1);

		long dp[] = new long[n + 1];
		dp[0] = 1;
//		appear[input[0]]++;
		int mod = 1_000_000_007;
		long sumOfEachColor[] = new long[COLOR_MAX + 1];
		sumOfEachColor[input[1]] = 1;
		for(int i = 1; i <= n; i++){
//			for(int j = 1; j <= i; j++){
//				if(input[i] == input[j] && input[i] != input[j - 1]){
//					dp[i] += dp[j - 1];
//				}
//			}
			dp[i] = sumOfEachColor[input[i]];


			if(input[i] != input[i + 1]){
				sumOfEachColor[input[i + 1]] += dp[i];
				sumOfEachColor[input[i + 1]] %= mod;
			}

//			dp[i] += sumOfEachColor[input[i - 1]];

//			System.out.println("i = "+i+" dp[i] = "+dp[i]);

//			for(int j = 0; j < 10; j++){
//				System.out.print(sumOfEachColor[j]+" ");
//			}
//			System.out.println();
		}

		System.out.println(dp[n]);
	}
}
