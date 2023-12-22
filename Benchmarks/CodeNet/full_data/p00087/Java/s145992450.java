import java.util.Scanner;
import java.util.Stack;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String str[]=in.nextLine().split(" ");
			Stack <Double>sta=new Stack<Double>();
			for(int i=0;i<str.length;i++)
			{
				if(str[i].equals("+"))
				{
					double a=sta.pop();
					double b=sta.pop();
					sta.push(a+b);
				}
				else if(str[i].equals("-"))
				{
					double a=sta.pop();
					double b=sta.pop();
					sta.push(b-a);
				}
				else if(str[i].equals("*"))
				{
					double a=sta.pop();
					double b=sta.pop();
					sta.push(a*b);
				}
				else if(str[i].equals("/"))
				{
					double a=sta.pop();
					double b=sta.pop();
					sta.push(b/a);
				}
				else
					sta.push(Double.valueOf(str[i]));
			}
			System.out.printf("%.6f",sta.pop());
		}
	}
}