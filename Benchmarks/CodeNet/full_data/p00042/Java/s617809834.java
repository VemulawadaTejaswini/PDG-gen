import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = 0;
		while(sc.hasNext()){
			caseNum++;
			int w = sc.nextInt();
			if(w == 0) break;
			int n = sc.nextInt();
			int[] kati = new int[n];
			int[] weight = new int[n];
			int[][] dp = new int[n+1][w+2];
			String read;
			String[] read2;
			for(int i= 0; i < n; i++){
				read = sc.next();
				read2 = read.split(",");
				kati[i] = Integer.parseInt(read2[0]);
				weight[i] = Integer.parseInt(read2[1]);
			}
			for(int i = 0; i < n; i++){
				for(int j = 0; j < w; j++){
					if(j < weight[i]) dp[i+1][j] = dp[i][j];
					else dp[i+1][j]=Math.max(dp[i][j], dp[i][j-weight[i]] + kati[i]);
				}
			}
			int max = dp[n][w];
			int sumWeight = 0;
			for(int j = 0; j < w; j++){
				if(dp[n][j] >= max){
					sumWeight = j;
					break;
				}
			}
			System.out.println("Case " + caseNum + ":\n" + max);
			System.out.println(sumWeight);
		}
	}
}