import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int weekNum = sc.nextInt();

		int debt = 100000;
		int roundUpNum = 1000;

		for (int i = 0; i < weekNum; i++) {
			debt *= 1.05;

			debt = (int) Math.ceil((double) debt / roundUpNum) * roundUpNum;
		}
		System.out.println(debt);
	}
}