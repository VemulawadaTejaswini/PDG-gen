import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int [][] data = new int[100][50];
		int k = 0;
		int w = 0;
		while(sc.hasNext()){
			String [] str = sc.next().split(",");
			int len = str.length;
			w = Math.max(w, len);
			for(int i=0; i < len; i++){
				data[k][i] = Integer.parseInt(str[i]);
			}
			k++;
		}
		int h = w * 2 - 1;
		int [][] dp = new int[h][w];
		dp[0][0] = data[0][0];
		for(int i=0; i < w - 1; i++){
			for(int j=0; j <= i; j++){
				int result = dp[i][j] + data[i+1][j];
				dp[i+1][j] = Math.max(result, dp[i+1][j]);

				result = dp[i][j] + data[i+1][j+1];
				dp[i+1][j+1] = Math.max(result, dp[i+1][j+1]);
			}
		}

		for(int i=w; i < h; i++){
			for(int j=0; j < h - i; j++){
				dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j+1]) + data[i][j];

			}
		}
		System.out.println(dp[h-1][0]);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}