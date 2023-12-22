import java.util.*;
public class Main 
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			String t=in.nextLine();
			ArrayList<String> AL=new ArrayList<String>();
			if(n==0)
				return;
			for(int i=0;i<n;i++)
			{
				String s[]=in.nextLine().split(" ");
				for(int j=0;j<s.length;j++)
					AL.add(s[j]);
			}
			String se=in.next();
			for(int i=0;i<AL.size();i++)
				if(se.charAt(0)!=AL.get(i).charAt(0))
				{
					AL.remove(i);
					i--;
				}
			if(AL.isEmpty())
			{
				System.out.println("NA");
				continue;
			}
			Collections.sort(AL);
			int count[]=new int[AL.size()];
			for(int i=0;i<AL.size()-1;i++)
			{
				while(i+1<AL.size()&&AL.get(i).equals(AL.get(i+1)))
				{
					count[i]++;
					AL.remove(i);
				}
			}
			ArrayList<Integer> cou=new ArrayList<Integer>();
			for(int i=0;i<count.length;i++)
				cou.add(count[i]);

			ArrayList<String> ANS=new ArrayList<String>();
			while(!AL.isEmpty())
			{
				int m=0;
				for(int j=0;j<cou.size();j++)
				{
					if(cou.get(m)<cou.get(j))
						m=j;
				}
				ANS.add(AL.get(m));
				AL.remove(m);
				cou.remove(m);
			}
			int p=0;
			for(int i=0;i<ANS.size();i++)
			{
				if(p==0)
					System.out.print(ANS.get(i));
				else
					System.out.print(" "+ANS.get(i));
				if(i>3)
					break;
				p=1;
			}
			System.out.println();
		}
	}
}