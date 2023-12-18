import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		long x=sc.nextLong();
		long a[]=new long[n];
		long sum;
		int counter=0;


		for (int i=0;i<n;++i){
			a[i]=sc.nextInt();
		}

		Arrays.sort(a);
		sum=0;

		for (int i=0;i<n && sum<=x;++i){
			sum=sum+a[i];
			++counter;
		}

		if (sum<=x) System.out.println(counter);
		else System.out.println(counter-1);


	}
}