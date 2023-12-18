import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int pCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p')
				pCount++;
		}
		if (s.length() % 2 == 0)
			System.out.println(s.length() / 2 - pCount);
		else
			System.out.println(s.length() / 2 + 1 - pCount);

	}

}
