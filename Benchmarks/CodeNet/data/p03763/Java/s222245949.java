import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		long[] x = new long[n];
		long[] y=new long[m];
		long[] xl=new long[n-1];
		long[] yl=new long[m-1];


		for(int i=0;i<n;i++){
			x[i]=scan.nextInt();
		}
		Arrays.sort(x);
		for(int i=0;i<n-1;i++){
			xl[i]=x[i+1]-x[i];
		}
		for(int i=0;i<m;i++){
			y[i]=scan.nextInt();
		}
		Arrays.sort(y);
		for(int i=0;i<m-1;i++){
			yl[i]=y[i+1]-y[i];
		}


		long sum=0;
		long ans=0;

		for(int i=0;i<n-1;i++){
			for(int j=0;j<m-1;j++){
				sum=((xl[i]%1000000007)*(yl[j]%1000000007))%1000000007*(i+1)*(j+1)*(n-i-1)*(m-j-1)%(1000000007);
				ans=(ans+sum)%(1000000007);
			}
		}


		System.out.println(ans);
	}

}
