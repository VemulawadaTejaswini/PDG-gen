import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Main main=new Main();
		main.run();
	}

	void run() {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int W=sc.nextInt();
		
		int[] value=new int[n];
		int[] weight=new int[n];
		
		for(int i=0;i<n;i++) {
			
			value[i]=sc.nextInt();
			weight[i]=sc.nextInt();
			
		}
		
		//重量は0からWまでだから要素数はW+1個だけある。
		
		int[][] dp=new int[n][W+1];
		
		//dp[i番目までの商品を使う][部分問題のリュックの容量]
		
		//初期条件
		//1個も入れなければ、価値は0のまま。
		for(int w=0;w<=W;++w) {
			dp[0][w]=0;
		}
		
		
		//DPループ
		
		//使えるアイテムの数を増やすループ
		for(int i=0;i<n;i++) {
			
			//リュックの容量を増やすループ
			for(int w=0;w<=W;++w) {
				
				//i番目の商品が、現在のリュックの容量より小さいか
				if(w>=weight[i]) {
					dp[i+1][w]=Math.max(dp[i][w-weight[i]]+value[i],dp[i][w]);
				}else {
					dp[i+1][w]=dp[i][w];
				}
				
			}
		}
		
		
		System.out.println(dp[n][W]);
		

	}

}




