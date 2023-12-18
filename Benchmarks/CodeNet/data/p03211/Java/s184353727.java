import java.lang.reflect.Array;
import java.math.*;
import java.util.*;
public class Main
{
	static Scanner sc=new Scanner(System.in);
	static final int MAX=100000+5;
	public static void main(String[] args)
	{
		String s=sc.next();
		int MIN=1000000000;
		for(int i=0;i<s.length()-2;i++)
		{
			int tot=0;
			for(int j=0;j<3;j++)
				tot=tot*10+s.charAt(i+j)-'0';
			MIN=Math.min(Math.abs(tot-753), MIN);
		}
		System.out.println(MIN);
	}
}