import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String st=in.next();
			int ans=0;
			int le1=0;
			int le2=0;
			int le3=0;
			for(int i=0;i<st.length();i++)
			{
				if(st.charAt(i)=='J'&&le2<1&&le3<1)
				{
					le1++;
				}
				else if(st.charAt(i)=='O'&&le1>0)
				{
					le2++;
				}
				else if(st.charAt(i)=='I'&&le2>0)
				{
					le3++;
				}
				else
				{
					le1=0;
					le2=0;
					le3=0;
				}
				if(le1>0&&le2>0&&le3>0)
				{
					ans=Math.max(ans, Math.min(le1, Math.min(le2, le3)));
				}
			}
			System.out.println(ans);
		}
	}
}