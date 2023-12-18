import java.util.*;

public class Main{
	public static int ans=0;
	static int n;
	static int[] A;
	public static int flg=0;

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		A=new int[n];
		for(int i=0;i<n;i++) A[i]=sc.nextInt();

		System.out.println(dfs(0,0));
	}

	public static int dfs(int i,int sum){
		if(sum==0 && flg==1) ans++;
		if(i==n){
			if(sum==0) return ans;
		}
		if(i<n && flg!=1){
			dfs(i+1,sum);
		}
		if(i<n){
			flg=1;
			dfs(i+1,sum+A[i]);
			if(A[i]==0) ans++;
		}
		return ans;
	};
}