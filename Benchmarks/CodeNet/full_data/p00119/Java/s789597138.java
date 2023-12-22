import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int m=in.nextInt();
			int n=in.nextInt();
			boolean use[]=new boolean[m+1];
			int a[]=new int[n];
			int b[]=new int[n];
			LinkedList<Integer>LL=new LinkedList<Integer>();
			for(int i=0;i<n;i++)
			{
				int pre=in.nextInt();
				int afe=in.nextInt();
				a[i]=pre;
				b[i]=pre;
				if(!use[pre]&&!use[afe])
				{
					LL.add(pre);
					LL.add(afe);
					use[pre]=true;
					use[afe]=true;
				}
				else if(!use[pre]&&use[afe])
				{
					for(int j=0;j<LL.size();j++)
					{
						if(LL.get(j)==afe)
						{
							LL.add(j, pre);
							use[pre]=true;
							break;
						}
					}
				}
				else if(use[pre]&&!use[afe])
				{
					for(int j=0;j<LL.size();j++)
					{
						if(LL.get(j)==pre)
						{
							LL.add(j+1, afe);
							use[afe]=true;
							break;
						}
					}
				}
				else
				{
					boolean judge=false;
					boolean judge2=false;
					for(int j=0;j<LL.size();j++)
					{
						if(LL.get(j)==pre)
							judge=true;
						if(LL.get(j)==afe)
							if(judge)
								judge2=true;
					}
					if(!judge2)
					{
						for(int j=0;j<LL.size();j++)
							if(LL.get(j)==afe)
								LL.remove(j);
						for(int j=0;j<LL.size();j++)
							if(LL.get(j)==pre)
								LL.add(j+1, afe);
					}
				}
				//debug(LL);
			}
			for(int i=0;i<n;i++)
			{
				int pre=a[i];
				int afe=b[i];
				
				boolean judge=false;
				boolean judge2=false;
				for(int j=0;j<LL.size();j++)
				{
					if(LL.get(j)==pre)
						judge=true;
					if(LL.get(j)==afe)
						if(judge)
							judge2=true;
				}
				if(!judge2)
				{
					for(int j=0;j<LL.size();j++)
						if(LL.get(j)==afe)
							LL.remove(j);
					for(int j=0;j<LL.size();j++)
						if(LL.get(j)==pre)
							LL.add(j+1, afe);
				}
				//debug(LL);
			}
			for(int aa:LL)
				System.out.println(aa);
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}