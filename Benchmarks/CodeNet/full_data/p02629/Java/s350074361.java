import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws Exception
	{
	  Scanner sc=new Scanner(System.in);
		Long n=sc.nextLong();
		List<Long> li=new ArrayList<Long>();
		Quadrillion(n);
		
		
	}
	public static void Quadrillion(Long n)
	{
		StringBuffer sb=new StringBuffer();
		while(n>0)
		{
			Long x=n%26;
			if(x==0)
			{
				sb.append('z');
				n=n/26-1;
			}
			else
			{
				sb.append((char)((x-1)+'a'));
				n=n/26;
			}
		}
		 System.out.println(sb.reverse());
	}

}
