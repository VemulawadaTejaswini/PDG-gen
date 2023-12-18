import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n = Integer.parseInt(br.readLine());

		int[] input = new int[n];


		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(br.readLine());
		}


		System.out.println(n - gradLTS(input));


	}

//	static int gradLTS(int array[]){
//		int n = array.length;
//
//		int[] dp = new int[n];
//
//		int result = 0;
//		for(int i = 0; i < n ; i++){
//			dp[i] = 1;
//			for(int j = 0; j < i ; j++){
//				if(array[j]+1 == array[i] ){
//					dp[i] = Math.max(dp[i], dp[j] + 1);
//				}
//			}
//
//			result = Math.max(result, dp[i]);
////			System.out.println("dp["+i+"] = "+dp[i]);
//		}
//
//		return result;
//
//	}

	static int gradLTS(int array[]){
		int n = array.length;

		int[] dp = new int[n + 1];
		int[] index = new int[n + 1];

		Arrays.fill(dp, Integer.MAX_VALUE);
		Arrays.fill(index, -1);

		for(int i = 0; i < n; i++){

//			int tmpIndex = Arrays.binarySearch(dp, array[i] - 1);
			int tmpIndex = index[array[i] - 1];

//			System.out.println("index of "+(array[i] - 1)+ " is "+tmpIndex);
			if(tmpIndex >= 0){
				dp[tmpIndex] = array[i];
				index[array[i]] = tmpIndex;
			}
			else {
				dp[array[i]] = array[i];
				index[array[i]] = array[i];
			}

			//debug
//			for(int j = 1; j <= n; j++){
//				System.out.print(dp[j]+" ");
//			}
//			System.out.println();
		}

		int result = 0;

		for(int i = 1; i <= n; i++){
//			System.out.println("from "+i+" to "+dp[i]);
			if(dp[i] != Integer.MAX_VALUE){
				result = Math.max(result, dp[i] - i + 1);
			}
		}

		return result;
	}


}
