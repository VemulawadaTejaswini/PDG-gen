import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		sc.close();
		for (int i=1; i<=n; i+=2) {
			if (numYaku8(i)) ans+=1;
		}
		System.out.println(ans);
	}

	private static boolean numYaku8(int n)
	{
		int yaku=0;
		for (int i=1; i<=n; i++) {
			if (n % i == 0) yaku+=1;
		}
		if (yaku == 8) return true;
		return false;
	}
}
