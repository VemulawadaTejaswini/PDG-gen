import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();

		String ans = sc.nextLine();

		for(int i = 1; i<ans.length(); i++)
		{
			if(a == 1)
				break;
			if(ans.charAt(i) == ans.charAt(i-1))
				a--;
		}
		System.out.print(a);
	}
}