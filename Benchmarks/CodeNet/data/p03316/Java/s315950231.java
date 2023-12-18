import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumOfDigits = 0;
		while (n > 0) {
			sumOfDigits += n % 10;
			n /= 10;
		}
		String ans = n % sumOfDigits == 0 ? "Yes" : "No";
		System.out.println(ans);
	}

}
