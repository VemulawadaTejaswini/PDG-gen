import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int[] A = new int[7];
		int n, a, b;
		
		for(int i = 0; i < 6; i++)
			A[i] = input.nextInt();

		n = input.nextInt();

		for( int i = 0; i < n; i++)
		{
			a = input.nextInt();
			b = input.nextInt();
			System.out.println(dice(a, b, A));
		}
	}

	private static int dice(int a, int b, int A[])
	{
		int ret = 0;
		if( a == A[0])
		{
			if( b == A[1])
				ret = A[2];
			else if( b == A[2])
				ret = A[4];
			else if( b == A[4])
				ret = A[3];
			else if( b == A[3])
				ret = A[1];
		}

		else if( a == A[1])
		{
			if( b == A[0])
				ret = A[3];
			else if( b == A[3])
				ret = A[5];
			else if( b == A[5])
				ret = A[2];
			else if( b == A[2])
				ret = A[0];
		}		

		else if( a == A[2])
		{
			if( b == A[0])
				ret = A[1];
			else if( b == A[1])
				ret = A[5];
			else if( b == A[5])
				ret = A[4];
			else if( b == A[4])
				ret = A[0];
		}		

		else if( a == A[3])
		{
			if( b == A[0])
				ret = A[4];
			else if( b == A[4])
				ret = A[5];
			else if( b == A[5])
				ret = A[1];
			else if( b == A[1])
				ret = A[0];
		}		

		else if( a == A[4])
		{
			if( b == A[0])
				ret = A[2];
			else if( b == A[2])
				ret = A[5];
			else if( b == A[5])
				ret = A[3];
			else if( b == A[3])
				ret = A[0];
		}		

		else if( a == A[5])
		{
			if( b == A[1])
				ret = A[3];
			else if( b == A[3])
				ret = A[4];
			else if( b == A[4])
				ret = A[2];
			else if( b == A[2])
				ret = A[1];
		}
		return ret;
	}		
}