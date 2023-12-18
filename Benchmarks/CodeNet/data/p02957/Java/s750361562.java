
import java.util.Scanner;
import java.lang.Long;
public class Main {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
	     
		long A = sc.nextInt();
		long B = sc.nextInt();
		
		int i=0;
		for(int a = 1;a<Long.MAX_VALUE;++a)
		{
		if(Math.abs(A-a)==Math.abs(B-a))
		{
			i = a;
			break;
		}
		}

		if(i>0)
		{
			System.out.println(i);
		}
		else
			System.out.println("IMPOSSIBLE");
	}
	}

