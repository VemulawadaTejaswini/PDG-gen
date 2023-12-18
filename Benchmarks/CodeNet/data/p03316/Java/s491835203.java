import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		int result = N.chars().map(s -> Character.getNumericValue(s)).sum();
		
		if (result % Integer.parseInt(N) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
