import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int[][] box=new int[b][2];
		for(int i=0;i<b;i++)
		{
			box[i][0]=sc.nextInt();
			box[i][1]=sc.nextInt();
		}
		
		int count=0,
			ans=1;
			
		for(int i=0;i<b;i++)
		{
			if(count==box[i][0])
			{
				ans++;
			}
			else
			{
				count=box[i][0];
			}
		}
		if(ans==1)
			System.out.println(b);
		else
			System.out.println(b-(ans+1));	
	}
}