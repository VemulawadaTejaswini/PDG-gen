import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int lcs(String left,String right){

		int left_len = left.length();
		int right_len = right.length();

		int dp[][] = new int[left_len+1][right_len+1];

		for(int i = 0; i <= left_len; i++){
			for(int k = 0; k <= right_len; k++){
				dp[i][k] = 0;
			}
		}

		for(int i = 0; i < left_len; i++){
			for(int k = 0; k < right_len; k++){
				if(left.charAt(i) == right.charAt(k)){
					dp[i+1][k+1] = dp[i][k]+1;
				}else{
					dp[i+1][k+1] = Math.max(dp[i+1][k], dp[i][k+1]);
				}
			}
		}

		return dp[left_len][right_len];
	}

	public static void main(String args[]){

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 try{

			int N = Integer.parseInt(br.readLine());

			String left,right;

			for(int i = 0; i < N; i++){
				left = br.readLine();
				right = br.readLine();

				System.out.printf("%d\n", lcs(left,right));
			}

		 }catch(IOException ex){
			 ex.printStackTrace();
		 }
	}
}