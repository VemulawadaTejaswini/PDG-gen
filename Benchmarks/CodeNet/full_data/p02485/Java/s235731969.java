import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.nextLine();
			if (s.equals("0")) break;
			int sum = 0;
			char[] c = s.toCharArray();
			for (int i = 0; i < c.length; i++)
				sum += c[i] - '0';
			System.out.println(sum);
		}

	}

}