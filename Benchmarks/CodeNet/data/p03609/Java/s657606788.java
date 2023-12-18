import java.util.Scanner;

public class Qderangement
{
	static int[] A;
	
	static boolean isValid()
	{
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] == i + 1) return false;
		}
		return true;
	}
	
	public static void main(String[] Arguments)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		A = new int[N];
		for (int i = 0; i < N; i++)
		{
			A[i] = sc.nextInt();
		}
		int count = 0;
		while (!isValid())
		{
			if (A[0] == 1)
			{
				count++;
				int temp = A[1];
				A[1] = A[0];
				A[0] = temp;
			}
			for (int i = 1; i < A.length; i++)
			{
				if (A[i] == i + 1)
				{
					count++;
					int temp = A[i];
					A[i] = A[i - 1];
					A[i - 1] = temp;
				}
			}
		}
		System.out.println(count);
	}
}
