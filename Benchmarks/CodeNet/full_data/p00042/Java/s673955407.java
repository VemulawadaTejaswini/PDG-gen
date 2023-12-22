import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while(true){
			int w = sc.nextInt();
			if(w == 0)
				break;
			int n = sc.nextInt();
			int [][] dp = new int[n+1][w+1];
			int [][] data = new int[n+1][2];
			for(int i=1; i < n+1; i++){
				String [] input = sc.next().split(",");
				data[i][0] = Integer.parseInt(input[0]);
				data[i][1] = Integer.parseInt(input[1]);
			}

			for(int i=1; i < n+1; i++){
				for(int j=1;j <= w; j++){
					int index = j - data[i][1];
					if(index < 0){
						dp[i][j] = dp[i-1][j];
					}
					else{
						dp[i][j] = Math.max(dp[i-1][j], dp[i-1][index] + data[i][0]);
					}
				}
			}

			//debug
//			for(int i=0; i < w; i++){
//				System.out.printf("%3d ",i);
//			}
//			System.out.println("");
//			for(int j=0; j < n+1; j++){
//				for(int i=0; i < w; i++){
//					System.out.printf("%3d ", dp[j][i]);
//				}
//				System.out.println("");
//
//			}

			int max = 0;
			int maxIdx = 0;
			for(int i=0; i <= w; i++){
				if(dp[n][i] > max){
					max = dp[n][i];
					maxIdx = i;
				}
			}
			System.out.println("Case " + count++ + ":");
			System.out.println(max);
			System.out.println(maxIdx);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}