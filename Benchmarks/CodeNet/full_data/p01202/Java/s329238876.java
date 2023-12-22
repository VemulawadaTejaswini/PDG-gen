import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		while(N-->0)
		{
			char c[]=in.next().toCharArray();
			boolean judge=true;
			char now=c[0];
			int cnt=1;
			for(int i=0;i<c.length;i++)//left start
			{
				if(cnt%2!=0&&c[i]=='R')
					judge=false;
				if(cnt%2==0&&c[i]=='L')
					judge=false;
				if(i+1<c.length&&now==c[i+1])
					judge=false;
				if(i+1<c.length)
					now=c[i+1];
				cnt++;
			}
			cnt=1;
			if(judge)
				System.out.println("Yes");
			else
			{
				judge=true;
				now=c[0];
				for(int i=0;i<c.length;i++)//right start
				{
					if(cnt%2!=0&&c[i]=='L')
						judge=false;
					if(cnt%2==0&&c[i]=='R')
						judge=false;
					if(i+1<c.length&&now==c[i+1])
						judge=false;
					if(i+1<c.length)
						now=c[i+1];
					cnt++;
				}
				System.out.println(judge ? "Yes":"No");
			}
		}
	}
}