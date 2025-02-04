import java.util.Scanner;
public class Main
{
	static int a[][];
	static int b[][];
	static int light[][];
	static int first[];
	static boolean judge;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		while(N-->0)
		{
			a=new int[10][10];
			b=new int[10][10];
			first=new int[10];
			judge=false;
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
				{
					int c=in.nextInt();
					a[i][j]=c;
					b[i][j]=c;
				}
			make(0,first);
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					if(j!=9)
						System.out.print(light[i][j]+" ");
					else
						System.out.println(light[i][j]);
				}
			}
		}
	}

	static void make(int n, int first[])//1行目の粒子通過パターンを前列挙
	{
		if(judge)
			return;
		if(n==10)
		{
			light=new int[10][10];
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
					a[i][j]=b[i][j];
			judge=solve(first,light,a);
			if(judge)
				return;
		}
		else
		{
			first[n]=0;
			make(n+1,first);
			if(judge)
				return;
			first[n]=1;
			make(n+1,first);
			if(judge)
				return;
		}
	}
	static boolean solve(int first[],int light[][],int a[][])
	{
		
		for(int i=0;i<10;i++)
		{
			if(first[i]==1)
			{
				light[0][i]=1;
				
				if(a[0][i]==1)
					a[0][i]=0;
				else
					a[0][i]=1;

				if(i+1<10&&a[0][i+1]==1)
					a[0][i+1]=0;
				else if(i+1<10)
					a[0][i+1]=1;

				if(i-1>=0&&a[0][i-1]==1)
					a[0][i-1]=0;
				else if(i-1>=10)
					a[0][i-1]=1;

				if(a[1][i]==1)
					a[1][i]=0;
				else
					a[1][i]=1;
			}
		}

		for(int i=0;i<9;i++)
			for(int j=0;j<10;j++)
			{
				if(a[i][j]==1)
				{
					light[i+1][j]=1;
					lightOn(i+1,j);
				}
			}
		
		for(int i=0;i<10;i++)//全部消えてるかチェック
		{
			for(int j=0;j<10;j++)
			{
				if(a[i][j]==0)
					judge=true;
				else
					judge=false;
				if(!judge)
					break;
			}
			if(!judge)
				break;
		}
		return judge;
	}

	static void lightOn(int i,int j) //粒子を通過させる　座標を含め5箇所を反転
	{
		if(a[i][j]==1)
			a[i][j]=0;
		else
			a[i][j]=1;

		if(j+1<10&&a[i][j+1]==1)
			a[i][j+1]=0;
		else if(j+1<10)
			a[i][j+1]=1;

		if(a[i-1][j]==1)
			a[i-1][j]=0;
		else
			a[i-1][j]=1;

		if(i+1<10&&a[i+1][j]==1)
			a[i+1][j]=0;
		else if(i+1<10)
			a[i+1][j]=1;

		if(j-1>=0&&a[i][j-1]==1)
			a[i][j-1]=0;
		else if(j-1>=0)
			a[i][j-1]=1;
	}
}