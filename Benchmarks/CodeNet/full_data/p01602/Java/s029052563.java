package nofill_nosubmit;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			Stack<String> S=new Stack<String>();
			for(int i=0;i<n;i++)
			{
				String str=in.next();
				int x=in.nextInt();
				for(int j=0;j<x;j++)
					S.push(str);
			}
			for(int i=0;i<S.size();i++)
			{
				if(S.get(i).equals("("))
				{
					int j=i+1;
					boolean judge=false;
					while(j<S.size())
					{
						if(S.get(j).equals(")"))
						{
							judge=true;
							break;
						}
						j++;
					}
					if(judge)
					{
						S.remove(i);
						S.remove(j-1);
						i--;
					}
					else
						break;
				}
			}
			System.out.println(S.empty() ? "YES":"NO");
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}