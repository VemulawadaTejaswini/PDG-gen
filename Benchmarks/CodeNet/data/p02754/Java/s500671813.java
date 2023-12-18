import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		int n = Integer.parseInt(substr[0]);
		int a = Integer.parseInt(substr[1]);
		int b = Integer.parseInt(substr[2]);

		int c = a+b;
		int m = n % c;
		int s = n / c;
		int buf = 0;
		if (a != 0) {
			if (m > a) buf = a;
			if (a >= m) buf = m;
		}
		System.out.println(a * s + buf);
	}
}
