import java.util.*;

public class Main
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter number A: ");
		int A = sc.nextInt();

		System.out.print("Please enter number B: ");
		int B = sc.nextInt();

		if(A >= 1 && A <= 9)
		{
			if(B >= 1 && B <= 9)
			{
				int answer = A * B;
				System.out.println(answer);
			}

			else
				System.out.println("-1");
		}

		else
			System.out.println("-1");

	}
}