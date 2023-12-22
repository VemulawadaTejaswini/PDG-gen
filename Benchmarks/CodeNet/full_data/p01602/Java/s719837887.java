import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Stack<String> S=new Stack<String>();
		for(int i=0;i<n;i++)
		{
			String str=in.next();
			int x=in.nextInt();
			for(int j=0;j<x;j++)
			{
				if(!S.empty()&&str.equals(")")&&S.peek().equals("("))
					S.pop();
				else
					S.push(str);
				//debug(S);
			}
		}
		System.out.println(S.empty() ? "YES":"NO");
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}