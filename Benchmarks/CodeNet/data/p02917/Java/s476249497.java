

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n-1];
		for(int i=0;i<n-1;i++)
		{
			ar[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<n-2;i++)
		{
			sum+=Math.min(ar[i],ar[i+1]);
		}
		sum+=ar[0]+ar[n-2];
		System.out.println(sum);
	}
}
