import java.util.ArrayList;
import java.util.Scanner;
 class Main
{
	public static void main (String[] args)
	 {
		Scanner sc=new Scanner(System.in); 
		int i,j;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int sn[]=new int[n+1];
		for(i=0;i<k;i++)
		{
			int d=sc.nextInt();
			for( j=0;j<d;j++)
			{
				sn[sc.nextInt()]=1;
			}
		}
		int count=0;
		for(i=1;i<=n;i++)
			if(sn[i]==0)
				count++;
		System.out.println(count);
		
			
	}
}