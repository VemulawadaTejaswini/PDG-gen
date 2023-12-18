import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int n,k;
	Integer[]a;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		a=new Integer[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a, Comparator.reverseOrder());
		
		int need=0;
		
		//dp[x][y]:=x枚目までで和yを作れるか
		for(int i=0;i<n;i++){
			if(a[i]>k){
				need++;
				continue;
			}
			int idx=0;
			
			boolean[][]dp=new boolean[n][k];
			for(int j=0;j<n;j++){
				dp[j][0]=true;
			}
			
			for(int j=1;j<n;j++){
				if(idx==i)idx++;
				
				for(int sum=0;sum<k;sum++){
					if(dp[j-1][sum]){
						dp[j][sum]=true;
						if(sum+a[idx]<k){
							dp[j][sum+a[idx]]=true;
						}
					}
				}
				idx++;
			}
			
			for(int sum=k-a[i];sum<k;sum++){
				if(dp[n-1][sum]){
					need++;
					System.out.println(n-i-2);
					return;
				}
			}
		}
		System.out.println(n-need);
		
	}
}