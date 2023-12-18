import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		int ans = 0;
		if (a>=k) {
			ans = k;
		} else if (a+b>=k) {
			ans = a;
		} else {
			ans = a - (k-a-b);
		}
		sc.close();
		System.out.println(ans);
	}
}
