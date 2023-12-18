import java.util.*;
 
public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int d=0,c=0;
		int a=sc.nextInt();
		if(a<1200)
		{System.out.println("ABC");}
		else if(a<2800)
		{System.out.println("ARC");}
		else
		{System.out.println("AGC");}
	}
}