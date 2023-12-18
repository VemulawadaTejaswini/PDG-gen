import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,sum=0;

		String s;
		char k;
		a = sc.nextInt();
		s = sc.next();
		b = sc.nextInt();
		

		k = s.charAt(b-1);

		
		for(int i=0;i<a;i++)
		{
			char t = s.charAt(i);
			if(t != k)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(k);
			}
		}
				
		
	}
}