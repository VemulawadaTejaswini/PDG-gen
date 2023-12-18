import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long a[]=new long[n];
		long sum[][]=new long[n][n];
		int count=0;
		long all[]=new long[n*(n+1)/2];
		for(int i=0;i<n;++i) {
			a[i]=sc.nextLong();
			all[count]=a[i];
			++count;
		}
		

		for(int i=0;i<n-1;++i) {
			for(int j=i+1;j<n;++j) {
				if(j==i+1)sum[i][j]=a[i]+a[j];
				else sum[i][j]=sum[i][j-1]+a[j];
				all[count]=sum[i][j];
				++count;
				
			}
			
			
		}
		Arrays.sort(all);
		long ans=all[count-1];
		for(int i=1;i<k;++i) {
			ans=ans&all[count-1-i];
		}
		System.out.println(ans);
	}
}