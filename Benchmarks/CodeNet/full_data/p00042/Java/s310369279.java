import java.util.Arrays;
import java.util.Scanner;


public class Main {
	Scanner sc;
	int[] value,weight;
	int[][] dp;
	int N,W;
	
	int max(int a,int b){
		return a>=b?a:b;
	}
	
	int dfs(int n,int w){
		if(dp[n][w]>=0){
			return dp[n][w];
		}
		
		int res;
		if(n==N){
			res=0;
		}
		else if(w-weight[n]<0){
			res=dfs(n+1,w);
		}
		else{
			res=max(dfs(n+1,w),dfs(n+1,w-weight[n])+value[n]);
		}
		return dp[n][w]=res;
	}

	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in).useDelimiter(",|\r\n|\n");
		int k=0;
		while((W=ni())!=0){
			++k;
			N=ni();
			dp=new int[N+1][W+1];
			for(int[]r:dp)Arrays.fill(r,-1);
			value=new int[N];weight=new int[N];
			
			for(int i=0;i<N;++i){
				value[i]=ni();
				weight[i]=ni();
			}
			
			int maxvalue=0,maxweight=0;
			for(int w=0;w<=W;++w){
				int res;
				if(maxvalue<(res=dfs(0,w))){
					maxvalue=res;
					maxweight=w;
				}
			}
			System.out.println("Case "+k+":");
			System.out.println(maxvalue);
			System.out.println(maxweight);
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}