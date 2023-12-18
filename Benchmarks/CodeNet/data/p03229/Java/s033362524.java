import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;++i){
			a[i]=sc.nextLong();
		}

		Arrays.sort(a);
		long amin[]=new long[n-n/2 +1];
		long amax[]=new long[n/2 +1];
		long sum=0;
		long sum2=0;

		for(int i=0;i<n;++i){
			if(i<n-n/2) {amin[i]=a[i]; sum=sum-2*a[i];}
			else {amax[i-n+n/2]=a[i]; sum=sum+2*a[i];}
		}



		if(n%2==0)sum=sum-amax[0]+amin[n-n/2-1];
		else sum=sum+amin[n-n/2-1]+amin[n-n/2-2];



		for(int i=0;i<n;++i){
			if(i<n/2) {amin[i]=a[i]; sum2=sum2-2*a[i];}
			else {amax[i-n/2]=a[i]; sum2=sum2+2*a[i];}
		}



		if(n%2==0)sum2=sum2-amax[0]+amin[n/2-1];
		else sum2=sum2-amax[0]-amax[1];


		System.out.println(Math.max(sum, sum2));


	}
}