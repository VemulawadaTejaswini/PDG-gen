import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String in =scan.next();
		char[] data=in.toCharArray();
		int ans=0;
		int n =data.length;
		for(int i=0;i<n/2;i++)
		{
			if(data[i]==data[n-1-i])
			{
				
			}
			else
			{
				ans=1;
			}
		}
		if(ans==1)
		{
			System.out.println("No");
		}
		else
		{
			for(int i =0;i<((n-1)/2)/2;i++)
			{
				if(data[i]==data[(n-1)/2-1-i])
				{
					
				}
				else
				{
					ans=1;
				}
			}
			if(ans==1)
			{
				System.out.println("No");
			}
			else
			{
				for(int i =(n+3)/2-1;i<(n-((n+3)/2-1))/2;i++)
				{
					if(data[i]==data[n-i])
					{
						
					}
					else
					{
						ans=1;
					}
				}
				if(ans==1)
				{
					System.out.println("No");
				}
				else
				{
					System.out.println("Yes");
				}
			}
		}
	}
}
