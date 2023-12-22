import java.util.Scanner;

//Controlled Tournament
public class Main{

//	@SuppressWarnings("unchecked")
	void run(){
		int[] f = new int[17];
		for(int i=1;i<17;i++){
			int x = i;
			while(1 < x){
				f[i]++;
				x = x/2+x%2;
			}
		}
//		Set<Integer>[][] set = new Set[16][5];
//		for(int i=0;i<16;i++)for(int j=0;j<5;j++)set[i][j]=new HashSet<Integer>();
//		for(int N=0;N<16;N++){
//			for(int S=1;S<1<<N;S++)set[N][f[Integer.bitCount(S)]].add(S);
//		}
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), M = sc.nextInt();
			if((n|M)==0)break;
			M--;
			int[][] r = new int[n][n];
			for(int i=0;i<n;i++)for(int j=0;j<n;j++)r[i][j]=sc.nextInt();
			long[][] dp = new long[n][1<<n];
			for(int S=1;S<1<<n;S++)for(int p=0;p<n;p++)if(((S>>p)&1)>0){
				int N = Integer.bitCount(S);
				if(N==1){
					dp[p][S] = 1; continue;
				}
				for(int div=1;div<1<<n;div++)if((S&div)==div && ((div>>p)&1)>0){
					int sub = S-div;
					if(f[N]-1!=Math.max(f[Integer.bitCount(div)], f[Integer.bitCount(sub)]))continue;
					for(int j=0;j<n;j++)if(((sub>>j)&1)>0 && r[p][j]==1){
						dp[p][S]+=dp[p][div]*dp[j][sub];
					}
				}
			}
			System.out.println(dp[M][(1<<n)-1]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}