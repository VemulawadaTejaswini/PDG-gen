import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		if(n < k) {
			System.out.println(1);
		}else {
			System.out.println(n%k);
		}


		scanner.close();
	}

}