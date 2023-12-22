import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int total = 1;
		int max = scan.nextInt();
		for(int i = 0; i < max; i++)
		{
			total *= scan.nextInt();
		}
		
		if(total > Math.pow(10,  18))
		{
			System.out.println(-1);
		}
		else
			System.out.println(total);
	}
}
