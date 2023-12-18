import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int min = 1000;

		for (int i = 0; i < s.length() - 2; i++) {
			int num = Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753);
			if (num < min) min = num;
		}

		System.out.println(min);
		sc.close();
	}
}