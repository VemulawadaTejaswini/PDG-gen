import java.util.*;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==-1)
				return;
			String str = "";
			while(true)
			{
				if(n==0)
					break;
					str=String.valueOf(n%4)+str;
				n/=4;
			}
			if(str.equals(""))
				str="0";
			System.out.println(str);
		}
	}
}