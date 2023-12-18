import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		//int digits = String.valueOf(n).length();

		int sum = 0;

		int m = n;
		while (m > 0) {
		    sum += m % 10;
		    m /= 10;
		}

		if(n % sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
