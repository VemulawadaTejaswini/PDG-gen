import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		String words[] = new String[n];
		for(int i=0;i<n;i++)
			words[i]=sc.next();
		int flag=0;
		/*String aa ="aaj";
		System.out.println(words[1].matches(aa));*/
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(words[i].matches(words[j]))
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		{
			for(int i=1;i<n;i++)
			{
				if((words[i-1].charAt(words[i-1].length()-1))==(words[i].charAt(0)))
				{
					
				}
				else
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
