import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long count = 0;
		long no = 0;
		long sum = 0;
		Scanner sc = new Scanner(System.in);
		count = sc.nextLong();
		no = sc.nextLong();
		sc.nextLine();
		for (long i = 0; i < count; i++) {
			long number = sc.nextLong();
			long numberCount = sc.nextLong();
			sc.nextLine();
			sum += numberCount;
			if (sum >= no) {
				System.out.println(number);
				break;
			}
		}
		sc.close();
	}
}