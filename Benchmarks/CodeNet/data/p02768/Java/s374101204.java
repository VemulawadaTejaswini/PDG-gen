import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		//int m = 1000000007;
		int ans = 0;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		int n = Integer.parseInt(substr[0]);
		int a = Integer.parseInt(substr[1]);
		int b = Integer.parseInt(substr[2]);

		for (int i = 1; i < n+1; i++) {
			if (i != a && i != b) {
				ans += f(n, i);
			}
		}
		scan.close();
		System.out.println(ans);
	}

	static public int f(int n, int m)
	{
		int ans = 1;
		int k = n;
		for (int i = 0; i < m; i++) {
			ans = ans * k;
			k--;
		}
		int ans2 = 1;
		for (int i = 1; i < m+1; i++) {
			ans2 = ans2 * i;
		}
		ans = ans / ans2;
		ans = ans % 1000000007;
		return ans;
	}
}
