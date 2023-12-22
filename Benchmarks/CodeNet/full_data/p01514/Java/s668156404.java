import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int T=in.nextInt(),P=in.nextInt(),R=in.nextInt();
			if((T|P|R)==0)
				return;
			int team[]=new int[T+1];
			int id[]=new int[T+1];
			int wrong[][]=new int[T+1][P+1];
			int plob[][]=new int[T+1][P+1];
			int tim[][]=new int[T+1][P+1];
			int pena[]=new int[T+1];
			for(int i=0;i<R;i++)
			{
				int tiD=in.nextInt();
				int piD=in.nextInt();
				int time=in.nextInt();
				String messe=in.next();
				if(messe.equals("WRONG"))
					wrong[tiD][piD]++;
				else
				{
					plob[tiD][piD]=1;
					tim[tiD][piD]+=time+wrong[tiD][piD]*1200;
				}
			}
			for(int i=1;i<=T;i++)
				for(int j=1;j<=P;j++)
				{
					if(plob[i][j]==1)
						team[i]++;
					pena[i]+=tim[i][j];
					id[i]=i;
				}
			int max;
			for(int i=1;i<=T;i++)
			{
				max=i;
				for(int j=i;j<=T;j++)
				{
					if(team[max]<team[j])
						max=j;
					else if(team[max]==team[j])
					{
						if(pena[max]>pena[j])
							max=j;
						else if(team[max]==team[j])
						{
							if(id[max]>id[j])
								max=j;                        
						}
					}
				}
				int tmp1=team[i];
				int tmp2=pena[i];
				int tmp3=id[i];
				team[i]=team[max];
				pena[i]=pena[max];
				id[i]=id[max];
				team[max]=tmp1;
				pena[max]=tmp2;
				id[max]=tmp3;
			}
			for(int i=1;i<=T;i++)
				System.out.println(id[i]+" "+team[i]+" "+pena[i]);
		}
	}
}