
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long[]x=new long[n];
		long[]y=new long[m];
		for(int i=0;i<n;i++)x[i]=sc.nextLong();
		for(int i=0;i<m;i++)y[i]=sc.nextLong();
		
		long[] minSqare=new long[(n-1)*(m-1)];
		long ans=0;
		long WidthSum=0;
		long HeightSum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i<j){
					WidthSum+=x[j]-x[i];
					WidthSum%=(1000000000+7);
				}
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				if(i<j){
					HeightSum+=y[j]-y[i];
					HeightSum%=(1000000000+7);
				}
			}
		}
		ans=WidthSum*HeightSum;
		ans%=(1000000000+7);
		System.out.println(ans);
	}

}
