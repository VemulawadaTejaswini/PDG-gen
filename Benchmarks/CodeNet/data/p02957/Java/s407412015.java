
import java.util.Scanner;

public class Main {

	public static void main(String[] agrs)
	{
		Scanner sc= new Scanner(System.in);
	     
		long A = sc.nextInt();
		long B = sc.nextInt();
		
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
		if(Math.abs(A-a)==Math.abs(B-a))
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
