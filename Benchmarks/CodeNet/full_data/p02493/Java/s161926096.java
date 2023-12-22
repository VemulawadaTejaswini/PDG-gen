import java.util.Scanner;
import java.util.Arrays; 

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str = sc.nextLine().split(" ");
		String[] result = new String[n];
		for(int i = 0; i < n; i++)
		{
			result[i] = str[(n - 1) - i] + " ";
		}
		System.out.println(Arrays.toString(result).trim());
	}
}