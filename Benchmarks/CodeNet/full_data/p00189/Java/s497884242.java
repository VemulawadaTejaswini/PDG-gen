import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			long[][] dp = new long[n+1][n+1];
			for(int i=0;i<n+1;i++){
				for(int j=0;j<n+1;j++){
					if(i==j){
						dp[i][j] =0;
					}else{
						dp[i][j] = 1000000000;
					}
				}
			}
			int city1,city2, dis;
			int node=0;//ノード数
			int temp_max;
			for(int i=0;i<n;i++){
				city1 = sc.nextInt();
				city2 = sc.nextInt();
				temp_max = Math.max(city1, city2);
				node = Math.max(temp_max, node);
				dis = sc.nextInt();
				dp[city1][city2] = dis;
				dp[city2][city1] = dis;
			}
			node++;//index揃え
			for(int k=0;k<node;k++){
				for(int i=0;i<node;i++){
					for(int j=0;j<node;j++){
						dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k][j]);
					}
				}
			}
			int[] max_dis = new int[node];
			int temp_max_dis=0;
			long temp_min=1000000000;
			int temp_i=0;
			for(int i=0;i<node;i++){
				for(int j=0;j<node;j++){
					temp_max_dis +=dp[i][j];
					//	System.out.print(dp[i][j]+" ");
				}
				max_dis[i] = temp_max_dis;
				if(temp_min==temp_max_dis){
					//同じなら前のインデックス, temp_iを更新しない
				}else{
					temp_min = Math.min(temp_min, temp_max_dis);
					if(temp_min==max_dis[i]) temp_i = i;
				}
				temp_max_dis = 0;
				//System.out.println();
			}
			System.out.println(temp_i+" "+ temp_min);
		}
	}
}