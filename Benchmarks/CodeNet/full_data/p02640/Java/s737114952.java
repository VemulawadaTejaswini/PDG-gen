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
		if (b>8) {
			int c = b%4;
			if (c %2 ==1) ans="No";
		}

		sc.close();
		System.out.println(ans);
	}
}
