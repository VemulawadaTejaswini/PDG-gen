import java.util.HashSet;
import java.util.Scanner;
public class Main
{ 
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		while(N-->0)
		{
			String st=in.next();
			HashSet<String> hs=new HashSet<String>();
			hs.add(st);
			for(int i=1;i<st.length();i++)
			{
				String head=st.substring(0, i);
				String tail=st.substring(i,st.length());
				hs.add(head+re(tail));
				hs.add(re(head)+tail);
				hs.add(re(head)+re(tail));
				hs.add(tail+head);
				hs.add(re(tail)+head);
				hs.add(tail+re(head));
				hs.add(re(tail)+re(head));
			}
			System.out.println(hs.size());
		}
	}
	static String re(String st)
	{
		StringBuilder sb=new StringBuilder(st);
		return sb.reverse().toString();
	}
}