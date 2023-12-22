import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		while(N-->0)
		{
			int m=in.nextInt();
			int n=in.nextInt();
			Ginko gi=new Ginko(m, n);
			
			boolean flg=true;
			for(int i=0;i<150;i++)
			{
				for(int j=0;j<150;j++)
				{
					if(i*i+j*j>gi.m*gi.m+gi.n*gi.n || i*i+j*j==0)
						continue;
					
					if(check(i, j, gi)||check(i, -j, gi)||check(-i, j, gi)||check(-i, -j, gi))
					{
						flg=false;
						break;
					}
				}
				if(!flg)
					break;
			}
			System.out.println(flg ? "P":"C");
		}
	}
	static boolean check(int m, int n, Ginko in)
	{
		if(m==1&&n==0||
			m==0&&n==1||
			m==-1&&n==0||
			m==0&&n==-1||
			m==in.m&&n==in.n||
			m==-in.n&&n==in.m||
			m==-in.m&&n==-in.n||
			m==in.n&&n==-in.m)
			return false;
		int a=m*in.m+n*in.n;
		int b=m*in.n-n*in.m;
		int mn=m*m+n*n;
		
		if(a%mn==0&&b%mn==0)
			return true;
		else
			return false;
	}
}

class Ginko
{
	int m;
	int n;
	Ginko(int m, int n)
	{
		this.m=m;
		this.n=n;
	}
}