import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[]a=new int[n];
		int max=0;
		int[] sum_a=new int[n];
		int[] sum_b=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(i==0){
				sum_a[i]=a[i];
				sum_b[i]=Math.max(0, a[i]);
			}else{
				sum_a[i]=sum_a[i-1]+a[i];
				sum_b[i]=sum_b[i-1]+Math.max(0, a[i]);
			}
		}
		int ans=0;
		for(int i=0;i<=n-k;i++){
			int sum=0;
			sum+=sum_a[i+k-1]-sum_a[i];
			if(i>0)sum+=sum_b[i-1];
			sum+=sum_b[n-1]-sum_b[i+k-1];
			
			ans=Math.max(sum, ans);
		}
		System.out.println(ans);
	}
	
}