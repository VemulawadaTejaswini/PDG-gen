import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int count = 0;
		int sum = 0;

		while(count < B) {
			count += A;
			sum++;
		}

		System.out.println(sum);
	}

}