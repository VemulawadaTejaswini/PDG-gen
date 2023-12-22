import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		int max, min, sum, n, t;
		n = inp.nextInt();
		t = inp.nextInt();
		max = t;
		min = t;
		sum = t;
		for(int i = 1; i < n; i++)
		{
			t = inp.nextInt();
			if(t > max)max = t;
			if(t < min)min = t;
			sum += t;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}