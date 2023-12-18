import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		String firstHalf = S.substring(0, N / 2);
		String reverseFirst = new StringBuffer(firstHalf).reverse().toString();

		String finalHalf = S.substring(N / 2 + 1);
		String reverseFinal = new StringBuffer(finalHalf).reverse().toString();

		//		System.out.println(firstHalf);
		//		System.out.println(finalHalf);
		//		System.out.println(reverseFirst);
		//		System.out.println(reverseFinal);

		if (firstHalf.equals(reverseFirst)
				&& finalHalf.equals(reverseFinal)
				&& firstHalf.equals(reverseFinal)
				&& finalHalf.equals(reverseFirst)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}