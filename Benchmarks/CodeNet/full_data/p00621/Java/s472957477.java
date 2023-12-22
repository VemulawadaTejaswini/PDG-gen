import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int m=in.nextInt();
			int field[]=new int[n];
			Arrays.fill(field, -1);
			if((n|m)==0)
				return;
			for(int i=0;i<m;i++)
			{
				String dir=in.next();
				if(dir.equals("s"))
				{
					int id=in.nextInt();
					int w=in.nextInt();
					boolean judge=false;
					for(int j=0;j<n;j++)
					{
						for(int k=j;k<j+w;k++)
						{
							if(k<n&&field[k]==-1)
								judge=true;
							else
							{
								judge=false;
								break;
							}
						}
						if(judge)
						{
							for(int k=j;k<j+w;k++)
								field[k]=id;
							System.out.println(j);
							break;
						}
					}
					if(!judge)
						System.out.println("impossible");
				}
				else
				{
					int away=in.nextInt();
					for(int j=0;j<n;j++)
						if(field[j]==away)
							field[j]=-1;
				}
			}
			System.out.println("END");
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}