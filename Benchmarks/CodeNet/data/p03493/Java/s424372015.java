import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int counter = 0;

		while(scanner.hasNextInt()) {
			if(scanner.nextInt() == 1) {
				counter++;
			}
		}

		System.out.println(counter);

	}

}
