import java.util.Scanner;

public class Main
{
	static int bubbleSort(int A[], int n)
	{
		boolean flag = true;
		int ret = 0;
		while(flag)
		{
			flag = false;
			for (int j = n - 1; j > 0; j--)
			{
				if(A[j] < A[j - 1])
				{
					int temp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = temp;
					flag = true;
					++ret;
				}
			}
		}
		return ret;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			A[i] = sc.nextInt();
		}
		int ans = bubbleSort(A, n);
		for (int i = 0; i < n; i++)
		{
			System.out.print(A[i]);
			if(i < n -1)
			{
				System.out.print(" ");
			}
		}
		System.out.println("\n" + ans);
		sc.close();
	}
}
