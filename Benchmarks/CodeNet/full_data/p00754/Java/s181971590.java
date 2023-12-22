import java.util.*;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			char ch[]=in.nextLine().toCharArray(); 
			if(ch[0]=='.')
				return;
			Stack<Character> st=new Stack<Character>();
			String ans="yes";
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='(')
					st.push(ch[i]);
				if(ch[i]=='[')
					st.push(ch[i]);
				if(ch[i]==')')
				{
					if(st.empty())
						ans="no";
					else if(st.get(st.size()-1)!='(')
						ans="no";
					else
						st.pop();
				}
				if(ch[i]==']')
				{
					if(st.empty())
						ans="no";
					else if(st.get(st.size()-1)!='[')
						ans="no";
					else
						st.pop();
				}
				if(ans.equals("no"))
					break;
			}
			System.out.println(ans);
		}
	}
}