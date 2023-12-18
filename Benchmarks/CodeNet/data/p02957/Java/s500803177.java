
import java.util.Scanner;

public class Main{

	public static void main(String[] agrs)
	{
		Scanner sc= new Scanner(System.in);
	     
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long max=A;
		long min=B;
		long m =0 ;
		if(max<min)
		{
			m = max;
			max = min;
			min = m;
		}
		for(long a = min;a<max;++a)
		{
		if((A-a)==-(B-a))
		{
			m = a;
			break;
		}
		}

		if(m>0)
		{
			System.out.println(m);
		}
		else
			System.out.println("IMPOSSIBLE");
	}

}
