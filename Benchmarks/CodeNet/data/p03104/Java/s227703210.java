import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		//long d = b - a;

		long ans = 0;

		for (long i = a; i <= b; i++) {
			ans ^= i;
		}

		System.out.println(ans);
		sc.close();
	}
}