import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			String f = Double.toString((double) a / b);
			int sum = 0;
			for (int i = f.indexOf(".") + 1; i < f.length() && i < f.indexOf(".") + n + 1; i++)
			{
				sum += f.charAt(i) - '0';
			}
			System.out.println(sum);
		}
	}
}