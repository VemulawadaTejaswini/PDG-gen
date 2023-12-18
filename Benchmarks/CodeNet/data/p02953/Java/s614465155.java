

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int h[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			h[i]=scan.nextInt();
		}
		h[0]=0;
		for(int i=1;i<=n;i++)
		{
			if(h[i]>h[i-1]) {
				h[i]--;
			}
		}
		for(int i=1;i<=n;i++)
		{
		if(h[i]>=h[i-1])
		{
			
		}else {
//			System.out.println(i);
			System.out.println("No");
			return;
		}
		}
		System.out.println("Yes");
	}
}
