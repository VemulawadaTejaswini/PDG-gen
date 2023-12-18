import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long X = Long.parseLong(sc.next());

		long yokin = 100;
		int counter = 0;
		while (!(yokin >= X)) {
			yokin *= 1.01;
			counter++;
		}

		System.out.println(counter);
	}
}