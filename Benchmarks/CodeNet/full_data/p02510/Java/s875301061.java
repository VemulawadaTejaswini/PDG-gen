import java.util.Scanner;

public class Main {

	public static String shuffle (String s, int h) {
		String s1 = s.substring(s.length() - h);
		String s2 = s.substring(0,s.length() - h);
		return s1 + s2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.next();
			if (s.equals("-")) break;
			int n = sc.nextInt();
			for (int i = 0; i < n; i++)
				s = shuffle(s, sc.nextInt());
			System.out.println(s);
		}

	}

}