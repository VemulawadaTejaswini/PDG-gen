import java.util.Arrays;
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
		int[] b=new int[n];
		Arrays.fill(b,Integer.MAX_VALUE);
		
		for(int k=0;k<n;k++){
			for(int i=0;i<n;i++){
				for(int j=0;j<=k;j++){
					if(i-j<0){
						b[i]=Math.min(b[i], a[i-j+n]);
					}else{
						b[i]=Math.min(b[i], a[i-j]);
					}
				}
			}
			int sum=0;
			for(int i=0;i<n;i++){
				sum+=b[i];
			}
			sum+=k*x;
			if(sum<sum_time)sum_time=sum;
		}
		System.out.println(sum_time);
		
	}

}