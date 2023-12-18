import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final Scanner in = new Scanner(System.in);	
	public static int sort(int a[])
	{
		int count_oper1 = 0;
		int count_oper2 = -1;
		// oper 2
		while(count_oper2 != 0)
		{
			count_oper2 = 0;
			for(int i=0; i+2<a.length; i++)
			{
				if (a[i] > a[i+2])
				{
					reverseOper2(a, i);
					count_oper2++;
				}
			}
		}
		
		// oper 1
		int t_count_oper1 = -1;
		while (t_count_oper1 != 0)
		{
			t_count_oper1 = 0;
			for(int i=0; i+1<a.length; i++)
			{
				if (a[i] > a[i+1])
				{
					reverseOper1(a, i);
					count_oper1++;
					t_count_oper1++;
				}
			}			
		}		
		return count_oper1;
	}
	
	public static void reverseOper2(int a[], int i)
	{
		int t = a[i+2];
		a[i+2] = a[i];
		a[i] = t;
	}

	public static void reverseOper1(int a[], int i)
	{
		int t = a[i];
		a[i] = a[i+1];
		a[i+1] = t;
	}

	public static void main(String[] args) {
		int len = in.nextInt();
		int a[] = new int[len];
		for(int i=0; i<len; i++)
		{
			a[i] = in.nextInt();
		}
		System.out.print(sort(a));
	}
}