

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n+3];
		for(int i=1;i<=n;i++)
		{
			ar[i]=scan.nextInt();
		}
		int totwork=0;
		for(int i=1;i<=n;i++)
		{
			totwork+=Math.abs(ar[i]-ar[i-1]);
			
		}
		totwork+=Math.abs(ar[n]);
		System.out.println(totwork);
		for(int i=1;i<n;i++)
		{
			//exclude i
			int foo=Math.abs(ar[i]-ar[i+1])+Math.abs(ar[i+1]-ar[i+2]);
			int gg=Math.abs(ar[i+2]-ar[i]);
			System.out.println(totwork-foo+gg);
		}
			
		}
	}

