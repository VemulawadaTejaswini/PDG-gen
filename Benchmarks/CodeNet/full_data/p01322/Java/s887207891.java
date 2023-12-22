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
			int ans=0;
			if((n|m)==0)
				return;
			String a[][]=new String[n][2];
			String b[]=new String[m];
			for(int i=0;i<n;i++)
			{
				a[i][0]=in.next();
				a[i][1]=in.next();
			}
			for(int i=0;i<m;i++)
				b[i]=in.next();
		
			for(int i=0;i<m;i++)
			{
				char ch[]=b[i].toCharArray();
				int cnt=0;
				for(int j=0;j<n;j++)
				{
					char re[]=a[j][0].toCharArray();
					boolean match=true;
					for(int k=0;k<re.length;k++)
					{
						if(re[k]=='*')
							continue;
						if(re[k]!=ch[k])
							match=false;
					}
					if(match)
						cnt=Math.max(cnt,Integer.valueOf(a[j][1]));
				}
				ans+=cnt;
			}
			System.out.println(ans);
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}