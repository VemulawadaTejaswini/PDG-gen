import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Bingo
public class Main{

	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		int MOD = 100000;
		Set<int[]>[] input = new Set[50];
		for(int i=0;i<50;i++)input[i] = new HashSet<int[]>();
		int Q = 0;
		for(;;Q++){
			int N = sc.nextInt(), M = sc.nextInt(), S = sc.nextInt();
			if((N|M|S)==0)break;
			input[N*N].add(new int[]{Q, M, S});
		}
		int[] res = new int[Q];
		int[][][] dp = new int[2][2001][3001];
		int X = 1;
		for(int x=1;x<50;x++,X=1-X){
			for(int m=1;m<=2000;m++)for(int s=1;s<=3000;s++){
				dp[X][m][s] = 0;
				if(x==1){
					if(s<=m)dp[X][m][s]++;
				}
				else{
					dp[X][m][s]+=dp[X][m-1][s];
					if(s-m>=0)dp[X][m][s]+=dp[1-X][m-1][s-m];
				}
				if(MOD<=dp[X][m][s])dp[X][m][s]-=MOD;
			}
			for(int[]a:input[x]){
				res[a[0]] = dp[X][a[1]][a[2]];
			}
		}
		for(int r:res)System.out.println(r);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}