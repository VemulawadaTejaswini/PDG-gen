import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans = "No";
		if ((b /4)<=a && (b/2)>=a && b %2==0) ans = "Yes";

		sc.close();
		System.out.println(ans);
	}
}
