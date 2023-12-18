

import java.util.Scanner;

public class Main {

	public static  void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		String S=scan.next();
		
		int head[]=new int[n+1];
		int count=1;
		for(int i=1;i<n;i++)
		{
			if(S.charAt(i-1)!=S.charAt(i))
			{
				head[count++]=i;
			}
		}
		head[count]=n;
		int max=1;
		for(int i=0;i<count;i++)
		{
			boolean zero=S.charAt(head[i])=='0';
			int last=Math.min(i+k*2+(zero?0:1),count);
			int sum=head[last]-head[i];
			max=Math.max(max, sum);
		}
		System.out.println(max);
	}
}
