
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int answer = 0;

		if (a + b > 24) {
			answer = (a + b) - 24;
		} else {
			answer = a + b;
		}
		System.out.println(answer);

	}

}