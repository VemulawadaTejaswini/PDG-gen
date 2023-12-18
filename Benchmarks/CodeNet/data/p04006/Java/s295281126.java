import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long x=sc.nextLong();
		long[]a=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}
		long sum_time=Integer.MAX_VALUE;
		long[][] b=new long[n][n];
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
			long sum=0;
			for(int i=0;i<n;i++){
				sum+=b[k][i];
			}
			sum+=(long)k*x;
			if(sum<sum_time)sum_time=sum;
		}
		System.out.println(sum_time);
		
	}

}