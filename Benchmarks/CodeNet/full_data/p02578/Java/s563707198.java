
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		long a[]=new long[n];
		for (int i=0; i<a.length; i++) {
			a[i]=ob.nextLong();
		}
		long sum=0;
		for (int i=0; i<a.length-1; i++) {
			if(a[i]>a[i+1])
			{
			long d=a[i]-a[i+1];
			sum=sum+d;
			a[i+1]=a[i];
			}
		}
		System.out.println(sum);
	}
}
