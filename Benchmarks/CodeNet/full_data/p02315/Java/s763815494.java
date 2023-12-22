import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Main main=new Main();
		main.run();
	}

	void run() {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int W=sc.nextInt();
		
		int[] value=new int[N];
		int[] weight=new int[N];
		
		for(int i=0;i<N;i++) {
			value[i]=sc.nextInt();
			weight[i]=sc.nextInt();
		}
		
		//dp[i][w]=i番目までのアイテムと重さwのリュックを使った時の価値の最大値
		//dp[0][0]=0;
		
		int[][] dp= new int[N+1][W+1];//0オリジンだから、要素の数はN+1,W+1
		
		//N=3 0,1,2,3
		
		
		//アイテムを一つも使わなければ、価値は0
		for(int w=0;w<W+1;w++) {
			dp[0][w]=0;
		}
		
		
		for(int i=0;i<N;i++) {
			
			for(int w=0;w<W+1;w++) {
				
				//そもそも入る余地があるのかどうか
				if(w>=weight[i]) {
					dp[i+1][w]=Math.max(dp[i][w-weight[i]]+value[i],dp[i][w]);
				}else {
					dp[i+1][w]=dp[i][w];
				}
				
			}
			
		}
		
		System.out.println(dp[N][W]);
		
		sc.close();
		
		
	}
}




