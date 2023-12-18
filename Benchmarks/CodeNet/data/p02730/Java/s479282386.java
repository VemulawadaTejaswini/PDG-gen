import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		int n = c.length;

		for (int i=0; i<(n-1)/4; i++) {
			if (c[i] != c[(n-1)/2-i-1]) {
				System.out.println("No");
				return;
			}
		}
		int j = 0;
		for (int i=(n+3)/2-1;i<n/4+3/4; i++ ) {
			if (c[i] != c[n-j]) {
				System.out.println("No");
				return;
			}
			j++;
		}
		String ans = "Yes";
		sc.close();
		System.out.println(ans);
	}
}
