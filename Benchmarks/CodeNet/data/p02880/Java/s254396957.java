import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

	
		if(N >=1 && N<=81)
		{
			for(int i = 1; i<=9; i++)
			{
				if( (N%i) == 0 && (N/i) <= 9 )
				System.out.println("Yes");
			}
		}
		else
			System.out.println("No");
	}
}