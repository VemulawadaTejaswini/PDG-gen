import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);
			
			if(n == 0 && m == 0){
				break;
			}
			
			int[] code = new int[m];
			
			for(int i = 0; i < m; i++){
				code[i] = Integer.parseInt(br.readLine());
			}
			
			int[] signal = new int[n];
			
			for(int i = 0; i < n; i++){
				signal[i] = Integer.parseInt(br.readLine());
			}
			
			int[][] dp = new int[256][n + 1];
			//init
			for(int i = 0; i <= 255; i++){
				Arrays.fill(dp[i], Integer.MAX_VALUE);
			}
			
			//1つ目のシグナルについて初期化
			dp[128][0] = 0;
			
			for(int i = 1; i <= n; i++){
				for(int j = 0; j <= 255; j++){
					if(dp[j][i - 1] == Integer.MAX_VALUE){
						continue;
					}
					
					for(int k = 0; k < m ; k++){
//						System.out.println(i+" "+j+" "+k);
						int tmpValue = Math.min(255, Math.max(0, j + code[k]));
//						System.out.println("new signal "+ tmpValue);
						dp[tmpValue][i] = Math.min(dp[tmpValue][i], dp[j][i - 1] + (int)Math.pow((tmpValue - signal[i - 1]), 2));
					}
				}
			}
			//debug
			
//			for(int i = 1; i <= n; i++){
//				int tmp = Integer.MAX_VALUE;
//				for(int j = 0; j <= 255; j++){
//					tmp = Math.min(tmp, dp[j][i]);
//				}
//				
//				System.out.print(tmp+" ");
//			}
//			System.out.println();
			
			int result = Integer.MAX_VALUE;
			
			for(int i = 0; i <= 255 ; i++){
				result = Math.min(result, dp[i][n]);
//				System.out.println("i = "+i+" dp = "+dp[i][n]);
			}
			
			System.out.println(result);
		}
	}

}

