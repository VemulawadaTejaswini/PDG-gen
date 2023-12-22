import java.util.Scanner;

public class Main {

	public static String shuffle (String s, int h) {
		String s1 = s.substring(h,s.length());
		String s2 = s.substring(0,h);
		return s1 + s2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.next();
			if (s.equals("-")) break;
			int n = sc.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++)
				sum += sc.nextInt();
			System.out.println(shuffle(s, sum % s.length()));
		}

	}

}