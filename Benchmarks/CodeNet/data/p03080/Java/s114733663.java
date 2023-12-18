import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();

		double rCount = 0;
		double half = (double) N/2;
		for (char c : S.toCharArray()) {
			if(c == 'R') {
				rCount++;
			}

			if(rCount > half) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
	}

}