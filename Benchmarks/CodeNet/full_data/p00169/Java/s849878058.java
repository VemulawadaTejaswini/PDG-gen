import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main 
{
	public static void main(String arg[])
	{
		Scanner in= new Scanner(System.in);
		while(in.hasNext())
		{
			String st[]=in.nextLine().split(" ");
			if(st[0]=="0")
				return;
			ArrayList<Integer> a=new ArrayList<Integer>();
			ArrayList<Integer> o=new ArrayList<Integer>();
			for(int i=0;i<st.length;i++)
			{
				if(st[i].equals("1"))
					o.add(Integer.valueOf(st[i]));
				else
					a.add(Integer.valueOf(st[i]));
			}	
			int sum=0;
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i)>=10)
					sum+=10;
				else
					sum+=a.get(i);
			}
			for(int i=0;i<o.size();i++)
				sum+=11;
			for(int i=0;i<o.size();i++)
			{
				if(sum>21)
				{
					sum-=10;
				}
				else
					break;
			}
			if(sum>21)
				sum=0;
			System.out.println(sum);
		}
	}
}