import java.util.Scanner;

public class Main {

	static String solve(String n) {

		int num = 0;
		char[] cha = n.toCharArray();
		for (int i = 0; i < cha.length; i++) {
			num += cha[i] - 48;
		}
		if (num % 9 == 0)
			return "Yes";
		else
			return "No";
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String n = stdIn.next();
		String result = solve(n);
		System.out.println(result);

		stdIn.close();
	}
}
