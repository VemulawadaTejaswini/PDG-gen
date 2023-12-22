import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int min;
	static int MAX=1000000;
	static int dp[]=new int[MAX];
	static int dp2[]=new int[MAX];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		Arrays.fill(dp, -1);
		Arrays.fill(dp2, -1);
		for(i=0;i<MAX;i++){
			min=1<<29;
			serch(i);
			min=1<<29;
			serch2(i);
		}
		while(true){
		n=sc.nextInt();
		if(n==0) break;
		System.out.println(dp[n]+" "+dp2[n]);
		}
	}
	static int serch(int N){
		int k;
		if(dp[N]!=-1) return dp[N];
		if(N==0){
			return 0;
		}
		for(int i=1;;i++){
			k=i*(i+1)*(i+2)/6;
			if(N<k) break;
			min=Math.min(min, serch(N-k)+1);
		}
		dp[N]=min;
		return min;
	}
	static int serch2(int N){
		int k;
		if(dp2[N]!=-1) return dp2[N];
		if(N==0){
			return 0;
		}
		for(int i=1;;i++){
			k=i*(i+1)*(i+2)/6;
			if(k%2==0) continue;
			if(N<k) break;
			min=Math.min(min, serch2(N-k)+1);
		}
		dp2[N]=min;
		return min;
	}

}