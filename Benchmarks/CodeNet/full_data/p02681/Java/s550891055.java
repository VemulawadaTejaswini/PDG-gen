import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String t=in.nextLine();
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=t.charAt(i))
				flag=false;
		}
		System.out.println((flag?("Yes"):("No")));
	}
}