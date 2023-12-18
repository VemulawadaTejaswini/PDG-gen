import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner (System.in);
		double n,r,count;
		n=s1.nextDouble();
		r=s1.nextDouble();
		double m = (Math.log(n)/Math.log(r));
		count=(int)(Math.floor(m)+1);
		System.out.println(count);
	}
}