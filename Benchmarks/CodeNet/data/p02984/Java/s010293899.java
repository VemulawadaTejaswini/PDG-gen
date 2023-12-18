import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		long MOD=1000000007L;

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();

		long a[]=new long[n];
		long sum=0L;

		for(int i=0;i<n;++i){
			a[i]=sc.nextLong();
			if(i%2==0)sum=sum+a[i];
			else sum=sum-a[i];

		}

		long a1=sum;

		System.out.print(a1+" ");
		for(int i=0;i<n-2;++i){
			long a2=2*a[i]-a1;
			System.out.print(a2+" ");
			a1=a2;
		}
		System.out.println(2*a[n-2]-a1);

	}
}