import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int t[][][]=new int[24][60][60];
			int ans=0;
			for(int i=0;i<n;i++)
			{
				String st1[]=in.next().split(":");
				String st2[]=in.next().split(":");
				int h1=Integer.valueOf(st1[0]);
				int m1=Integer.valueOf(st1[1]);
				int s1=Integer.valueOf(st1[2]);
				int h2=Integer.valueOf(st2[0]);
				int m2=Integer.valueOf(st2[1]);
				int s2=Integer.valueOf(st2[2]);
				for(;;)
				{
					t[h1][m1][s1]++;
					ans=Math.max(ans, t[h1][m1][s1]);
					s1++;
					if(s1==60)
					{
						m1++;
						s1=0;
					}
					if(m1==60)
					{
						h1++;
						m1=0;
					}	
					if(h1==h2&&m1==m2&&s1==s2)
						break;
				}
			}			
			System.out.println(ans);
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}