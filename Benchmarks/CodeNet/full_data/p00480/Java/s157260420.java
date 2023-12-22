
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N,ans;
	static int[]num;
	static long[][]dp;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		N=cin.nextInt();
		num=new int[N-1];
		ans=0;
		dp=new long[N-1][21];
		for(int i=0;i<N-1;i++){
			num[i]=cin.nextInt();
			Arrays.fill(dp[i], -1);
		}
		ans=cin.nextInt();
		System.out.println(search(0,0));
	}
	static long search(int a,int b){
		if(b>20||b<0)return 0;
		if(a==N-1){
			if(b==ans){
				return 1;
			}
			return 0;
		}
		if(dp[a][b]!=-1)return dp[a][b];
		long res=0;
		if(a==0&&num[a]==0){
			res+=search(a+1,b+num[a]);	
		}
		else{
			res+=search(a+1,b+num[a]);
			res+=search(a+1,b-num[a]);
		}
		return dp[a][b]=res;
	}
}