import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[] s = new int[111];
		int r = input.nextInt();
		int c = input.nextInt();
		int t, sum;
		for(int i = 0; i < r; i++)
		{
			sum = 0;
			for(int k = 0; k < c; k++)
			{
				t = input.nextInt();
				sum += t;
				s[k] += t;
				System.out.print(t + " ");
			}
			s[c] += sum;
			System.out.println(sum);
		}
		for(int i = 0; i < c; i++)
			System.out.print(s[i] + " ");
		System.out.println(s[c]);
	}
}