import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int sum_time=Integer.MAX_VALUE;
		int[][] b=new int[n][n];
		for(int i=0;i<n;i++){
			b[0][i]=a[i];
		}
		
		for(int k=0;k<n;k++){
			if(k!=0){
			for(int i=0;i<n;i++){
				int pre=0;
				if(i-k<0)pre=i-k+n;
				else pre=i-k;
				
				b[k][i]=Math.min(b[k-1][i], a[pre]);
			}
			}
			int sum=0;
			for(int i=0;i<n;i++){
				sum+=b[k][i];
			}
			sum+=k*x;
			if(sum<sum_time)sum_time=sum;
		}
		System.out.println(sum_time);
		
	}

}