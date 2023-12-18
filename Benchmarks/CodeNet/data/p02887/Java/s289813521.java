import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();

		String ans = sc.nextLine();

		for(int i = 0; i<=a; i++)
		{
			if(ans.charAt(i) == ans.charAt(i+1))
				a--;
		}
		System.out.print(a);
	}
}