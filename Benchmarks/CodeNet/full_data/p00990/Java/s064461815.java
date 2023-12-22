import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	static int cnt,sum,m;
	static int a[];
	static char id[];
	static ArrayList<Integer>AL;
	public static void main(String[] arg)
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();//digit
			String str=in.next();
			AL=new ArrayList<Integer>();
			id=new char[str.length()];
			for(int i=str.length()-1;i>=0;i--)
				id[str.length()-i-1]=str.charAt(i);
			m=in.nextInt();
			a=new int[m];
			for(int i=0;i<m;i++)
				a[i]=in.nextInt();
			cnt=0;
			sum=0;
			for(int i=0;i<n;i++)
			{
				int num=0;
				if(Character.isDigit(id[i]))
				{
					num=id[i]-'0';
					if(i%2==1)
						num*=2;
					if(num>=10)
						num=num%10+num/10;
				}
				else
				{
					if(i%2==1)
						AL.add(1);
					else
						AL.add(0);
				}
				sum+=num;
			}
			//debug(id);
			dfs(0,sum);
			System.out.println(cnt);
		}
	}

	static void dfs(int index,int sum)
	{
		if(index==AL.size())
		{
			if(sum%10==0)
				cnt++;
		}
		else
		{
			for(int i=0;i<a.length;i++)
			{
				int num=a[i];
				if(AL.get(index)==1)
					num*=2;
				if(num>=10)
					num=num%10+num/10;
				dfs(index+1,sum+num);
			}
		}

	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}