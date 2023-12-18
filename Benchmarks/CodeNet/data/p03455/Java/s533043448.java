import java.util.*;
public class Main
{
	public static void main(String ar[])
	{
		Scanner ab=new Scanner(System.in);
		String a,b;
		a=ab.next();
		b=ab.next();
		a+=b;
		int i=Integer.valueOf(a);
		int c=(int)(Math.sqrt(i));
		if(c*c==i)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}