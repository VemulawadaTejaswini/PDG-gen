import java.util.Scanner;

public class Main {
	static int n;
	static int[][] bridge;
	
	static int dfs(int now) {//1から葉の親までのcostの最大のものをみつける
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(bridge[now][i]<=0) continue;
			bridge[i][now]=0;
			sum=Math.max(sum, dfs(i)+bridge[now][i]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				n=sc.nextInt();
				if(n==0) break;
				bridge=new int[n+1][n+1];
				int sum=0;
				for(int i=1; i<n; i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					int t=sc.nextInt();
					bridge[a][b]=bridge[b][a]=t;
					sum+=t*2;//全部の往復を足す
				}
				for(int i=2; i<=n; i++) {
					int count=0, now=0;
					for(int j=1; j<=n; j++) {
						if(bridge[i][j]>0 || bridge[i][j]==-1) {
							count++;
							now=j;
						}
					}
					if(count!=1) continue;
					sum-=2*bridge[i][now];//葉の島へかかる分は引く(i:葉の島 now:その親のときcount=1)
					bridge[i][now]=bridge[now][i]=-1;
				}
				System.out.println(sum-dfs(1));//sumから最大のcostのものひけばいい
			}

		}
	}
}
