import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();//PC数
			int M=in.nextInt();//学生数
			if((N|M)==0)
				return;
			int r=in.nextInt();//利用記録数
			ArrayList<int []>AL=new ArrayList<int[]>(); 
			boolean login[][]=new boolean[M+1][1261];
			for(int i=0;i<r;i++)
			{
				int t=in.nextInt();//時刻
				int n=in.nextInt();//PCn
				int m=in.nextInt();//学生m
				int s=in.nextInt();//log_in log_out
				if(s==1)
				{
					AL.add(new int[]{n,m,t});
				}
				else //log_out
				{
					int x=0;
					for(int j=0;j<AL.size();j++)
					{
						int y[]=AL.get(j);
						if(y[0]==n&&y[1]==m)
						{
							x=y[2];//log_in時間
							AL.remove(j);
							break;
						}
					}
					for(int j=x;j<t;j++)
						login[m][j]=true;
				}
			}
			int q=in.nextInt();
			for(int i=0;i<q;i++)
			{
				int ts=in.nextInt();
				int te=in.nextInt();
				int m=in.nextInt();
				int ans=0;
				
				for(int j=ts;j<te;j++)
					if(login[m][j])
						ans++;
				System.out.println(ans);
			}
		}
	}

	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}