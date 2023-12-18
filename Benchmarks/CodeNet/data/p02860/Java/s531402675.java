import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String half = s.substring(0, n / 2);

		if (n % 2 == 0 && s.matches(half.concat(half))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}

}
