import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ans = 1;
		int a = sc.nextInt();
		if (a == 0 ) System.out.println(ans);
		int b = sc.nextInt();
		ans++;
		if (b == 0 ) System.out.println(ans);
		ans++;
		int c = sc.nextInt();
		if (c == 0 ) System.out.println(ans);
		ans++;
		int d = sc.nextInt();
		if (d == 0 ) System.out.println(ans);
		ans++;
		int e = sc.nextInt();
		if (e == 0 ) System.out.println(ans);


		sc.close();
	}
}
